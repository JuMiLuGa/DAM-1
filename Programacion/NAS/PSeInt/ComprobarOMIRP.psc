Algoritmo ComprobarOMIRP
	Definir num, numInv Como Entero
	
	Escribir "Introduzca un Nº mayor que 1:" Sin Saltar
	Leer num
	
	Si EsNumeroPrimo(num) Entonces
		numInv<-InvertirNumero(num)
		si EsNumeroPrimo(numInv) Entonces
			Escribir num, " es OMIRP."
		SiNo
			Escribir num, " es primo pero no es OMIRP."
		FinSi
	SiNo
		Escribir num, " no es primo y, por tanto, no puede ser OMIRP."		
	FinSi	
FinAlgoritmo

Funcion numInvertido <- InvertirNumero ( num )
	Definir cadNum, c, cadNumInvertido como caracter
	cadNum<-ConvertirATexto(num)
	
	Para i<-1 Hasta Longitud(cadNum) Hacer
		c<-Subcadena(cadNum, i, i)
		cadNumInvertido<-Concatenar(c,cadNumInvertido)
	FinPara
	numInvertido<-ConvertirANumero(cadNumInvertido)
Fin Funcion

Funcion esPrimo<-EsNumeroPrimo(num)
	Definir contador Como Entero
	
	contador<-2
	Mientras (num MOD contador <> 0) Hacer
		contador<- contador + 1
	FinMientras
	
	esPrimo <- num = contador
FinFuncion