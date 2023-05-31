//Determinar el n�mero de cifras de un n�mero entero. El algoritmo debe funcionar para n�meros de hasta 5 cifras, considerando los negativos.
//Por ejemplo, si se introduce el n�mero 5342, la respuesta del programa debe ser 4. Si se introduce -250, la respuesta	debe ser 3
Algoritmo numeroCifrasEntero
	Definir num Como Entero
	Definir cadNum Como Caracter
	
	Escribir "Introduzca un n�mero: "
	Leer num
	
	cont <- 0 
	aux <- num
	si num <> 0 Entonces
		Mientras aux<>0 hacer // mientras no sea cero
			cont <- cont + 1 // contar cuantos digitos
			aux <- trunc(aux/10) // dividir por 10 y despreciar los decimales
		FinMientras
	SiNo
		cont <- 1
	FinSi
	
	Escribir "El numero tiene ",cont," digitos"
FinAlgoritmo