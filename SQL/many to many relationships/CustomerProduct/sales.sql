SELECT * FROM ordersales.sales;

ALTER TABLE sales add column order_id INT;

ALTER TABLE sales
ADD FOREIGN KEY (order_id) references orders(order_id);

ALTER TABLE sales DROP column cus_id;

INSERT INTO sales(order_id, sales_date, total_amount)
VALUES
(1, '2025-06-17', 500 ),
(2, '2025-05-18', 600),
(3, '2025-06-19', 300),
(4, '2025-06-20', 350),
(5,'2025-06-22', 250);

TRUNCATE TABLE sales;