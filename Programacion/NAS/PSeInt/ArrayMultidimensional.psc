Algoritmo ArrayMultidimensional
	Definir valores Como Entero
	Dimension valores[4,5]
	
	Para i<-1 Hasta 4 Hacer
		para j<-1 Hasta 5 Hacer
			valores[i,j]=AZAR(9)
		FinPara
	FinPara
	
	Para i<-1 Hasta 5 Hacer
		para j<-1 Hasta 4 Hacer
			Escribir valores[j,i], " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
