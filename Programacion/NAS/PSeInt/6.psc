//Determinar el n�mero de cifras de un n�mero entero. El algoritmo debe funcionar para n�meros de hasta 5 cifras, considerando los negativos.
//Por ejemplo, si se introduce el n�mero 5342, la respuesta del programa debe ser 4. Si se introduce -250, la respuesta	debe ser 3
Algoritmo numeroCifrasEntero
	Definir num Como Entero
		
	Escribir "Introduzca un n�mero: "
	Leer num
	num<-ABS(num)
	
	Si num < 10 Entonces
		Escribir 1
	SiNo
		Si num < 100 Entonces
			Escribir 2
		SiNo
			Si num < 1000 Entonces
				Escribir 3
			SiNo
				Si num < 10000 Entonces
					Escribir 4
				SiNo
					Si num < 100000 Entonces
						Escribir 5											
					FinSi	
				FinSi	
			FinSi	
		FinSi	
	FinSi	
FinAlgoritmo
