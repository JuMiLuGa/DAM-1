DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `condicionalCASEExpresiones`()
BEGIN
	DECLARE v_forma_pago ENUM ('metalico','tarjeta','transferencia');
	SET v_forma_pago = 'metalico';
	CASE v_forma_pago
		WHEN 'metalico' THEN
			SELECT 'Forma de pago elegida: METALICO';
		WHEN 'tarjeta' THEN
			SELECT 'Forma de pago elegida: TARJETA';
		ELSE
			SELECT 'Forma de pago elegida: TRANSFERENCIA';
	END CASE;
END