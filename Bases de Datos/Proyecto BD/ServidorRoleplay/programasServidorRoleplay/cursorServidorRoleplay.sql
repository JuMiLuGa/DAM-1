/*

Crea un cursor llamado "cursor_propiedades" que recorra todas las propiedades
y muestre por cada una su código de propiedad y tipo de propiedad.

*/

use servidorroleplay;

DELIMITER //

CREATE PROCEDURE mostrar_propiedades()
BEGIN
    DECLARE done BOOLEAN DEFAULT FALSE;
    DECLARE codigo_propiedad INT;
    DECLARE tipo_propiedad ENUM('CASA', 'GARAJE', 'APARTAMENTO');

    DECLARE cursor_propiedades CURSOR FOR SELECT codPropiedad, tipoPropiedad FROM propiedades;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN cursor_propiedades;

    read_loop: LOOP
        FETCH cursor_propiedades INTO codigo_propiedad, tipo_propiedad;
        IF done THEN
            LEAVE read_loop;
        END IF;

        SELECT CONCAT('Código de propiedad: ', codigo_propiedad, ', Tipo de propiedad: ', tipo_propiedad) AS info_propiedad;
    END LOOP;

    CLOSE cursor_propiedades;
END //

DELIMITER ;