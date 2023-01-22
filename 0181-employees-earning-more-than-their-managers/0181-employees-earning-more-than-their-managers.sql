# Write your MySQL query statement below
select s.Name as `Employee`
from `Employee` as s join `Employee` as b
on s.ManagerId = b.Id
and s.Salary > b.Salary