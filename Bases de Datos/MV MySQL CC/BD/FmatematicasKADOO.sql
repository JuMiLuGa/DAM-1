use kadoo;

-- 1. Obtener el nombre y salario de los empleados cuyo salario se aproxima a 1864€

SELECT NOMEM, SALAR 
FROM TEMPLE 
WHERE FLOOR(SALAR) = 1864 OR CEIL(SALAR) = 1864;

-- 2. Obtener cuantos grados son 2,4 radianes con una precisión de 3 decimales.

SELECT ROUND(2.4 * 180/PI(), 3) 
AS GRADOS;

-- 3. Obtener cuantos radianes son 38º con una precisión de 3 decimales.

SELECT ROUND(38 * PI()/180, 3) 
AS RADIANES;

-- 4. Obtener por orden alfabético para los empleados del departamento 110: nombre,
-- salario mensual y el salario diario que percibirían para los meses de Enero 
-- y Febrero del año actual.

SELECT NOMEM, SALAR,
(SALAR/datediff('2023-02-01', '2023-01-01')) AS SALARIO_DIARIO_Enero,
(SALAR/datediff('2023-03-01', '2023-02-01')) AS SALARIO_DIARIO_Febrero 
FROM TEMPLE
WHERE NUMDE = 110
ORDER BY NOMEM ASC;

-- 5. Obtener aleatoriamente 3 departamentos de la tabla departamentos.

SELECT * 
FROM TDEPTO 
ORDER BY RAND() LIMIT 3;

-- 6. Obtener el nombre y número de hijos de los empleados cuyo número de hijos
-- es mayor o igual al doble de número de hijos más bajo de los empleados
-- que tienen más de 1 hijo. Utilizar la función POWER.

SELECT NOMEM, NUMHI
FROM TEMPLE
WHERE NUMHI >= POWER(2, (SELECT MIN(NUMHI) FROM TEMPLE WHERE NUMHI > 1));

/*
7. Como se ha comentando anteriormente es política de la empresa festejar cada fin 
de semana los cumpleaños de todos los empleados. La secretaria nos ha pedido 
un informe por departamento de todos los cumpleaños que quedan por celebrar,
a partir del mes siguiente al actual, para presupuestar su coste. Obtener número,
nombre y número de cumpleaños que quedan por celebrar. Utilizar la función SIGN.
Suponer como fecha actual 16 de Septiembre de 2011
*/

SELECT TDEPTO.NUMDE, TDEPTO.NOMDE, COUNT(TEMPLE.NUMEM) AS CUMPLEANOS_PENDIENTES
FROM TDEPTO, TEMPLE
WHERE TDEPTO.NUMDE = TEMPLE.NUMDE AND
SIGN(DATEDIFF(CONCAT(YEAR(CURDATE()), '-', MONTH(TEMPLE.FECNA), '-', DAY(TEMPLE.FECNA)), DATE_ADD(CURDATE(), INTERVAL 1 MONTH))) = 1
GROUP BY TDEPTO.NUMDE, TDEPTO.NOMDE;

/*
8. Para celebrar los cumpleaños se destina una partida del 0,003 del presupuesto del departamento. Mostrar en
que departamentos ese presupuesto no es suficiente para cubrir los gastos. Cada cumpleaños cuesta 300
euros. Mostrar número, nombre y presupuesto del departamento.
*/

SELECT NUMDE, NOMDE, concat(PRESU, ' €') as Presupuesto, concat(format((PRESU * 0.0003), '0.00'), ' €') as 'Presupuesto disponible'
FROM TDEPTO
WHERE PRESU * 0.0003 < 300
GROUP BY NUMDE;

-- 9. Calcular el valor de X, aplicando la definición de logaritmo.

SELECT LOG(64)/LOG(4) as X;

SELECT LOG(1/27)/LOG(3) as X;

SELECT LOG(2,SQRT(2)) as X;

SELECT LOG();

-- 10. Resolver la siguiente ecuación de 2º grado: 2x2 + 4x -6 = 0. 

SELECT (-4 + SQRT(pow(4,2) - (4*2*(-6))))/4 as 'X positivo', (-4 - SQRT(pow(4,2) - (4*2*(-6))))/4 as 'X negativo';

