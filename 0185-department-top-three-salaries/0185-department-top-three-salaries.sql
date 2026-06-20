# Write your MySQL query statement below
/*first find top 3 salary in employee table*/
select d.name as Department, e.name as Employee, e.salary as Salary
from (
    select name,salary,departmentId,
    Dense_Rank() over(
        partition by departmentId
        order by salary desc
        
    )as rnk
    from employee
)e
join department d
on e.departmentId=d.id
where e.rnk<=3;




/*select d.name as Department,
    e.name as Employee ,
    e.salary as Salary
from (
    select name ,salary, departmentid,
    Dense_Rank() over(
        partition by departmentId
        order by salary desc
    )as rnk
    from employee
) e 
join department d
on e.departmentId=d.id
where e.rnk<=3;*/
