Algoritmo Sorteo
	Definir cantidadNombres Como Entero
	Definir nombres, entrada Como caracter
	
	Escribir "Introduzca la cantidad de personas: " Sin Saltar
	Leer cantidadNombres
	Dimension nombres[cantidadNombres]
	
	Para i<-1 hasta cantidadNombres Hacer
		Escribir i, ": " Sin Saltar
		leer nombres[i]
	FinPara
	
	Escribir "SORTEO: introduzca s para salir o cualquier otro valor para continuar: "
	Leer entrada
	
	Mientras entrada <> 's' Y entrada <> 'S' Hacer
		Escribir "La persona agraciada es: ", nombres[AZAR(cantidadNombres)+1]
		Leer entrada
	FinMientras
	
FinAlgoritmo
