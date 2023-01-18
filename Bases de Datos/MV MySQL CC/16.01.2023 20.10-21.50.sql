/* LOS EJEMPLOS CORRESPONDEN DESDE LA PAGINA 13 HASTA LA 19 DEL PDF (AMBAS INCLUIDAS) Tema 4.1. Tipos de Datos */

use test;

/*EJEMPLO 10*/

CREATE TABLE test10 (fruta SET('manzana','mango','pera','banana',' '));

INSERT INTO test10 VALUES ('banana' );
INSERT INTO test10 VALUES ('mango');
INSERT INTO test10 VALUES ('pera');

SELECT * FROM test10 ORDER BY FRUTA DESC; 
/*Con DESC ordena de forma descendente, si se pone ASC ordena de forma ascendente*/

INSERT INTO test10 VALUES ('pera,manzana' );

SELECT * FROM test10;

/*EJEMPLO 11*/

CREATE TABLE test11 ( f DATETIME );

INSERT INTO test11 VALUES ('98-12-31 11:30:45'),
						  ('98.12.31 11+30+45'),
						  (981231113045),
						  ('981231113045'),
						  (now()); /*Esta funcion nos devuelve la fecha y hora, fijate en la linea 42*/

INSERT INTO test11 VALUES ('982131119045'); -- Error. Mes y minutos incorrecto

SELECT * FROM test11;

/*EJEMPLO 12*/

CREATE TABLE test12 ( t TIMESTAMP );

INSERT INTO test12 VALUES ('98-12-31 11:30:45'),
						  ('98-12-31'),
						  (981231113045),
						  ('781231111045'), -- Error. Año ilegal debe ser igual o mayor a 1970.(cambial la primera cifra, antes era un 6 ahora se cambio a 7 para que no de error)
						  (date(now()));/*Esta funcion nos devuelve solo la fecha (anidar funciones)*/
                          
SELECT * FROM test12;

