SELECT c.nombre_categoria, COUNT(*) AS cantidad_posts
FROM categorias AS c
	INNER JOIN posts AS p
		ON p.categoria_id = c.id
GROUP BY c.id
ORDER BY catidad_posts DESC
LIMIT 1
;

SELECT u.nickname, COUNT(*) cantidad_posts
FROM usuarios AS u
	INNER JOIN posts AS p
		ON u.id = p.usuario_id
;

SELECT u.nickname, COUNT(*) cantidad_posts, GROUP_CONCAT(nombre_categoria)
FROM usuarios AS u
	INNER JOIN posts AS p
		ON p.usuario_id = u.id
	INNER JOIN categorias AS c
		ON c.id = p.categoria_id
GROUP BY u.id
ORDER BY cantidad_posts DESC
;

SELECT *
FROM usuarios AS u
	LEFT JOIN posts AS p
		ON u.id = p.usuario_id
WHERE p.usuario_id IS NULL
;
