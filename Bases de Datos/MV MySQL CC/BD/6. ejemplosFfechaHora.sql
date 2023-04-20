-- Funciones Fecha-Hora

-- 1.	ADDDATE(date,INTERVAL expr type)
	SELECT ADDDATE('1998-01-02', INTERVAL 31 DAY); 	-- '1998-02-02'
	SELECT ADDDATE('1998-01-02', 31);	 		    -- '1998-02-02'
	SELECT DATE_ADD('1998-01-02', INTERVAL 31 DAY); -- '1998-02-02'


-- 2.	SUBDATE(date,INTERVAL expr type)
	SELECT SUBDATE('1998-01-02', INTERVAL 31 DAY); -- '1997-12-02'

-- 3.	ADDTIME(expr,expr2) 
	SELECT ADDTIME('1997-12-31 23:59:59.999999', '1 1:1:1.000002');     --  '1998-01-02 01:01:01.000001'
 	SELECT ADDTIME('01:00:00.999999', '02:00:00.999998');	        	--  '03:00:01.999997'

-- 4.	CURDATE() 
	SELECT CURDATE();	 	--  '1997-12-15'
	SELECT CURDATE() + 0;	-- 19971215
    
-- 5.	CURTIME() 

	SELECT CURTIME();		-- -> '23:50:26'
	SELECT CURTIME() + 0;	-- ->235026

-- 6.	CURRENT_TIMESTAMP

	SELECT CURRENT_TIMESTAMP; 	-- 23:03:15 01:26:12


-- 7.	DATE(expr) 
 
	SELECT DATE('2003-12-31 01:02:03'); -- '2003-12-31'

-- 8.	DATEDIFF(expr,expr2) 
	SELECT DATEDIFF('1997-12-31 23:59:59','1997-12-30');	-- 1
	SELECT DATEDIFF('1997-11-30 23:59:59','1997-12-31');	-- -31

-- 9.	DATE_FORMAT(date,format) 
 
SELECT DATE_FORMAT('1997-10-04 22:23:00', '%W %M %Y');					--  'Saturday October 1997'
SELECT DATE_FORMAT('1997-10-04 22:23:00', '%H:%i:%s');					--  '22:23:00'
SELECT DATE_FORMAT('1997-10-04 22:23:00', '%D %y %a %d %m %b %j'); 		--  '4th 97 Sat 04 10 Oct 277'
SELECT DATE_FORMAT('1997-10-04 22:23:00', '%H %k %I %r %T %S %w');		--  '22 22 10 10:23:00 PM 22:23:00 00 6'
SELECT DATE_FORMAT('1999-01-01', '%X %V');								--  '1998 52'


-- 10.	DAY(date) 
SELECT DAYOFMONTH(NOW());  	

-- 11.	DAYNAME(date) 
SELECT DAYNAME(NOW());  	

-- 12.	DAYOFWEEK(date) Retorna el índice del día de la semana para date (1 = domingo, 2 = lunes, ..., 7 = sábado). 
SELECT DAYOFWEEK(NOW());	

-- 13.	DAYOFYEAR(date) Retorna el día del año para date, en el rango 1 a 366. 
 SELECT DAYOFYEAR(NOW());	 

-- 14.	EXTRACT(type FROM date) 

SELECT EXTRACT(YEAR FROM '1999-07-02');		 					-- -> 1999
SELECT EXTRACT(YEAR_MONTH FROM '1999-07-02 01:02:03');     		-- -> 199907
SELECT EXTRACT(DAY_MINUTE FROM '1999-07-02 01:02:03');      	-- -> 20102
SELECT EXTRACT(MICROSECOND FROM '2003-01-02 10:30:00.000123');	-- -> 123

-- 15.	FROM_DAYS(N) 
SELECT FROM_DAYS(729669);		-- -> '1997-10-07'
SELECT FROM_DAYS(366);			-- -> '0001-01-01'



-- 16.	GET_FORMAT(DATE|TIME|DATETIME, 'EUR'|'USA'|'JIS'|'ISO'|'INTERNAL') 
 
