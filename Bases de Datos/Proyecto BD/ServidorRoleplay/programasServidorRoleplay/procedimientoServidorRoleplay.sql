/*

Crea un procedimiento almacenado llamado "actualizar_salario" que reciba 
como parámetro el nombre del trabajo y el nuevo salario. El procedimiento debe 
actualizar el salario del trabajo especificado. El procedimiento controla las 
posibles excepciones.

*/

use servidorroleplay;

DELIMITER //

CREATE PROCEDURE actualizar_salario(IN nombre_trabajo VARCHAR(20), IN nuevo_salario DECIMAL(10,2))
BEGIN
    DECLARE exit_handler BOOLEAN DEFAULT FALSE;

    DECLARE CONTINUE HANDLER FOR SQLSTATE '02000' SET exit_handler = TRUE;

    UPDATE trabajos SET salario = nuevo_salario WHERE nombreTrabajo = nombre_trabajo;

    IF exit_handler THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Error al actualizar el salario.';
    END IF;
END //

DELIMITER ;