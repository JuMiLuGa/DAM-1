Algoritmo lista_hasta_0_min	

Definir n,min Como Entero

Leer n
min<-n
Mientras n<>0 Hacer
	
	Escribir "Ingresa un numero" Sin Saltar
	
	leer n
	
	si n<>0 Entonces
		si n<min Entonces
			min<-n
		FinSi		
	FinSi
	
FinMientras
	Escribir "el numero menor es: " min
FinAlgoritmo
