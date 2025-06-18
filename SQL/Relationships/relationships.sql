CREATE DATABASE RELATIONSHIPS;

USE RELATIONSHIPS;
CREATE TABLE people(
person_id int primary key auto_increment,
name varchar(255),
acc_number int);

INSERT INTO people (name, acc_number)
VALUES
('Ali', 12345678),
('Ahmed', 14356785),
('Bilal', 32453219),
('Usman', 13409867),
('Asif', 43215322);

SELECT * FROM Relationships.people;
