Algoritmo sin_titulo
	Definir num, digito, suma Como Entero
	Escribir "Introduce un nº: " Sin Saltar
	Leer num
	
	Repetir	
		suma<-0
		Mientras num > 0
			digito<-num MOD 10
			num<-Trunc(num/10)
			suma<-suma+digito
		FinMientras
		num<-suma		
	Hasta Que num < 10
	
FinAlgoritmo
