
use sakila;

--
-- Consultar la información sobre tablas de la base de datos ‘sakila’.
--

select table_name, table_type, engine
from information_schema.tables
where table_schema LIKE 'SAKILA'
order by table_name DESC;


--
-- Mostrar algunas de las tablas más relevantes del diccionario de datos.
--

show tables from INFORMATION_SCHEMA;


--
-- Describir informacion acerca de las bases de datos o esquemas alojadas en el servidor.
--

describe INFORMATION_SCHEMA.SCHEMATA;

--
-- Ejercicio 1
-- Consulta que muestre el nombre de las bases de datos cuyo nombre comienza por ‘s’.
--

SELECT SCHEMA_NAME AS 'database'
FROM information_schema.SCHEMATA
WHERE SCHEMA_NAME LIKE 's%';

--
-- La tabla ‘tables’ proporciona información sobre las tablas de las bases de datos
--

describe INFORMATION_SCHEMA.TABLES;

--
-- Ejercicio 2
-- Consulta que muestre toda la información de la tabla ‘actor’ de la BD ‘sakila’.
--

select *
from information_schema.tables
where table_schema LIKE 'SAKILA'
and table_name = 'actor';

--
-- Ejercicio 3
-- Consulta que muestre el nombre de todas las vistas de la BD ‘sakila’.
--

SELECT table_name
FROM information_schema.views
WHERE table_schema = 'SAKILA';

--
-- La tabla ‘columns’ proporciona información sobre las columnas de las tablas.
--

describe information_schema.columns;

--
-- Ejercicio 4
-- Consulta que muestre el número de campos de la tabla ‘actor’ de la BD ‘sakila’.
--

SELECT count(*) as 'numColumnas'
FROM information_schema.columns
WHERE table_schema = 'SAKILA'
and table_name = 'actor';

--
-- Ejercicio 5
-- Consulta que muestre el nombre, posición y tipo de dato del campo clave-primaria de la tabla 
-- ‘actor’ de la BD ‘sakila’.
--

SELECT column_name as nombre, ordinal_position as pos, data_type as tipo
FROM information_schema.columns
WHERE table_schema = 'SAKILA'
AND table_name = 'actor'
AND column_key = 'PRI';

--
-- Ejercicio 6
-- Consulta que muestre el nombre y valor de las columnas que tengan un valor por defecto en la tabla 
-- ‘actor’ de la BD ‘sakila’.
--

SELECT column_name, column_default
FROM information_schema.columns
WHERE table_schema = 'sakila'
AND table_name = 'actor'
AND column_default IS NOT NULL;

--
-- Ejercicio
--  Para hacer las consultas sobre las tablas que almacenan los privilegios, vamos a crear un usuario 
-- (userLocal) con los permisos SELECT, INSERT y UPDATE sobre la BD ‘sakila’.
--

CREATE USER 'userLocal'@'localhost' IDENTIFIED BY 'abc123.';

GRANT SELECT, INSERT, UPDATE ON sakila.* TO 'userLocal'@'localhost';

FLUSH PRIVILEGES;

--
-- La tabla ‘user_privileges’ proporciona información sobre los permisos globales.
--

describe information_schema.user_privileges;

--
-- Ejercicio 7
-- Consulta que muestre los privilegios globales que tienen las cuentas de root.
--

SELECT privilege_type as 'privilegios_globales'
FROM information_schema.user_privileges
WHERE grantee like '%root%';

--
-- La tabla ‘schema_privileges’ proporciona información acerca del esquema de permisos (base de datos).
--

describe information_schema.schema_privileges;

--
-- Ejercicio 8
-- Consulta que muestre toda la información (*) de los privilegios que tiene ‘userLocal’
-- sobre la BD ‘sakila’.
--

SELECT *
FROM information_schema.schema_privileges
WHERE grantee like '%userlocal%';

--
-- Ejercicio 9
-- Consulta que muestre el nombre (cuenta) de los usuarios que tienen privilegio INSERT sobre la BD 
-- ‘sakila’.
--

SELECT grantee as nombre
FROM information_schema.schema_privileges
WHERE table_schema = 'SAKILA'
and privilege_type = 'INSERT';

--
-- La tabla ‘table_privileges’ proporciona información de permisos de tablas.
--

describe information_schema.table_privileges;

--
-- Ejercicio 10
-- Consulta que muestre el nombre de las tablas de la BD ‘sakila’ sobre las que ‘userLocal’ tiene 
-- privilegio INSERT.
--

SELECT TABLE_NAME as tabla
FROM information_schema.TABLE_PRIVILEGES
WHERE TABLE_SCHEMA = 'sakila'
AND GRANTEE = 'userLocal'
AND PRIVILEGE_TYPE = 'INSERT';

--
-- La tabla ‘column_privileges’ proporciona información de permisos de columnas.
--

describe information_schema.column_privileges;

--
-- Ejercicio 11
-- Consulta que muestre el nombre de las columnas de la tabla 'actor' de la BD ‘sakila’ sobre las que 
-- ‘userLocal’ tiene privilegio INSERT.
--

SELECT COLUMN_NAME as columna
FROM INFORMATION_SCHEMA.column_privileges
WHERE PRIVILEGE_TYPE LIKE 'INSERT'
AND TABLE_SCHEMA LIKE '%SAKILA%' 
AND TABLE_NAME LIKE 'ACTOR' 
AND GRANTEE LIKE  "'userlocal'@'%'";

--
-- La tabla ‘table_constraints’ proporciona información sobre las tablas que tienen restricciones.
--

describe information_schema.table_constraints;

--
-- Ejercicio 12
-- Consulta que muestre el nombre de la tabla y nombre de la restricción de todas las tablas que 
-- contengan claves foráneas de la BD ‘sakila’.
--

SELECT TABLE_NAME as tabla, CONSTRAINT_NAME as restriccion
FROM INFORMATION_SCHEMA.table_constraints
WHERE TABLE_SCHEMA LIKE '%SAKILA%' 
AND CONSTRAINT_TYPE LIKE 'FOREIGN KEY';

--
-- La tabla ‘key_columns_usage’ proporciona información sobre las columnas que tienen restricciones.
--

describe information_schema.key_column_usage;

--
-- Ejercicio 13
-- Mostrar toda la información sobre las restricciones que no sean de tipo clave-primaria 
-- (CONSTRAINT_NAME) que tiene la tabla 'address' de la BD ‘sakila’.
--

SELECT *
FROM INFORMATION_SCHEMA.key_column_usage
WHERE TABLE_SCHEMA LIKE '%SAKILA%'
AND TABLE_NAME LIKE 'ADDRESS' 
AND CONSTRAINT_NAME NOT LIKE 'PRIMARY';

--
-- La tabla ‘ROUTINES’ contiene información sobre procedimientos y funciones.
--

describe information_schema.ROUTINES;

--
-- La tabla ‘VIEWS’ contiene información sobre las vistas.
--

describe information_schema.VIEWS;

--
-- La tabla ‘PROFILING’ contiene información sobre los disparadores.
--

describe information_schema.TRIGGERS;
