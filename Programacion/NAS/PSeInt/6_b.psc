//Determinar el n�mero de cifras de un n�mero entero. El algoritmo debe funcionar para n�meros de hasta 5 cifras, considerando los negativos.
//Por ejemplo, si se introduce el n�mero 5342, la respuesta del programa debe ser 4. Si se introduce -250, la respuesta	debe ser 3
Algoritmo numeroCifrasEntero
	Definir num Como Entero
	Definir cadNum Como Caracter
	
	Escribir "Introduzca un n�mero: "
	Leer num
	
	cadNum<-ConvertirATexto(num)
	Si num < 0 Entonces
		Escribir "El n�mero ", num, " tiene ", Longitud(cadNum)-1, " cifras."
	SiNo
		Escribir "El n�mero ", num, " tiene ", Longitud(cadNum), " cifras."
	FinSi	
FinAlgoritmo
