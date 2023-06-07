/*

Crear un TRIGGER que se active después de cada actualización en la tabla "personajes".
El TRIGGER debe insertar un registro en la tabla "auditoria_personajes" con los detalles
de la actualización, incluyendo la fecha, el código del personaje, el nombre antiguo
y el nombre nuevo.

*/

use servidorroleplay;

DELIMITER //

CREATE TRIGGER tr_auditoria_personajes AFTER UPDATE ON personajes
FOR EACH ROW
BEGIN
    DECLARE fecha_actual DATETIME;
    SET fecha_actual = NOW();
    
    INSERT INTO auditoria_personajes (fecha, codPersonaje, nombreAntiguo, nombreNuevo)
    VALUES (fecha_actual, OLD.codPersonaje, OLD.nombreApellidos, NEW.nombreApellidos);
END //

DELIMITER ;

-- creacion tabla auditoria_personajes

CREATE TABLE auditoria_personajes (
  idAuditoria INT AUTO_INCREMENT,
  fecha DATETIME,
  codPersonaje INT,
  nombreAntiguo VARCHAR(40),
  nombreNuevo VARCHAR(40),
  PRIMARY KEY (idAuditoria)
);