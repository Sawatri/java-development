CREATE DATABASE LIBRARY_MANAGEMENT_SYSTEM;

USE LIBRARY_MANAGEMENT_SYSTEM;
CREATE TABLE books(
book_id int primary key auto_increment,
title varchar(255),
iban varchar(255),
price decimal (10,2)
);

INSERT INTO books(title, iban, price)
VALUES('Intro to Java', '123', 100),
('Intro to Python', '134', 200),
('JavaScript', '213', 250);

truncate TABLE books;

alter table books add column author varchar(255);
alter table books add column edition varchar(255);

update books set edition='4th' where book_id=1;
update books set author='John' where book_id=2;

SELECT * FROM LIBRARY_MANAGEMENT_SYSTEM.BOOKS;


delete from books where book_id=6;
