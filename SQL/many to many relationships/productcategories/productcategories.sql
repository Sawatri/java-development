SELECT * FROM productcategories.productcategories;

INSERT INTO productcategories VALUES(1,1);

SELECT p.product_name, p.product_id, cat.category_name, cat.category_id, c.company_name
FROM product p 
inner join productcategories pc on pc.product_id=p.product_id
inner join categories cat on pc.category_id=cat.category_id
inner join company c on c.company_id=p.company_id; 

SELECT p.product_name, cat.category_id, c.company_name
FROM product p
inner join categories cat on p.product_id=cat.category_id
inner join company c on c.company_id=p.company_id
where company_name="SAMSUNG";

