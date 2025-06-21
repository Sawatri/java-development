SELECT * FROM deptemp.employee;

USE DEPTEMP;
CREATE TABLE employee(
emp_id INT Primary Key,
emp_name VARCHAR(50),
dept_id INT,
FOREIGN KEY(dept_id) REFERENCES department(dept_id));

INSERT INTO employee(emp_id, emp_name, dept_id)
VALUES
(1, "John", 1),
(2, "John", 2),
(3, "Smith", 1),
(4, "Jonas", 1),
(5, "Smith", 2);

SELECT e.emp_name, d.dept_name
FROM department d
join employee e where d.dept_id = e.dept_id;

SELECT e.emp_name, d.dept_id, d.dept_name
FROM department d
inner join employee e on d.dept_id=e.dept_id
where e.emp_name="John";

