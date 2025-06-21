SELECT * FROM productcategories.product;

INSERT INTO product(product_name, price)
VALUES
("IPhone", 125000),
("SAMSUNG" ,85000),
("MacBook Laptop", 95000),
("SAMSUNG TV", 75000),
("Microwave OVEN", 45000);

ALTER TABLE product add column company_id INT;

ALTER TABLE product add FOREIGN KEY(company_id) REFERENCES company(company_id);

update product set company_id=1 where product_id=1;
update product set company_id=2 where product_id=2;
update product set company_id=1 where product_id=3;
update product set company_id=2 where product_id=4;
update product set company_id=2 where product_id=5; 

