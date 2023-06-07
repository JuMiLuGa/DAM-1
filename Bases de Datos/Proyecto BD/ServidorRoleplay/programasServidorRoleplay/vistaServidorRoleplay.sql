/*

Crea una vista llamada "vista_personajes_propiedades" que muestre el nombre y
apellidos de cada personaje junto con el código y tipo de propiedad a la que pertenece,
en caso de tener una propiedad asociada.

*/

use servidorroleplay;

CREATE VIEW vista_personajes_propiedades AS
SELECT p.nombreApellidos, pr.codPropiedad, pr.tipoPropiedad
FROM personajes p
LEFT JOIN propiedades pr ON p.codPersonaje = pr.codPersonaje;