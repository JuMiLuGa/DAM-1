Algoritmo _2_mayores_de_lista
	Definir numElementos Como Entero
	Definir datos, may, may2 Como Real
	
	Escribir "introduca la cantidad de elementos: " Sin Saltar
	Leer numElementos
	
	Dimension datos[numElementos]
	
	Para i<-1 Hasta numElementos Hacer
		
		Escribir "Elemento ", i, ": " Sin Saltar
		Leer datos[i]
		
	FinPara
	
	para i<-1 Hasta numElementos Hacer
		
		Si datos[i]>may Entonces
			
			may2<-may
			may<-datos[i]
			
		SiNo
			
			si datos[i]>may2 Entonces
				
				may2<-datos[i]
				
			FinSi
			
		FinSi
		
	FinPara
	
	Escribir "el mayor es: " may
	Escribir "el segundo mayor es: " may2
	
FinAlgoritmo
