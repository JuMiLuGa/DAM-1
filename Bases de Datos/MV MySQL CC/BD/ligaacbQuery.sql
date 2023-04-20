
use ligaacb;


/*FILTROS-ORDER BY*/
-- 1.1
select * from jugadores
where idEquipo = 3
order by apellido;

-- 1.2
SELECT nombre, apellido, idJugador
FROM jugadores
WHERE puesto = 'Pivot'
ORDER BY apellido;

-- 1.3
SELECT nombre, apellido
FROM jugadores
WHERE altura > 2 AND salario < 100000;

-- 1.4
SELECT *
FROM partidos
WHERE EXTRACT(MONTH FROM fecha) = 2;

-- 1.5
select * 
from jugadores
where idEquipo = 1 or idEquipo = 2 and salario>80000;

-- 1.6
SELECT *
FROM equipos
WHERE webOficial LIKE '%.com' OR webOficial LIKE '%.net';

/*FUNCIONES DE RESUMEN-GROUP BY-HAVING*/
-- 1.7
SELECT COUNT(*)
FROM `ligaACB`.`partidos`
WHERE MONTH(`fecha`) = 2;

-- 1.8
SELECT `idEquipo`, SUM(`altura`)
FROM `ligaACB`.`jugadores`
GROUP BY `idEquipo`;

-- 1.9
SELECT `idEquipo`, SUM(`salario`)
FROM `ligaACB`.`jugadores`
GROUP BY `idEquipo`
HAVING COUNT(*) > 3;

-- 1.10
SELECT COUNT(DISTINCT ciudad) FROM equipos;

-- 1.11
SELECT nombre, apellido FROM jugadores WHERE idJugador IN (SELECT idCapitan FROM equipos);

/*SUBCONSULTAS-ALL-ANY-EXISTS*/
-- 1.12
SELECT * FROM jugadores WHERE altura = (SELECT MAX(altura) FROM jugadores);
/*
-- 1.13
SELECT SUM(altura) 
FROM jugadores 
WHERE equipo IN ('CAI', 'Madrid');
*/
-- 1.14
SELECT DISTINCT equipo 
FROM partidos 
WHERE (equipo = 'Valencia' AND local = 'Casa') OR (equipo <> 'Valencia' AND visitante = 'Valencia');

-- 1.15
SELECT nombre, apellidos, altura 
FROM jugadores 
WHERE altura > (SELECT MAX(altura) FROM jugadores WHERE equipo = 'Caja Laboral');

-- 1.16
SELECT nombre, apellidos, salario 
FROM jugadores
WHERE salario = (SELECT MIN(salario) FROM jugadores) OR salario = (SELECT MAX(salario) FROM jugadores);

-- 1.17
SELECT * 
FROM partidos 
WHERE equipo IN (SELECT nombre FROM equipos WHERE web LIKE '%basket%');

/*CONSULTAS MULTITABLA*/
-- 1.18
SELECT j.nombre, e.nombre, j.puesto
FROM jugadores j 
JOIN equipos e ON j.equipo_id = e.id;

-- 1.19
SELECT e.*, COUNT(p.id) AS partidos_locales
FROM equipos e
JOIN partidos p ON e.id = p.equipo_local_id
GROUP BY e.id;

-- 1.20
SELECT e.*
FROM equipos e
JOIN jugadores j ON e.id = j.equipo_id
GROUP BY e.id
HAVING COUNT(j.id) >= 3;

-- 1.21
SELECT e.*, j.salario
FROM equipos e
JOIN jugadores j ON e.id = j.equipo_id
WHERE j.salario = (SELECT MAX(j2.salario) FROM jugadores j2 WHERE j2.equipo_id = e.id);

-- 1.22
SELECT e.nombre
FROM equipos e
JOIN partidos p ON e.id = p.equipo_local_id OR e.id = p.equipo_visitante_id
WHERE (p.puntos_local = 90 AND p.puntos_visitante = 91) OR (p.puntos_local = 91 AND p.puntos_visitante = 90);

-- 1.23
SELECT e.nombre, j.nombre
FROM equipos e
JOIN jugadores j ON e.capitan_id = j.id;

/*CONSULTAS VARIADAS*/
-- 1.24
SELECT *
FROM Jugadores
WHERE EquipoID NOT IN (SELECT EquipoID FROM Equipos WHERE Nombre IN ('Uno', 'Dos', 'Tres'));

-- 1.25
SELECT *
FROM Partidos
ORDER BY EquipoLocal, Fecha;

-- 1.26
SELECT Partidos.*, EquipoLocal.Nombre AS NombreEquipoLocal, EquipoVisitante.Nombre AS NombreEquipoVisitante, JugadoresLocal.Nombre AS NombreJugadorLocal, JugadoresVisitante.Nombre AS NombreJugadorVisitante
FROM Partidos
INNER JOIN Equipos AS EquipoLocal ON Partidos.EquipoLocal = EquipoLocal.EquipoID
INNER JOIN Equipos AS EquipoVisitante ON Partidos.EquipoVisitante = EquipoVisitante.EquipoID
INNER JOIN Jugadores AS JugadoresLocal ON Partidos.JugadorLocal = JugadoresLocal.JugadorID
INNER JOIN Jugadores AS JugadoresVisitante ON Partidos.JugadorVisitante = JugadoresVisitante.JugadorID
WHERE PartidoID = (SELECT MAX(PartidoID) FROM Partidos);

-- 1.27
SELECT *
FROM Equipos
WHERE EquipoID NOT IN (SELECT EquipoVisitante FROM Partidos);