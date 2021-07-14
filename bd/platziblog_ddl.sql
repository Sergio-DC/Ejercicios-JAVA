CREATE TABLE categorias (
	id INTEGER NOT NULL,
	categoria VARCHAR(30) NOT NULL,
	PRIMARY KEY(ID)
);

CREATE TABLE etiquetas (
	id INTEGER NOT NULL PRIMARY KEY,
	nombre_etiqueta VARCHAR(30)
);

CREATE TABLE usuarios (
	id INTEGER NOT NULL PRIMARY KEY,
	login VARCHAR(30) NOT NULL,
	password VARCHAR(32) NOT NULL,
	nickname VARCHAR(40) NOT NULL,
	email VARCHAR(40) NOT NULL UNIQUE
);

/*Modify the user id*/
ALTER TABLE usuarios MODIFY id INT NOT NULL AUTO_INCREMENT;


CREATE TABLE posts (
	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	titulo VARCHAR(150) NOT NULL,
	fecha_publicacion TIMESTAMP,
	contenido TEXT NOT NULL,
	estatus CHAR(8) DEFAULT 'activo',
	usuarios_id INTEGER NOT NULL,
	categorias_id INTEGER NOT NULL,
	FOREIGN KEY (usuarios_id) REFERENCES usuarios(id),
	FOREIGN KEY(categorias_id) REFERENCES categorias(id)
);

CREATE TABLE etiquetas (
	id INTEGER PRIMARY KEY,
	nombre_etiqueta VARCHAR(30)
);

CREATE TABLE comentarios (
	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	comentario TEXT NOT NULL,
	usuarios_id INTEGER NOT NULL,
	posts_id INTEGER NOT NULL,
	FOREIGN KEY(usuarios_id) REFERENCES usuarios(id),
	FOREIGN KEY(posts_id) REFERENCES posts(id)
);

CREATE TABLE posts_etiquetas (
	post_id INTEGER AUTO_INCREMENT,
	etiqueta_id INTEGER,
	PRIMARY KEY(post_id, etiqueta_id),
	FOREIGN KEY(post_id) REFERENCES posts(id),
	FOREIGN KEY(etiqueta_id) REFERENCES etiquetas(id)
);
