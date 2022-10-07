Algoritmo leer_numero_al_reves
	
	Definir num, numinv Como Entero
	Definir cadnum, C, cadnuminv Como Caracter
	
	Escribir "introduzca un numero: " Sin Saltar 
	Leer num
	
	cadnum<-ConvertirATexto(num)
	
	Para i<-Longitud(cadnum) Hasta 1 Hacer
		
		C<-Subcadena(cadnum, i, 1)
		cadnuminv<-Concatenar(cadnuminv, C)
		
	FinPara
	
	numinv<-ConvertirANumero(cadnuminv)
	
FinAlgoritmo
