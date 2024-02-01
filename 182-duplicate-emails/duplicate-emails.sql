# Write your MySQL query statement below
SELECT Email from Person GROUP BY email having count(email)>1;