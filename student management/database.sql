CREATE DATABASE student_management;

USE student_management;

CREATE TABLE students(
    id INT PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(100),
    marks INT
);