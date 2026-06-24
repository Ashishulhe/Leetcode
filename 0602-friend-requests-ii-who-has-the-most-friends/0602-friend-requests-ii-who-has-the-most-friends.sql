# Write your MySQL query statement below
/*select rst.id,count(rst.id)as num
from 
(select requester_id as id 
from RequestAccepted

union all

select accepter_id as id 
from RequestAccepted
)as rst
group by rst.id
order by count(rst.id) desc
limit 1;*/

select rst.id,count(rst.id) as num
from
(
    select requester_id as id 
    from requestaccepted

    union all 

    select accepter_id 
    from requestaccepted
)as rst
group by  rst.id
order by count(rst.id) desc 
limit 1;




