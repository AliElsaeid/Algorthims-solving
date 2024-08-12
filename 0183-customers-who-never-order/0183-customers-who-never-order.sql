# Write your MySQL query statement below



select name As Customers from Customers 
left join Orders on Customers.id = Orders.customerId 
where Orders.id is null


