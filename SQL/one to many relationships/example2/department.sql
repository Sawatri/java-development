CREATE DATABASE DEPTEMP;

SELECT * FROM deptemp.department;
USE DEPTEMP;
CREATE TABLE department(
dept_id INT Primary Key auto_increment,
dept_name VARCHAR(50));

INSERT INTO department(dept_name)
VALUES
("Marketing"),
("Sales");



