CREATE VIEW v_brasil_customers AS
	SELECT customer_name, contact_name
	FROM customers
	WHERE country = "Brasil";
/*Consume the View*/
SELECT * FROM v_brasil_customers;

ALTER TABLE people
ADD date_of_birth date;

ALTER TABLE people
ALTER COLUMN date_of_birth year;

ALTER TABLE people
DROP COLUMN date_of_birth;
