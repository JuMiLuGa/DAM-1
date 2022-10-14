Algoritmo matriz_diagonal

	Definir  numF, numC Como Entero
	
	escribir "introducir numero de filas y columnas"
	Leer numF
	
	numC=numF
	
	
	Para fila<-1 Hasta numF Hacer
		
		Para columna<-1 hasta numC Hacer
			
			si fila=columna Entonces
				Escribir " X " Sin Saltar
			SiNo
				Escribir " . " Sin Saltar
			FinSi
			
			
		FinPara
		
		Escribir ""
		
	FinPara
	
FinAlgoritmo
