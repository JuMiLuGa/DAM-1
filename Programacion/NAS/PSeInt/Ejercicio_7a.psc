//7.Escribir un algoritmo que permita ingresar tres números distintos entre sí y 
//los muestre en pantalla ordenados de mayor a menor y de menor a mayor.
Algoritmo Ejercicio_7a
	Definir A, B, C Como Real
	
	Escribir "Introduce el primer número"
	Leer A
	Escribir "Introduce el segundo número"
	Leer B
	Escribir "Introduce el tercer número"
	Leer C
	
	Si A > B & B > C Entonces
		Escribir ,A, ">" ,B, ">" C " y " ,C, "<" ,B, "<" ,A
	SiNo
		Si A > B & A < C Entonces
			Escribir ,C, ">" ,A, ">" B " y " ,B, "<" ,A, "<" ,C
		SiNo
			Si A < B & B < C Entonces
				Escribir ,C, ">" ,B, ">" A " y " ,A, "<" ,B, "<" ,C
			SiNo
				Si A > C & C > B Entonces
					Escribir ,A, ">" ,C, ">" B " y " ,B, "<" ,C, "<" ,A
				SiNo
					Si B > A & A > C Entonces
						Escribir ,B, ">" ,A, ">" C " y " ,C, "<" ,A, "<" ,B
					SiNo
						Si B > C & C > A Entonces
							Escribir ,B, ">" ,C, ">" A " y " ,A, "<" ,C, "<" ,B
						SiNo
							Escribir "Los números no son distintos"
						Fin Si
						
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
