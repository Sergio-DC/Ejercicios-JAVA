SELECT posts.titulo, COUNT(*) num_etiquetas
FROM posts 
	INNER JOIN posts_etiquetas ON posts.id = posts_etiquetas.post_id
	INNER JOIN etiquetas ON etiquetas.id = posts_etiquetas.etiqueta_id
GROUP BY posts.id
ORDER BY num_etiquetas ASC
;


SELECT posts.titulo, GROUP_CONCAT(nombre_etiqueta)
FROM posts 
	INNER JOIN posts_etiquetas ON posts.id = posts_etiquetas.post_id
	INNER JOIN etiquetas ON etiquetas.id = posts_etiquetas.etiqueta_id
GROUP BY posts.id
;

SELECT *
FROM etiquetas
	LEFT JOIN posts_etiquetas ON 
		etiquetas.id = posts_etiquetas.etiqueta_id
	WHERE posts_etiquetas.etiqueta_id IS NULL
	;

