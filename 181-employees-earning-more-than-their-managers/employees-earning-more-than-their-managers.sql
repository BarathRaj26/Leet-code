# Write your MySQL query statement below

SELECT a.name AS "Employee"
FROM Employee a, Employee b
WHERE a.managerId = b.id
and a.salary > b.salary