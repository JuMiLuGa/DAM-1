Funcion resultado<-potencia(base, exponente)
	
definir res Como Entero
res	<- 1
	
	para i<- 1 Hasta exponente Hacer
		
		res<-res*base
		
	FinPara
	
	resultado<-res
	
FinFuncion


Algoritmo elevar	
	
	Escribir "introduzca base: " Sin Saltar
	leer b
	escribir "introduzca exponente: " Sin Saltar
	Leer expo
	
	Escribir " el resultado de " b "^" expo " es: " potencia(b, expo)
FinAlgoritmo
