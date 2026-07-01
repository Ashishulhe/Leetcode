# Write your MySQL query statement below

select Max(Mx.num) as num
from
(select num
from MyNumbers
group by num
having count(num)=1
) as Mx;
