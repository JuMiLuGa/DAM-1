DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `parametroOUT`(OUT p1 decimal(10,2))
BEGIN
	
    declare RADIO int default 2;			-- Variable radio del circulo.
    SELECT p1 AS 'Antes del SET'; 			-- Valor de la variable antes del SET
    SET p1 = 2 * PI() * power(radio,2); 	-- Calcular y almacenar el área de un círculo.
    SELECT p1 'Desués del SET'; 			-- Valor de la variable después del SET
END