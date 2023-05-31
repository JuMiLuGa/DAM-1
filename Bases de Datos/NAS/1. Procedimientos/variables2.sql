DELIMITER $$

CREATE DEFINER=`root`@`localhost` PROCEDURE `variables2`()
BEGIN

-- Declaración de Variables
	DECLARE V_CARACTER1 CHAR(1);
	DECLARE V_FORMA_DE_PAGO ENUM('METALICO','TARJETA','TRANSFERENCIA');

-- Asignación de valores a las variables
	set v_caracter1= 'y';
	SET V_FORMA_DE_PAGO = 'TARJETA'; 

-- Mostrar el valor de las variables
	SELECT V_CARACTER1, V_FORMA_DE_PAGO;


END