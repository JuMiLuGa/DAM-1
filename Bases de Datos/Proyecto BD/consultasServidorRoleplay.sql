use ServidorRoleplay;

-- 1 Obtener el salario promedio de todos los trabajos:

SELECT CONCAT(FORMAT(AVG(salario), 2), ' €') AS salario_promedio
FROM trabajos;

-- 2 Obtener la cantidad de armas que tiene cada personaje:

SELECT p.nombreApellidos, COUNT(a.numSerie) AS cantidad_armas
FROM personajes p
LEFT JOIN armas a ON p.codPersonaje = a.codPersonaje
GROUP BY p.nombreApellidos;

-- 3 Obtener la cantidad de propiedades de cada tipo que tiene cada personaje:

SELECT p.nombreApellidos, tp.tipoPropiedad, COUNT(pr.codPropiedad) AS cantidad_propiedades
FROM personajes p
LEFT JOIN propiedades pr ON p.codPersonaje = pr.codPersonaje
LEFT JOIN (SELECT DISTINCT tipoPropiedad FROM propiedades) tp ON tp.tipoPropiedad = pr.tipoPropiedad
GROUP BY p.nombreApellidos, tp.tipoPropiedad;

-- 4 Obtener la cantidad de vehículos que tiene cada personaje, ordenados por cantidad de vehículos de forma descendente:

SELECT p.nombreApellidos, COUNT(v.matricula) AS cantidad_vehiculos
FROM personajes p
LEFT JOIN vehiculos v ON p.codPersonaje = v.codPersonaje
GROUP BY p.nombreApellidos
ORDER BY cantidad_vehiculos DESC;

-- 5 Obtener el modelo de coche más popular entre los personajes:

SELECT mc.modelo, COUNT(v.codModeloCoche) AS cantidad_vehiculos
FROM modCoches mc
LEFT JOIN vehiculos v ON mc.codModeloCoche = v.codModeloCoche
GROUP BY mc.modelo
ORDER BY cantidad_vehiculos DESC
LIMIT 1;

-- 6 Obtener la cantidad de propiedades por cada tipo de propiedad, ordenados por cantidad de propiedades de forma descendente:

SELECT tipoPropiedad, COUNT(codPropiedad) AS cantidad_propiedades
FROM propiedades
GROUP BY tipoPropiedad
ORDER BY cantidad_propiedades DESC;

-- 7 Obtener el salario máximo y mínimo de cada trabajo:

SELECT nombreTrabajo, CONCAT(MAX(salario), ' €') AS salario_maximo, CONCAT(MIN(salario), ' €') AS salario_minimo
FROM trabajos
GROUP BY nombreTrabajo;

-- 8 Obtener la cantidad de personajes que tienen al menos una propiedad:

SELECT COUNT(DISTINCT codPersonaje) AS cantidad_personajes
FROM propiedades;

-- 9 Obtener el promedio de edad de los personajes por raza:

SELECT raza, CONCAT(FLOOR(AVG(TIMESTAMPDIFF(YEAR,fechaNacimiento,NOW()))),' Años') AS promedio_edad
FROM personajes
GROUP BY raza;

-- 10 Obtener el salario promedio de los trabajos de los personajes de una raza determinada que tengan al menos una propiedad del tipo "CASA"

SELECT CONCAT(FORMAT(AVG(trabajos.salario), 2), ' €') AS salarioPromedioHumanos
FROM trabajos
JOIN personajes ON trabajos.codPersonaje = personajes.codPersonaje
JOIN propiedades ON personajes.codPersonaje = propiedades.codPersonaje
WHERE personajes.raza = 'Humano' AND propiedades.tipoPropiedad = 'CASA';

-- 11 Consulta que muestra el salario promedio de los trabajadores de cada trabajo:

SELECT nombreTrabajo, CONCAT(FORMAT(AVG(salario), 2),' €') as salarioPromedio
FROM trabajos
GROUP BY nombreTrabajo;

-- 12 Consulta que muestra los 5 trabajos mejor pagados para un sexo determinado:

SELECT t.nombreTrabajo, CONCAT(t.salario, ' €')
FROM trabajos t 
INNER JOIN personajes p ON t.codPersonaje = p.codPersonaje 
WHERE p.sexo = 'M' 
ORDER BY t.salario DESC 
LIMIT 5;

-- 13 Consulta que muestra la matrícula y modelo de los vehículos que pertenecen a un personaje con un determinado nombre:

SELECT vehiculos.matricula, modCoches.modelo
FROM vehiculos
JOIN modCoches ON vehiculos.codModeloCoche = modCoches.codModeloCoche
JOIN personajes ON vehiculos.codPersonaje = personajes.codPersonaje
WHERE personajes.nombreApellidos = 'Peregrin Took';

-- 14 Consulta que muestra el número de armas de cada modelo de arma, solo para aquellos modelos que tengan 3 o más de 3 armas:

SELECT modArmas.modelo, COUNT(*) as cantidadArmas
FROM armas
JOIN modArmas ON armas.codModeloArma = modArmas.codModeloArma
GROUP BY modArmas.modelo
HAVING COUNT(*) >= 3;

-- 15 Consulta que muestra el número de propiedades que tiene cada personaje, ordenados de mayor a menor cantidad:

SELECT personajes.nombreApellidos, COUNT(*) as cantidadPropiedades
FROM personajes
LEFT JOIN propiedades ON personajes.codPersonaje = propiedades.codPersonaje
GROUP BY personajes.nombreApellidos
ORDER BY cantidadPropiedades DESC;