SELECT DATE_FORMAT('2003-10-03',GET_FORMAT(DATE,'EUR'));	        -- -> '03.10.2003'
SELECT STR_TO_DATE('10.31.2003',GET_FORMAT(DATE,'USA'));         	-- -> '2003-10-31'
SELECT DATE_FORMAT('2003-10-03',GET_FORMAT(DATE,'USA'));	        -- -> '03.10.2003'
SELECT DATE_FORMAT('2003-10-03',GET_FORMAT(DATE,'JIS'));			-- -> '2003-10-03'
SELECT DATE_FORMAT('2003-10-03',GET_FORMAT(DATE,'ISO'));			-- -> '2003-10-03'
SELECT DATE_FORMAT('2003-10-03',GET_FORMAT(DATE,'INTERNAL'));		-- -> '20031003'

SELECT DATE_FORMAT(NOW(),GET_FORMAT(DATETIME,'ISO'));		-- -> '20031003'
 

-- 17.	HOUR(time) 
SELECT HOUR('10:05:03');	 -- -> 10

-- 18.	LAST_DAY(date) 
SELECT LAST_DAY('2003-02-05');					-- -> '2003-02-28'
SELECT LAST_DAY('2004-02-05');					-- -> '2004-02-29'
SELECT LAST_DAY('2004-01-01 01:01:01');  		-- -> '2004-01-31'
SELECT LAST_DAY('2003-03-32');					-- -> NULL


-- 19.	MAKEDATE(year,dayofyear) 
SELECT MAKEDATE(2001,31), MAKEDATE(2001,32);		-- -> '2001-01-31', '2001-02-01'
SELECT MAKEDATE(2001,365), MAKEDATE(2004,365);		-- -> '2001-12-31', '2004-12-30'
SELECT MAKEDATE(2001,0);								-- -> NULL

-- 20.	MAKETIME(hour,minute,second) 
SELECT MAKETIME(12,15,30);	 -- -> '12:15:30'


-- 21.	MINUTE(time) 
SELECT MINUTE('98-02-03 10:05:03');	-- -> 5

-- 22.	MONTH(date) 
SELECT MONTH('1998-02-03');		-- ->2

-- 23.	MONTHNAME(date) 
SELECT MONTHNAME('1998-02-05');	-- -> 'February'

-- 24.	NOW() 
SELECT NOW();		-- -> '1997-12-15 23:50:26'
SELECT NOW() + 0;   -- -> 19971215235026


-- 25.	PERIOD_ADD(P,N) 
SELECT PERIOD_ADD(9801,2);		-- -> 199803

-- 26.	PERIOD_DIFF(P1,P2) 
 SELECT PERIOD_DIFF(9802,199703);	-- -> 11

-- 27.	QUARTER(date) 
SELECT QUARTER('98-04-01');	  -- -> 2

-- 28.	SECOND(time) 
 SELECT SECOND('10:05:03');	 -- -> 3

-- 29.	SEC_TO_TIME(seconds) 
 SELECT SEC_TO_TIME(2378);	 	-- -> '00:39:38'
 SELECT SEC_TO_TIME(2378) + 0;	-- ->3938

-- 30.	STR_TO_DATE(str,format) 
SELECT STR_TO_DATE('03.10.2003 09.20','%d.%m.%Y %H.%i'); 		-- -> '2003-10-03 09:20:00'
SELECT STR_TO_DATE('10arp', '%carp');				 			-- -> '0000-10-00 00:00:00'
SELECT STR_TO_DATE('2003-15-10 00:00:00','%Y-%m-%d %H:%i:%s');       -- -> NULL

-- 31.	SUBTIME(expr,expr2) 
SELECT SUBTIME('1997-12-31 23:59:59.999999','1 1:1:1.000002');	  	-- -> '1997-12-30 22:58:58.999997'
SELECT SUBTIME('01:00:00.999999', '02:00:00.999998');		 		-- -> '-00:59:59.999999'

 
-- 32.	TIME(expr) 
SELECT TIME('2003-12-31 01:02:03');			-- -> '01:02:03'
SELECT TIME('2003-12-31 01:02:03.000123');  -- -> '01:02:03.000123'

-- 33.	TIMEDIFF(expr,expr2) 
SELECT TIMEDIFF('2000:01:01 00:00:00', '2000:01:01 00:00:00.000001');			-- -> '-00:00:00.000001'
SELECT TIMEDIFF('1997-12-31 23:59:59.000001', '1997-12-30 01:01:01.000002');    -- -> '46:58:57.999999'

