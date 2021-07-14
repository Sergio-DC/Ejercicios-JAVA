SELECT city, count(*) AS total
FROM people
WHERE active = true
GROUP BY city
ORDER BY total DESC
HAVING total >= 2;

SELECT titulo AS encabezado, fecha_publicacion AS publicado_en, estatus AS estado
FROM posts;

SELECT count(*) AS numero_posts
FROM posts;
