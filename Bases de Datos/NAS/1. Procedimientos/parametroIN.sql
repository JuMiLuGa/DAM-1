DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `parametroIN`(IN p1 INT)
BEGIN
	SELECT p1 AS 'Antes del SET'; 			-- Valor de la variable antes del SET
    SET p1 = p1 + 10; 						-- Incrementar en 10 unidades
    SELECT p1 'Desués del SET'; 			-- Valor de la variable después del SET
END