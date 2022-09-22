Algoritmo calculadora
	
	definir n1, n2 Como Real
	definir Op Como Caracter
	
	Escribir "Primer Numero"
	Leer n1
	
	Escribir "Segundo Numero"
	Leer n2
	
	Escribir "Operacion a realizar"
	Leer Op
	
	si Op="+" Entonces
		escribir n1+n2
		SiNo
			si Op="-" Entonces
				escribir n1-n2
				
				SiNo si Op="*" Entonces
						escribir n1*n2
						
					SiNo 
						si Op="/" Entonces
								escribir n1/n2 
							SiNo si n2=0 Entonces
									escribir "Syntax error"
								FinSi
								
								
							FinSi
					FinSi
			FinSi	
	FinSi
	
	
	
	
	
	

FinAlgoritmo
