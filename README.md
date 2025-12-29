# Crop-Information-Management-System
Crop Information Management System is a Spring Boot–based web application developed for MCA academics. It performs CRUD operations to manage crop details like name, type, season, and price using Spring Data JPA, Thymeleaf, and MySQL, providing a simple and user-friendly interface.

# 🌾 Crop Information Management System

A simple Spring Boot–based web application to manage agricultural crop information using CRUD operations (Create, Read, Update, Delete).

This project is developed as part of the **MCA curriculum** to demonstrate backend development using Spring Boot, Spring Data JPA, Thymeleaf, and MySQL.

---

## 📌 Features

- Add new crop details
- View all crops in tabular format
- Edit existing crop information
- Delete crop records
- User-friendly web interface using Thymeleaf
- Persistent storage using MySQL database

---

## 🛠️ Technologies Used

- **Java** (JDK 21)
- **Spring Boot**
- **Spring Data JPA**
- **Thymeleaf**
- **MySQL**
- **Maven**
- **HTML & CSS**

---

## 📂 Project Modules

- **Model** – Crop entity with attributes
- **Repository** – JPA repository for database operations
- **Controller** – Handles HTTP requests and responses
- **View** – Thymeleaf templates for UI
- **Configuration** – Database and server configuration

---

## 🗂️ Project Structure

Crop-Information-Management-System
│
├── src
│ ├── main
│ │ ├── java
│ │ │ └── com.example.agriculture
│ │ │ ├── AgricultureApplication.java
│ │ │ ├── controller
│ │ │ │ └── CropController.java
│ │ │ ├── model
│ │ │ │ └── Crop.java
│ │ │ └── repository
│ │ │ └── CropRepository.java
│ │ │
│ │ └── resources
│ │ ├── templates
│ │ │ ├── index.html
│ │ │ ├── add.html
│ │ │ └── edit.html
│ │ ├── static
│ │ └── application.properties
│ │
│ └── test
│ └── java
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md


---

## ⚙️ Database Configuration

Update the following in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/agriculturedb
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8082
spring.thymeleaf.cache=false

