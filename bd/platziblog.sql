CREATE DATABASE platziblog;
use platziblog;

CREATE TABLE people (
	person_id INT NOT NULL AUTO_INCREMENT,
	last_name VARCHAR(255) NULL,
	first_name VARCHAR(255) NULL,
	address VARCHAR(255) NULL,
	city varchar(255),
	PRIMARY KEY(person_id)
);
