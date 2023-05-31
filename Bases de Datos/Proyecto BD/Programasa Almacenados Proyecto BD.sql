Trigger:

Enunciado:

Crear un TRIGGER que se active después de cada actualización en la tabla "personajes".
El TRIGGER debe insertar un registro en la tabla "auditoria_personajes" con los detalles
de la actualización, incluyendo la fecha, el código del personaje, el nombre antiguo
y el nombre nuevo.

Solución:

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


tabla auditoria:

CREATE TABLE auditoria_personajes (
  idAuditoria INT AUTO_INCREMENT,
  fecha DATETIME,
  codPersonaje INT,
  nombreAntiguo VARCHAR(40),
  nombreNuevo VARCHAR(40),
  PRIMARY KEY (idAuditoria)
);

Vista:

Enunciado:

Crea una vista llamada "vista_personajes_propiedades" que muestre el nombre y
apellidos de cada personaje junto con el código y tipo de propiedad a la que pertenece,
en caso de tener una propiedad asociada.

Solución:

CREATE VIEW vista_personajes_propiedades AS
SELECT p.nombreApellidos, pr.codPropiedad, pr.tipoPropiedad
FROM personajes p
LEFT JOIN propiedades pr ON p.codPersonaje = pr.codPersonaje;


Cursor:

Enunciado: 

Crea un cursor llamado "cursor_propiedades" que recorra todas las propiedades
y muestre por cada una su código de propiedad y tipo de propiedad.

Solución:

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


Procedimiento:

Enunciado: 

Crea un procedimiento almacenado llamado "actualizar_salario" que reciba 
como parámetro el nombre del trabajo y el nuevo salario. El procedimiento debe 
actualizar el salario del trabajo especificado. Controla las posibles excepciones.

Solución:


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



Funcion:

Enunciado:

Crea una función llamada "obtener_edad" que reciba como parámetro 
la fecha de nacimiento de un personaje y devuelva su edad en años. 
Controla las posibles excepciones.

Solucion:


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
