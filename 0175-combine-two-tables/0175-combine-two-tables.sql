# Write your MySQL query statement below
SELECT p.firstName,p.lastName,a.city,a.state from Person p 
left join Address A on P.personId=A.personId;