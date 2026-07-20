# Write your MySQL query statement below
select p.project_id,Round(Sum(e.experience_years)*1.0/Count(p.employee_id),2) as average_years
from project p
inner join employee e
on p.employee_id=e.employee_id
group by p.project_id
order by p.project_id asc;