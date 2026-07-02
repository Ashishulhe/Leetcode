# Write your MySQL query statement below
select s.name 
from salesPerson s
left join  orders o
on s.sales_id=o.sales_id
left join Company c
on c.com_id=o.com_id
group by s.sales_id,s.name
Having Sum(case when c.name='RED' then 1 else 0 end)=0;  
