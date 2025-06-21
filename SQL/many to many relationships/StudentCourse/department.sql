SELECT * FROM library_management_system.department;

USE library_management_system;
CREATE TABLE department(
dept_id INT primary key auto_increment,
dept_name VARCHAR(50),
dept_code INT);

INSERT INTO department(dept_name, dept_code)
VALUES
("Computer Science", 211),
("IT", 212),
("Software Engineering", 213),
("Data Science", 214);

