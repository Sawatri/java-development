CREATE DATABASE EMPLOYEE;

USE EMPLOYEE;
CREATE TABLE employee(
employee_id INT PRIMARY KEY auto_increment,
employee_name VARCHAR(255),
employee_salary INT
);

INSERT INTO employee(employee_name, employee_salary)
VALUES('Yasir', 12000),
('Ahmed', 15000),
('Shahid', 19000),
('Adil', 12000),
('Bilal', 21000),
('Manzar', 25000),
('Atif', 13000),
('Anwar', 25000),
('Ali', 20000),
('Hammad', 24000);

drop table employee;

alter table employee drop column age;
alter table employee add column employee_age int;
alter table employee add column department varchar(255);

update employee set employee_age=23, department="Computer Science" where employee_id=1;
update employee set employee_age=21, employee_salary=17000, department="Software Engineering" where employee_id=2;
SET SQL_SAFE_UPDATES =0;
update employee set employee_age=22, department="Software Engineering" where employee_salary=19000;
update employee set employee_age=24, department="Software Engineering" where employee_id=4;
update employee set employee_age=20, department="Data Engineering" where employee_id=5;
update employee set employee_age=25, department="Data Analyst" where employee_name='Manzar';
update employee set employee_age=21, department="Comptuer Science" where employee_id=7;
update employee set employee_age=26, department="Computer Software" where employee_id=8;
update employee set employee_age=25, department="Software Engineering" where employee_id=9;
update employee set employee_age=29, department="Software Engineering" where employee_id=10;

Select * From employee where department like "Computer%";
Select * From employee where department like "%Science";
Select * From employee where department like "%Software%";
Select * From employee where employee_name like "%m%";
Select employee_name like "d%" From employee;

SELECT employee_name, employee_age FROM employee;
SELECT * FROM EMPLOYEE.employee;
truncate employee;




