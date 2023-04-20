use bdCiclismo;
--  CONSULTAS

-- 1.  (0.2 puntos). Mostrar nombre de los ciclistas que no han ganado ninguna etapa.

select NOMBRE
from CICLISTA
where CICLISTA.DORSAL not in(
select DORSAL
from ETAPA
);

-- 2.  (0.4 puntos). Mostrar el nombre de cada puerto indicando el número (netapa) y los kilómetros de la etapa en la que se encuentra el puerto, solo para los puertos de primera categoría.

select PUERTO.NOMPUERTO, ETAPA.NETAPA, ETAPA.KM
from PUERTO, ETAPA
where PUERTO.NETAPA=ETAPA.NETAPA and
PUERTO.CATEGORIA like '1';

-- 3.  (0.4 puntos). Mostrar el nombre de los ciclistas que pertenezcan al mismo equipo que ‘Mikel Landa’.

select NOMBRE
from CICLISTA
where CICLISTA.NOMEQ = 'Bahrain Victorious';

-- 4.  (0,5 puntos). Mostrar el nombre del ciclista y el nombre del equipo al que pertenece para aquellos ciclistas que tienen menos de 28 años. Ordenar por el nombre del ciclista.



-- 5.  (0.5 puntos). Mostrar de cada equipo el nombre, la edad media de los ciclistas, la edad del más mayor y la edad del más joven. Ordenar por la edad media.                



-- 6.  (0.7 puntos). Mostrar el nombre de la ciudad de salida y de llegada de las etapas donde estén los puertos con mayor pendiente.



-- 7.  (0,8 puntos). Mostrar nombre del ciclista  y el número de puertos que ha ganado, solo para los ciclistas que han ganado en más de un puerto. 



-- 8.  (1 punto). Por cada etapa ganada, el ciclista ganador recibe un premio de 11.000€. Para almacenar esta información, debes añadir una nueva columna 'PREMIO' a la tabla 'ETAPA' que tenga como valor por defecto 11000. 
-- Realizar una consulta que muestre el nombre de los ciclistas y el dinero recibido por las etapas ganadas. 



-- 9. (1.5 puntos). Mostrar el nombre de los ciclistas que pertenezcan a un equipo que tenga más de 2 corredores y que hayan ganado alguna etapa indicando cuántas etapas ha ganado. Ordenar por el nombre.


-- 10.  (2 puntos). Mostrar el nombre de los ciclistas que han llevado el/los mismo/s maillot/s que 'Primoz Roglic'.
