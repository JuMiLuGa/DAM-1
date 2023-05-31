//7.Escribir un algoritmo que permita ingresar tres números distintos entre sí y 
//los muestre en pantalla ordenados de mayor a menor.
Algoritmo Ejercicio_7b
	Definir a, b, c Como Real
	
	Escribir "Introduzca el valor de a: "
	Leer a
	Escribir "Introduzca el valor de b: "
	Leer b
	Escribir "Introduzca el valor de c: "
	Leer c
	
	Si a > b Y a > c Entonces
		Si b > c Entonces
			Escribir a, " > ", b, " > ", c
		SiNo
			Escribir a, " > ", c, " > ", b
		FinSi
	SiNo		
		Si b > a Y b > c Entonces
			Si a > c Entonces
				Escribir b, " > ", a, " > ", c
			SiNo
				Escribir b, " > ", c, " > ", a
			FinSi
		Sino			
			Si c > a Y c > b Entonces
				Si a > b Entonces
					Escribir c, " > ", a, " > ", b
				SiNo
					Escribir c, " > ", b, " > ", a
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
