# Write your MySQL query statement below
select  distinct log.num as ConsecutiveNums
from(
    select id, num , 
    Lag(num,1,null) over(
    --    partition by id not neeeded cause unique create null values
        order by id
    ) as previous,
    Lead(num,1,null) over(
    --    partition by id not neeeded cause id  unique create null values
        order by id
    ) as next
    from logs
)log
where log.num=log.next and log.num=log.previous;
