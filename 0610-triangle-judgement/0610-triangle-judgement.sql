# Write your MySQL query statement below
select x,y,z,
 Case
   when   ( ((x+y)>z) && ((x+z)>y) && ((y+z)>x) ) then 'Yes'
   else 'No'
 End as triangle
from Triangle;
