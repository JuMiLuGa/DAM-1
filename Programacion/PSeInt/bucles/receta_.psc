Algoritmo receta_
	Definir receta, ingredientes Como Caracter
	Definir cantidad Como Entero
	Definir importe, precios Como Real
	
	Escribir "Introduzca nombre de la receta: " Sin Saltar
	Leer receta
	Escribir "Introducir cantidad de ingredientes: " Sin Saltar
	Leer cantidad
	
	Dimension ingredientes[cantidad]
	Dimension precios[cantidad]
	
	Escribir "Introduzca el nombre de cada ingrediente: " Sin Saltar
	Para i<-1 Hasta cantidad Hacer
		Escribir "Ingrediente, " i ": " Sin Saltar
		Leer ingredientes[i]
		Escribir  "Precio ", ingredientes[i], ": " Sin Saltar
		Leer precios[i]
	FinPara
	
	Para i<-1 hasta cantidad Hacer
		importe<-importe+precios[i]
	FinPara
	
	Escribir "El precio de la receta es de: ", importe
	
FinAlgoritmo
