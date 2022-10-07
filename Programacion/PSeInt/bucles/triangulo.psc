Proceso triangulo
definir altura,x,i,j como entero

cont<-"*"

escribir "ingrese altura:"
	leer altura;
	
	Para x<-1 Hasta altura Con Paso 1 Hacer
		
		escribir cont
		cont<-cont+"*"
		
	FinPara
	
	Para i<- altura Hasta 1 Con Paso -1 Hacer
		cont<- ""
		altura<-altura-1
		
		Para j<-altura Hasta 1 Con Paso -1 Hacer
			
			cont<- cont+"*"
		FinPara
		
		escribir cont
	FinPara
FinProceso
