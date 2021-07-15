/*INSERT*/
INSERT INTO people
(last_name, first_name, address, city)
VALUES
('Hernadéz', 'Laura', 'Calle 21', 'Monterrey');

/*UPDATE*/
UPDATE people
SET last_name = 'Chavez', city = 'Merida'
WHERE person_id = 1;

UPDATE people
SET first_name = 'Juan'
WHERE city = 'Merida';

UPDATE people
SET first_name = 'Juan'; /*Change the first_name of all the rows*/

/*DELETE*/
DELETE FROM people
WHERE person_id = 1;

DELETE FROM people; /*Delete all the rows of the table*/

/*SELECT*/
SELECT first_name, last_name
FROM people;
