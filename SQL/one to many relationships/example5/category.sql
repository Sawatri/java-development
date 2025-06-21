CREATE DATABASE CATPROD;

SELECT * FROM CATPROD.category;

USE CATPROD;
CREATE TABLE category(
category_id INT Primary Key auto_increment,
category_name VARCHAR(50));

INSERT INTO category(category_name)
VALUES
("Fashion"),
("Electronics"),
("Home Goods");



