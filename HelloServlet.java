package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.Context;

public class HelloServlet extends HttpServlet {

    public static void main(String[] args) throws Exception {

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080); // Port number
        tomcat.getConnector(); // Required

        Context context = tomcat.addContext("", null);

        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
        context.addServletMappingDecoded("/", "HelloServlet");

        tomcat.start();
        System.out.println("Server started at http://localhost:8080");
        tomcat.getServer().await();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Hello Paone 👋</h1>");
        out.println("<h2>Your Maven Web App is Running!</h2>");
    }
}
