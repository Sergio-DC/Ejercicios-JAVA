CREATE DATABASE mensaje_app;
USE mensajes_app;

CREATE TABLE mensajes (
	id_mensaje INTEGER PRIMARY KEY AUTO_INCREMENT,
	mensaje VARCHAR(280) ,
	autor_mensaje VARCHAR(50),
	fecha_mensaje TIMESTAMP
);
		
