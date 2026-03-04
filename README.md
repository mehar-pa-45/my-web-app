# My Web App 🚀

A simple Java Maven Web Application using Embedded Tomcat.

This project demonstrates how to:
- Create a Maven project
- Use pom.xml
- Run an embedded Tomcat server
- Start a web application on port 8080
- Access it via browser

---

## 🛠 Technologies Used

- Java
- Maven
- Embedded Apache Tomcat
- Servlet API

---

## 📁 Project Structure

```
my-web-app/
│
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── example/
                    └── HelloServlet.java
```

---

## ⚙ Requirements

- Java 8 or higher
- Maven installed

Check versions:

```
java -version
mvn -version
```

---

## ▶ How to Run the Project

Step 1: Navigate to project folder

```
cd my-web-app
```

Step 2: Compile the project

```
mvn clean compile
```

Step 3: Run the application

```
mvn exec:java
```

---

## 🌐 Access the Application

Open browser and go to:

```
http://localhost:8080
```

You should see:

```
Hello 👋
Your Maven Web App is Running!
```

---

## 🔌 Port Configuration

The application runs on:

```
Port: 8080
```

You can change the port inside:

HelloServlet.java

```
tomcat.setPort(8080);
```

---

## 📌 Author

Paone

---

## 🎯 Future Improvements

- Add HTML pages
- Add Login system
- Convert to WAR project
- Deploy to external Tomcat server
- Dockerize the application

---

Happy Coding 🚀
