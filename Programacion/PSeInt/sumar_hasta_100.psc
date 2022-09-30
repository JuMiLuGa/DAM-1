Algoritmo sumar_hasta_100
	
	definir n1, aux Como Entero
	Leer n1
	
	aux<-0
	aux<-n1+aux
	
	Escribir aux
	
	Mientras aux<=100 Hacer
		escribir "seguir sumando"
		leer n1
		aux<-n1+aux
		escribir aux
		
	FinMientras
	
	escribir "pasa de 100"
	
FinAlgoritmo
