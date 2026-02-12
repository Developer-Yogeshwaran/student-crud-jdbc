# 🎓 Student CRUD Application (Java + JDBC + MySQL)

A simple and efficient **Student Management System** built using **Java, JDBC, and MySQL**.  
This project demonstrates CRUD (Create, Read, Update, Delete) operations with database connectivity.

---

## 🚀 Project Overview

This application allows users to manage student records using a MySQL database.  
It performs all core database operations using JDBC.

This project was built to strengthen understanding of:
- JDBC connectivity
- SQL queries integration in Java
- Database operations
- Backend development fundamentals

---

## ✨ Features

- ➕ Add New Student  
- 📋 View All Students  
- 🔍 Search Student by ID  
- ✏️ Update Student Details  
- ❌ Delete Student  
- 🔗 MySQL Database Integration  

---

## 🛠️ Technologies Used

- Java (JDK 17)
- JDBC
- MySQL
- IntelliJ IDEA
- Git & GitHub

---

## 🗄️ Database Setup

### Step 1: Create Database

sql-
CREATE DATABASE student_db;
USE student_db;

Step 1:Create Database
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    course VARCHAR(100),
    marks DOUBLE
);
'''
---
⚙️ Configure JDBC Connection

Update your database credentials inside your project:

String url = "jdbc:mysql://localhost:3306/student_db";
String user = "root";
String password = "yourpassword";
'''
Make sure MySQL server is running before executing the project.
---
▶️ How to Run the Project
Clone the repository:
git clone (https://github.com/Developer-Yogeshwaran/student-crud-jdbc.git)
Open the project in IntelliJ IDEA
Add MySQL Connector (mysql-connector-j.jar) to project libraries
Run the Main.java file
'''
---
