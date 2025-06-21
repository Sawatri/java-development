CREATE DATABASE UNIDEPT;

SELECT * FROM UNIDEPT.university;

USE UNIDEPT;
CREATE TABLE university(
uni_id INT Primary Key auto_increment,
uni_name VARCHAR(50));

INSERT INTO university(uni_name)
VALUES
("UOS"),
("MUET"),
("SMUIT"),
("KU");

