Algoritmo contar_digitos
	
	definir num Como entero
	Definir cadnum Como Caracter
	
	escribir "introduzca un numero"
	leer num
	cadnum<-ConvertirATexto(num)
	
	si num <0 Entonces
		escribir "el numero ", num, "tiene ", Longitud(cadnum)-1, "digitos"
	SiNo
		escribir "el numero ", num, "tiene ", Longitud(cadnum), "digitos"
	FinSi
	
FinAlgoritmo
