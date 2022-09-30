Algoritmo año_bisiesto
	
	definir AÑO Como Entero
	Leer AÑO
	
	Si AÑO mod 400=0
		
		Escribir "el año " AÑO  " es bisiesto"
		
	SiNo
		si AÑO mod 4=0 y AÑO mod 100<>0
		
			Escribir "el año "  AÑO  " es bisiesto"
		SiNo
			
			Escribir "el año "  AÑO  " no es bisiesto"
			
		FinSi
	
	FinSi
	
FinAlgoritmo