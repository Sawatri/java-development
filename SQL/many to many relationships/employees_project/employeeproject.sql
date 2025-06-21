CREATE DATABASE EMPLOYEES;

USE EMPLOYEES;
CREATE TABLE employee(
emp_id INT Primary Key auto_increment,
emp_name VARCHAR(50),
emp_salary bigint);

USE EMPLOYEES;
CREATE TABLE project(
project_id INT Primary Key auto_increment,
project_name VARCHAR(50),
role VARCHAR(50));

USE EMPLOYEES;
CREATE TABLE department(
dept_id INT Primary Key auto_increment,
dept_name VARCHAR(50));

USE EMPLOYEES;
CREATE TABLE employees_projects(
emp_id INT,
project_id INT,
FOREIGN KEY(emp_id) REFERENCES employee(emp_id),
FOREIGN KEY(project_id) REFERENCES project(project_id));