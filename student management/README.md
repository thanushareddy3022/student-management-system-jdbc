# 🎓 Student Management System (JDBC)

## 📌 Project Overview

A console-based Student Management System developed using Java, JDBC, and MySQL.

The application allows users to manage student records through a menu-driven interface while demonstrating database connectivity, CRUD operations, SQL queries, and reporting features.

This project was built as part of my backend development learning journey to strengthen my understanding of Java-to-database integration using JDBC.

---

## 🚀 Features

### Student Operations

* Add Student
* View All Students
* Search Student by ID
* Update Student Details
* Delete Student Records

### Reports & Analytics

* Total Student Count
* Highest Marks Student
* Students Above a Given Marks Threshold
* Average Marks Calculation
* Department-wise Student Statistics

---

## 🛠️ Technologies Used

* Java
* JDBC
* MySQL
* SQL
* PreparedStatement
* OOP Concepts

---

## 📂 Project Structure

```text
Student-Management-System-JDBC
│
├── Student.java
├── DBConnection.java
├── StudentDAO.java
├── Main.java
├── database.sql
├── README.md
└── screenshots/
    ├── add-student.png
    ├── search-student.png
    ├── view-students.png
    ├── top-student.png
    └── department-wise-count.png
```

---

## 🗄️ Database Schema

```sql
CREATE DATABASE student_management;

USE student_management;

CREATE TABLE students(
    id INT PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(100),
    marks INT
);
```

---

## 📊 SQL Concepts Implemented

* INSERT
* SELECT
* UPDATE
* DELETE
* WHERE Clause
* ORDER BY
* GROUP BY
* COUNT()
* AVG()
* LIMIT

---

## 🔒 JDBC Concepts Used

* DriverManager
* Connection
* PreparedStatement
* ResultSet
* SQL Exception Handling

---

## 🖥️ Sample Outputs

### ➕ Add Student

![Add Student](https://github.com/user-attachments/assets/931d7fba-4fd3-4c4d-9c49-89b65b685a50)

Demonstrates inserting new student records into the MySQL database using JDBC PreparedStatement.

---

### 🔍 Search Student

![Search Student](https://github.com/user-attachments/assets/4eaab25b-2159-4744-900a-86ccfe479000)

Searches and displays a student's details using their unique ID.

---

### 📋 View Students

![View Students](https://github.com/user-attachments/assets/1b409589-b698-408d-b241-523b07d5daad)

Displays all student records stored in the database.

---

### 🏆 Top Student

![Top Student](https://github.com/user-attachments/assets/c16e90c1-a146-4144-b77d-0107d7726ae5)



Retrieves the student with the highest marks using SQL sorting and filtering.

---

### 📊 Department-wise Student Count

![Department Wise Student Count](https://github.com/user-attachments/assets/a8849c1e-18de-47f5-9b34-26acb2566873)


Uses SQL GROUP BY and COUNT functions to generate department-level statistics.

---

## 🎯 Learning Outcomes

Through this project, I learned:

* Database connectivity using JDBC
* CRUD operations with MySQL
* SQL query execution from Java
* PreparedStatement usage
* ResultSet processing
* Basic project structuring
* Building menu-driven console applications
* Writing aggregate SQL queries and reports

---

## 👨‍💻 Author

**Thanusha Mysore**

GitHub: [https://github.com/thanushareddy3022]
