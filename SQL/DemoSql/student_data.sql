CREATE DATABASE STUDENT;

USE STUDENT;
CREATE TABLE student_data(
id int primary key auto_increment,
name varchar(255),
age int,
rollNumber varchar(255)
);

INSERT INTO student_data(name, age, rollNumber)
Values
('Asif', 22, '15CS43'),
('Ahmed', 21, '15CS45'),
('Munir', 24, '15CS46'),
("Yasir", 21, '15CS47'),
("Shehzad", 23, '15CS48'),
("Adil", 24, '15CS49'),
("Ali", 20, '15CS50'),
("Atif", 21, '15CS51'),
("Hamid", 23, '15CS52'),
("Bilal", 22, '15CS53');

alter table student_data add column year varchar(255);

update student_data set year='2nd year' where id=1;
update student_data set year='3rd year' where id=2;
update student_data set year='2nd year' where id=3;
update student_data set year= '3rd year' where name='Yasir';
update student_data set name ='Amir', age=24, rollNumber='15CS65' where id=2;
SET SQL_SAFE_UPDATES =0;
update student_data set year='2nd year' where rollNumber='15CS47';

delete from student_data where id=3;

truncate table student_data;
SELECT * FROM STUDENT.student_data;

drop table student_data;