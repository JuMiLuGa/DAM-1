Algoritmo Multiplo_de_9_sumando_digitos_de_cadena_de_numeros
		
	leer CadenaEntrada
	
	Repetir
		
		suma<-0
		Para i<-1 Hasta Longitud(CadenaEntrada) Hacer
			
			c<-Subcadena(CadenaEntrada, i, i)
			digito<-ConvertirANumero(c)
			
			suma<-suma+digito
		FinPara
		CadenaEntrada<-ConvertirATexto(suma)
	
	Hasta Que suma < 10
	
	si suma = 9 Entonces
		Escribir "el numero " suma " es multiplo de 9"
	SiNo
		Escribir "el numero " suma " no es multiplo de 9"
	FinSi
	
	
FinAlgoritmo

