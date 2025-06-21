CREATE DATABASE AUTHORBOOK;

SELECT * FROM AUTHORBOOK.author;

USE AUTHORBOOK;
CREATE TABLE author(
author_id INT Primary Key auto_increment,
author_name VARCHAR(50));

INSERT INTO author(author_name)
VALUES
("Thomas H.Cormen"),
("Bjarne Stroustrup"),
("James Gosline");

