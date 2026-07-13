# Write your MySQL query statement below
-- first we ned to find how may product are their in product table
-- select count(product_id)
-- from Product

select customer_id 
from Customer 
group by Customer_id
having count(distinct product_key) =(select count(product_key)
from Product);
