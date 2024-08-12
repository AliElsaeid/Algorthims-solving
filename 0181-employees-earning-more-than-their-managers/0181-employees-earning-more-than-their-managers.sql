# Write your MySQL query stateme
Select e1.name As Employee from Employee e1
Join Employee e2 on e1.managerId = e2.id
where e1.salary > e2.salary