# Rest API building with Spring Boot 🚀

Welcome to my learning notes for Spring Boot based on the [Devtiro YouTube tutorial](https://www.youtube.com/watch?v=Nv2DERaMx-4). This README serves as my dev journal — covering key concepts, commands, and code snippets for quick reference and revision.

---

## 📚 Index

1. [Quickstart with Spring Initializr](#1-quickstart-with-spring-initializr)
2. [Maven Basics](#2-maven-basics)
3. [Spring Framework & Boot](#3-spring-framework--boot)
4. [Dependency Injection](#4-dependency-injection)
5. [Configuration](#5-configuration)
6. [Databases Part 1 - Basics](#6-databases-part-1---basics)
7. [Databases Part 2 - Spring JDBC](#7-databases-part-2---spring-jdbc)
8. [Databases Part 3 - Spring Data JPA](#8-databases-part-3---spring-data-jpa)
9. [Jackson & JSON](#9-jackson--json)
10. [Building a REST API](#10-building-a-rest-api)
11. [Deployment to AWS LightSail](#11-deployment-to-aws-lightsail)

---

## 1. Quickstart with Spring Initializr

### 📌 What is Spring Initializr?

Spring Initializr is an online tool provided by Spring to generate a base project structure for Spring Boot applications. It saves you from manually setting up folders, dependencies, and build files.

🔗 Link: [https://start.spring.io](https://start.spring.io)

---

### 🛠️ Steps to Create a New Project

1. **Go to**: [start.spring.io](https://start.spring.io)
2. **Project**: Maven (or Gradle)
3. **Language**: Java
4. **Spring Boot Version**: Choose stable (e.g. 3.2.x)
5. **Project Metadata**:
    - Group: `com.example`
    - Artifact: `my-springboot-app`
    - Name: `MySpringBootApp`
    - Package name: `com.example.myspringbootapp`
6. **Packaging**: Jar
7. **Java Version**: Choose according to your JDK (17 or 21)
8. **Dependencies**:
    - Spring Web
    - Spring Boot DevTools (optional, for live reload)
    - Spring Data JPA (later for DB)
    - H2 Database or MySQL Driver (later for DB)

9. Click **Generate** to download the ZIP.
10. Extract and **open in IntelliJ / VS Code / Eclipse**.

---

### 📁 Project Structure Overview

```plaintext
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/myspringbootapp/
│   │   │       └── MySpringBootAppApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   │       └── templates/
│
├── pom.xml
└── README.md
```

🧪 Run the App
If using IntelliJ:

Right-click on MySpringBootAppApplication.java > Run

Or run from terminal:
```bash
./mvnw spring-boot:run
```

Visit http://localhost:8080 — empty for now, but app is live!

---

## 2. Maven Basics

Maven is the **build tool** used in most Spring Boot projects. It handles:

- Project dependencies (`pom.xml`)
- Building and packaging the app
- Running the app
- Generating reports, etc.

---

### 🧰 What is `mvnw`?

- `mvnw` stands for **Maven Wrapper**.
- Allows you to run Maven **without installing it globally**.
- Ensures your project uses the correct Maven version.

✅ Use this instead of `mvn`:
```bash
./mvnw <command>       # Unix/macOS
mvnw <command>         # Windows
```

### ⚙️ Common Maven Commands

| Command                 | Description                              |
|------------------------|------------------------------------------|
| `./mvnw clean`         | Cleans the `/target` directory           |
| `./mvnw package`       | Builds the app & creates a `.jar` file   |
| `./mvnw install`       | Builds & installs the app to local repo  |
| `./mvnw verify`        | Runs all checks/tests before build       |
| `./mvnw site`          | Generates an HTML project site           |
| `./mvnw spring-boot:run` | Runs your Spring Boot app (via plugin) |

---

## 3. Spring Framework & Boot

---

### 3.1 Spring Framework vs Spring Boot

| Feature                | Spring Framework                           | Spring Boot                                      |
|------------------------|---------------------------------------------|--------------------------------------------------|
| **Setup**             | Manual setup, lots of XML or Java config   | Auto-configured, minimal setup                   |
| **Dependency Handling** | You manage everything via `pom.xml`       | Smart defaults & starter dependencies            |
| **Web Server**         | Requires external server (Tomcat, Jetty)  | Embedded server (Tomcat by default)              |
| **Boilerplate Code**   | High                                       | Minimal                                           |
| **Learning Curve**     | Steep                                      | Easier for beginners                             |

✅ Spring Boot is built **on top of** Spring Framework, and it simplifies development by handling the tedious parts for you.

---

### 3.2 Spring Application Layers

Spring encourages a **layered architecture** for building maintainable applications:

<img src="https://files.codingninjas.in/article_images/spring-boot-architecture-0-1640757816.webp">

**How they work:**
- The **Controller** delegates to the **Service**.
- The **Service** talks to the **Repository**.
- Each layer is loosely coupled and testable.

📌 Annotations you'll see:
- `@RestController` – for the Controller layer
- `@Service` – for the Service layer
- `@Repository` – for the Repository/DAO layer

---

### 3.3 Modularity

Modularity means **separating concerns** into focused, reusable units.

✅ In Spring Boot:
- Each class handles one specific responsibility.
- The structure supports **clean code** & **independent testing**.

🧱 You can also create **separate packages or modules** for:
- Authentication
- Payments
- User Profiles
- etc.

> Think of your app as a group of LEGO blocks 🧱 — easy to build, easy to modify.

---




