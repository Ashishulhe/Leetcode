# Write your MySQL query statement
select e.name As Employee
 from Employee e 
inner join 
Employee m
on e.managerId=m.id
where e.salary > m.salary;



/* here e if for employee 
 and m is for manager
 */