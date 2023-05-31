CREATE DEFINER=`root`@`localhost` PROCEDURE `variables5bis`()
BEGIN
SET @nombre = CONCAT(@nombre, ' y Mario Carrera',NUMERO);
END