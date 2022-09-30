Algoritmo tipos_triangulos
	
	Definir L1, L2, L3 Como caracter
	
	Escribir "Lado Izquierdo"
	Leer L1
	Escribir "Lado Derecho"
	Leer L2
	Escribir "Lado Inferior"
	Leer L3
	
	si L1=L2 y L1=L3
		escribir "el triangulo es equilatero"
	SiNo
		si L1<>L3 y L2<>L3 y L1<>L2
			Escribir "el triangulo es escaleno"
		SiNo
			Escribir "el triangulo es isósceles"
		FinSi
		
	FinSi
	
FinAlgoritmo
