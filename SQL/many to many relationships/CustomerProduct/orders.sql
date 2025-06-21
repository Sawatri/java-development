SELECT * FROM ordersales.orders;

ALTER TABLE orders add column cus_id INT;
ALTER TABLE orders
ADD FOREIGN KEY (cus_id) references customer(cus_id);

INSERT INTO orders(cus_id, order_date)
VALUES
(2, '2025-06-17'),
(1, '2025-06-18'),
(3, '2025-06-19'),
(1, '2025-06-20'),
(4, '2025-06-22');


DROP TABLE orders;