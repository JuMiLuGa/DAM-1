/*

Crea una función llamada "obtener_edad" que reciba como parámetro 
la fecha de nacimiento de un personaje y devuelva su edad en años. 
Controla las posibles excepciones.

*/

use servidorroleplay;

DELIMITER //

CREATE FUNCTION obtener_edad(fecha_nacimiento DATE)
RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE edad INT;
    DECLARE fecha_actual DATE;
    DECLARE exit_handler BOOLEAN DEFAULT FALSE;

    DECLARE CONTINUE HANDLER FOR SQLSTATE '02000' SET exit_handler = TRUE;

    SET fecha_actual = CURDATE();
    SET edad = YEAR(fecha_actual) - YEAR(fecha_nacimiento);

    IF MONTH(fecha_actual) < MONTH(fecha_nacimiento) THEN
        SET edad = edad - 1;
    ELSEIF MONTH(fecha_actual) = MONTH(fecha_nacimiento) AND DAY(fecha_actual) < DAY(fecha_nacimiento) THEN
        SET edad = edad - 1;
    END IF;

    IF exit_handler THEN
        RETURN NULL;
    ELSE
        RETURN edad;
    END IF;
END //

DELIMITER ;