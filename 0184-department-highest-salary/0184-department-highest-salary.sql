# Write your MySQL query statement below

Select D.name as Department , E.name as Employee ,E.Salary as Salary  From Employee as E
Inner Join Department as D on E.departmentId  = D.id
Where E.Salary =(
Select Max(Salary)
    From Employee
    where departmentId = E.departmentId

)
