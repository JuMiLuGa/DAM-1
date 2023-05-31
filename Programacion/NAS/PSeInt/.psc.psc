Algoritmo PrecioReceta
	Definir receta, ingredientes como caracter
	Definir cantidad Como Entero
	Definir importe, precios Como Real
	Escribir "introduzca el nombre de la receta: " Sin Saltar
	Leer receta
	Escribir "Introduzca la cantidad de ingredientes: " Sin Saltar
	leer cantidad
	
	Dimension ingredientes[cantidad]
	Dimension precios[cantidad]
	
	Escribir "Introduzca el nombre de cada ingrediente: "
	Para i<-1 Hasta cantidad Hacer
		Escribir "Ingrediente ", i, ": " Sin Saltar
		Leer ingredientes[i]
		Escribir "Precio ", ingredientes[i], ": " Sin Saltar
		Leer precios[i]
	FinPara
	importe<-0
	Para i<-1 Hasta cantidad Hacer
		importe<-importe+precios[i]
	FinPara
	Escribir "El precio de la receta es: ", importe
FinAlgoritmo



