SELECT * FROM ordersales.orderitems;

INSERT INTO orderItems VALUES(5,4);

SELECT c.customer_name, c.contact_no, c.address, o.order_id, o.order_date, p.product_name, p.price
FROM customer c
inner join orders o on c.cus_id=o.cus_id
inner join orderitems oi on oi.order_id=o.order_id
inner join products p on p.product_id=oi.product_id;
