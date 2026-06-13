# Write your MySQL query statement below
/*here we need to select manager such that they have atlet 5 employee that are 
reporting  to them
perform self join and do operation
here e --> employee 
m--> manager
*/
select m.name
from employee e 
inner join employee m
on e.managerId=m.id
group by m.id
having Count(e.managerId)>=5;

