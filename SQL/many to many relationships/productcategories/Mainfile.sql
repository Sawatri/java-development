CREATE DATABASE PRODUCTCATEGORIES;

USE PRODUCTCATEGORIES;
CREATE TABLE product(
product_id INT Primary Key auto_increment,
product_name VARCHAR(50),
price DECIMAL(10,2));

USE PRODUCTCATEGORIES;
CREATE TABLE categories(
category_id INT Primary Key auto_increment,
category_name VARCHAR(50));

USE PRODUCTCATEGORIES;
CREATE TABLE company(
company_id INT Primary Key auto_increment,
company_name VARCHAR(50));

USE PRODUCTCATEGORIES;
CREATE TABLE productCategories(
product_id INT,
category_id INT,
FOREIGN KEY(product_id) REFERENCES product(product_id),
FOREIGN KEY(category_id) REFERENCES categories(category_id));

