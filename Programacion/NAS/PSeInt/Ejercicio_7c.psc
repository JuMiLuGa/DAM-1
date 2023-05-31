//7.Escribir un algoritmo que permita ingresar tres números distintos entre sí y 
//los muestre en pantalla ordenados de mayor a menor y de menor a mayor.
Algoritmo Ejercicio_7c
	Definir A, B, C Como Real
	
	Escribir "Introduce el primer número"
	Leer A
	Escribir "Introduce el segundo número"
	Leer B
	Escribir "Introduce el tercer número"
	Leer C
	
	Si A>B Entonces
		Si A<C Entonces
			Escribir A, " es el central y el orden es: ",B, "<",A,"<",C
		SiNo
			Si B>C Entonces
				Escribir B, " es el central y el orden es: ",C, "<",B,"<",A
			SiNo
				Escribir C, " es el central y el orden es: ",B, "<",C,"<",A
			FinSi
		FinSi
	SiNo
		Si A>C Entonces
			Escribir A, " es el central y el orden es: ",C, "<",A,"<",B
		SiNo
			Si B<C Entonces
				Escribir B, " es el central y el orden es: ",A, "<",B,"<",C
			SiNo
				Escribir C, " es el central y el orden es: ",A, "<",C,"<",B
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
