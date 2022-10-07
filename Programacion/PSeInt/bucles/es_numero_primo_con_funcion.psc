Funcion  esprimo<-EsNumeroPrimo(num)
	
	Definir contador Como Entero
	
	contador<-2
	
	Mientras (num MOD contador <> 0) Hacer
		
		contador<- contador + 1
		
	FinMientras
	
	si num = contador Entonces
		
		esprimo<-Verdadero
		
	sino
		
		esprimo<-falso
		
	FinSi
FinFuncion

Algoritmo es_numero_primo_con_funcion
	
	Definir  num, contador Como Entero
	
	Escribir "introduzca un Nº mayor que 1: " Sin Saltar
	
	Leer num
	Escribir  EsNumeroPrimo(num)
FinAlgoritmo
