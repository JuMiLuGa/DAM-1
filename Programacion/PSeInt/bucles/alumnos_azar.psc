Algoritmo alumnos_azar
	
	Definir numalu Como Entero
	Definir nombre Como Caracter
	
	
	Escribir "introduca la cantidad de alumnos: " Sin Saltar
	Leer numalu
	
	Dimension nombre[numalu]
	
	Para i<-1 Hasta numalu Hacer
		
		Escribir "Alumno ", i, ": " Sin Saltar
		Leer nombre[i]
		
	FinPara
	
	Escribir nombre[azar(numalu)+1]
	
FinAlgoritmo
