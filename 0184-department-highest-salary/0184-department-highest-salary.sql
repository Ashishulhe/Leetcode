# Write your MySQL query statement below

select d.name As Department,e.name as Employee,e.salary as Salary
from department d
inner join employee e
on d.id=e.departmentId
where(e.departmentId , e.salary)
In(
    select departmentId,Max(salary)
    from employee
    group by departmentId
);
