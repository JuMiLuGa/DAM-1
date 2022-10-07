Algoritmo Primo_O_No
	
	definir num como entero
	definir esPrimo Como Logico
	
	esPrimo<-Verdadero
	
	Escribir "introduzca un numero mayor que 1: " Sin Saltar
	leer num
	
	Para i<-2 hasta num-1 Con Paso 1 Hacer
		
		si num MOD i = 0 Entonces
			esPrimo<-Falso
			
		FinSi
		
	FinPara
	si esPrimo=Verdadero Entonces
		Escribir "es primo"
	SiNo
		Escribir "no es primo"
	FinSi
FinAlgoritmo
