Algoritmo lista_hasta_0_max	

Definir n,max Como Entero

Leer n
max<-n
Mientras n<>0 Hacer
	
	Escribir "Ingresa un numero" Sin Saltar
	
	leer n
	
	si n<>0 Entonces
		si n>max Entonces
			max<-n
		FinSi		
	FinSi
	
FinMientras
	Escribir "el numero mayor es: " max
FinAlgoritmo
