Algoritmo sin_titulo
	Definir cadenaEntrada Como entero
	
	Escribir "Introduzca nº: " Sin Saltar
	Leer cadenaEntrada
		
	Si EsMultiploNueve(cadenaEntrada) Entonces
		Escribir "Es múltiplo de 9"
	Sino
		Escribir "NO es múltiplo de 9"
	FinSi
	
FinAlgoritmo
Funcion esMultiplo<-EsMultiploNueve(num)
	Definir suma Como Entero
		
	Repetir
		suma<-SumarDigitos(ConvertirATexto(num))
		num<-suma
	Hasta Que suma < 10
	
	esMultiplo <- suma = 9
	
FinFuncion



Funcion res<-SumarDigitos(cad)
	Definir c Como Caracter
	Definir suma, digito Como Entero
	suma<-0
	Para i<-1 hasta Longitud(cad) Hacer
		c<-Subcadena(cad,i,i)
		digito<-ConvertirANumero(c)
		suma<-suma+digito
	FinPara
	res<-suma
FinFuncion
	
	
	
	
	
	
	
	
	
	
	