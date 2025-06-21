SELECT * FROM employees.employees_projects;

INSERT INTO employees_projects VALUES(2,1);

SELECT emp_name, emp_salary, e.emp_id, p.project_name, p.role, p.project_id
FROM employee e
inner join employees_projects ep on e.emp_id = ep.emp_id
inner join project p on p.project_id = ep.project_id
inner join department d on d.dept_id = e.emp_id; 