-- 34.	TIMESTAMP(expr) , TIMESTAMP(expr,expr2) 
SELECT TIMESTAMP('2003-12-31');				-- -> '2003-12-31 00:00:00'
SELECT TIMESTAMP('2003-12-31 12:00:00','12:00:00');        	-- -> '2004-01-01 00:00:00'

-- 35.	TIMESTAMPADD(interval,int_expr,datetime_expr) 
SELECT TIMESTAMPADD(MINUTE,1,'2003-01-02');	 -- -> '2003-01-02 00:01:00'
SELECT TIMESTAMPADD(WEEK,1,'2003-01-02');	 -- -> '2003-01-09'

-- 36.	TIMESTAMPDIFF(interval,datetime_expr1,datetime_expr2) 
SELECT TIMESTAMPDIFF(MONTH,'2003-02-01','2003-05-01');		 -- -> 3
SELECT TIMESTAMPDIFF(YEAR,'2002-05-01','2001-01-01');		 -- -> -1

-- 37.	TIME_FORMAT(time,format) 
SELECT TIME_FORMAT('100:00:00', '%H %k %h %I %l');       -- -> '100 100 04 04 4'

-- 38.	TIME_TO_SEC(time) 

SELECT TIME_TO_SEC('22:23:00');		-- -> 80580
SELECT TIME_TO_SEC('00:39:38');		-- -> 2378

-- 39.	TO_DAYS(date) 
SELECT TO_DAYS(950501);		 			-- -> 728779
SELECT TO_DAYS('1997-10-07');        	-- -> 729669

SELECT TO_DAYS('1997-10-07'), TO_DAYS('97-10-07');		-- -> 729669, 729669

SELECT TO_DAYS('0001-01-01');		-- -> 729669, 729669

-- 40.	WEEK(date [,mode]) 
 
SELECT WEEK('1998-02-20');	 	-- -> 7
SELECT WEEK('1998-02-20',0);	-- -> 7
SELECT WEEK('1998-02-20',1);	-- -> 8
SELECT WEEK('1998-12-31',1);	-- -> 53



SELECT WEEK('2015-02-17',0);	-- retorna 7, porque tiene un domingo en la 1ª semana del año y el primer día de la semana es el Domingo.
SELECT WEEK('2015-02-17',1);	-- retorna 8, porque tiene 4 dias en la 1ª semana del año y el primer día de la semana es el Lunes.
SELECT WEEK('2015-02-17',2);	-- retorna 7, porque tiene un domingo en la 1ª semana del año y el primer día de la semana es el Domingo.
SELECT WEEK('2015-02-17',3);	-- retorna 8, porque tiene 4 dias en la 1ª semana del año y el primer día de la semana es el Lunes.
SELECT WEEK('2015-02-17',4);	-- retorna 7, porque tiene 4 dias en la 1ª semana del año y el primer día de la semana es el Domingo.
SELECT WEEK('2015-02-17',5);	-- retorna 7, porque no tiene un Lunes en la 1ª semana del año y el primer día de la semana es el Lunes.
SELECT WEEK('2015-02-17',6);	-- retorna 7, porque tiene 4 dias en la 1ª semana del año y el primer día de la semana es el Domingo.
SELECT WEEK('2015-02-17',7);	-- retorna 7, porque no tiene un Lunes en la 1ª semana del año y el primer día de la semana es el Lunes.


-- 41.	WEEKDAY(date) 
SELECT WEEKDAY('1998-02-03 22:23:00');	 -- -> 1
SELECT WEEKDAY('1997-11-05');			 -- -> 2

SELECT WEEKDAY(now());


-- 42.	WEEKOFYEAR(date) 
SELECT WEEKOFYEAR('1998-02-20');	-- ->8

-- 43.	YEAR(date) 
SELECT YEAR('98-02-03');	 -- -> 1998

-- 44.	YEARWEEK(date), YEARWEEK(date,start) 
SELECT YEARWEEK('2015-01-01',0);		 -- -> 201452 
SELECT YEARWEEK('2015-01-01',1);		 -- -> 201501


