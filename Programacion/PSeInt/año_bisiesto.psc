Algoritmo a�o_bisiesto
	
	definir A�O Como Entero
	Leer A�O
	
	Si A�O mod 400=0
		
		Escribir "el a�o " A�O  " es bisiesto"
		
	SiNo
		si A�O mod 4=0 y A�O mod 100<>0
		
			Escribir "el a�o "  A�O  " es bisiesto"
		SiNo
			
			Escribir "el a�o "  A�O  " no es bisiesto"
			
		FinSi
	
	FinSi
	
FinAlgoritmo