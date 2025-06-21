SELECT * FROM catprod.products;

USE CATPROD;
CREATE TABLE products(
product_id INT Primary Key,
category_id INT,
product_name VARCHAR(50),
FOREIGN KEY(category_id) REFERENCES category(category_id));

SELECT p.product_name, c.category_name
FROM products p
join category c where p.category_id=c.category_id;

SELECT p.product_name
FROM products p
where p.category_id=1;

INSERT INTO products(product_id, category_id, product_name)
VALUES
(1, 1, "Dresses"),
(2, 2, "SmartPhones"),
(3, 2, "Laptop"),
(4, 3, "Chairs"),
(5, 2, "Headphones"),
(6, 1, "Shirts");
