Algoritmo sin_titulo
	
	Definir num, digito, suma Como Entero
	
	Escribir "introduzca un numero: " Sin Saltar
	leer num
	
	Repetir 
	
	Mientras n > 0 Hacer
		
		digito <- n mod 10
		n <- trunc(num/10)
		suma <- suma + digito
		
	FinMientras
	
		num <- suma
		suma = 0
	
	Hasta Que suma<10
	
	Si num = 9 Entonces
		
		Escribir "el numero " digito " es multiplo de 9"
		
	SiNo
		
		Escribir "el numero " digito " no es multiplo de 9"
		
	FinSi
	
FinAlgoritmo
