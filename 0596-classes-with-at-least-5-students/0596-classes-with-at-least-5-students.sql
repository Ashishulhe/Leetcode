# Write your MySQL query statement below
select C.class
from Courses c
Group by c.class
having Count(c.student)>=5;
