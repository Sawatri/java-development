SELECT * FROM unidept.department;

CREATE TABLE department(
dept_id INT Primary Key,
uni_id INT,
dept_name VARCHAR(50),
FOREIGN KEY(uni_id) REFERENCES university(uni_id) );

SELECT u.uni_name, d.dept_name
FROM university u 
join department d where u.uni_id=d.uni_id;

INSERT INTO department(dept_id, uni_id, dept_name)
VALUES
(1, 1, "Computer Science"),
(2, 3, "AI"),
(3, 1, "IT"),
(4, 2, "AI"),
(5, 3, "Software"),
(6, 4, "Data Analytics"),
(7, 2, "IT"),
(8, 2, "Software");