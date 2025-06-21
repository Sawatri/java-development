CREATE DATABASE ORDERSALES;
USE ORDERSALES;
CREATE TABLE customer(
cus_id INT Primary Key auto_increment,
customer_name VARCHAR(50),
contact_no INT,
address VARCHAR(50) );

USE ORDERSALES;
CREATE TABLE products(
product_id INT Primary key auto_increment,
product_name VARCHAR(50),
price float);

USE ORDERSALES;
CREATE TABLE orders(
order_id INT Primary key auto_increment,
order_date date );

USE ORDERSALES;
CREATE TABLE sales(
sales_id INT Primary key auto_increment,
sales_date DATE,
total_amount float);

USE ORDERSALES;
CREATE TABLE orderItems(
order_id INT,
product_id INT,
FOREIGN KEY (order_id) REFERENCES orders(order_id),
FOREIGN KEY (product_id) REFERENCES products(product_id));
