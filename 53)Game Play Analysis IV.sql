# Write your MySQL query statement below
select round(count(a.player_id)/(select count(distinct(player_id)) from Activity),2) as fraction from(
select player_id,event_date,first_value(event_date) over(partition by player_id order by event_date) as first_login from Activity) a where DATE_ADD(a.first_login,INTERVAL 1 DAY)=a.event_date;
