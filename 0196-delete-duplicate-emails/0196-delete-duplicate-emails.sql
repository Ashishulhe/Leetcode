# Write your MySQL query statement below
delete e2
from person e1
join person e2
on e1.email=e2.email
and e2.id>e1.id;
