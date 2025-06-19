SELECT * FROM library_management_system.department;

USE library_management_system;
CREATE TABLE department(
dept_id INT primary key auto_increment,
dept_name VARCHAR(50),
dept_code INT);