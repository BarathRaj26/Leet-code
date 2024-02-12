SELECT name AS Customers
From Customers
LEFT JOIN Orders ON Customers.id=Orders.customerId
WHERE Orders.customerId IS NULL;
