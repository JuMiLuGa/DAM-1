DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `parametroINOUT`(INOUT p1 decimal(6,2))
BEGIN
			
    SELECT p1 AS 'Antes del SET'; 			-- Valor de la variable antes del SET
    SET p1 = 2 * PI() * power(p1,2); 		-- Calcular y almacenar el área de un círculo.
    SELECT p1 'Desués del SET'; 			-- Valor de la variable después del SET
END