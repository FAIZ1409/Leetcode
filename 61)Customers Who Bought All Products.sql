/* Write your T-SQL query statement below */
WITH product_count as(select customer_id,count(distinct product_key)as p_count from customer group by customer_id),intr_tbl as(select count(product_key)as cnt from product) select customer_id from product_count where p_count=(select cnt from intr_tbl)
