DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `variables4`()
BEGIN

	DECLARE  NUMERO INT DEFAULT 0; -- Variable local
	SET @nombre = 'Raquel'; -- Variable de usuario ó global
    CALL variables5();
	
	SELECT CONCAT('Profesores: ',@nombre) as Profesores;


END