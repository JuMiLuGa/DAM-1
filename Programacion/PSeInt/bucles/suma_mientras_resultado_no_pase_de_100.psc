Algoritmo suma_mientras_resultado_no_pase_de_100
	definir n1, n2 Como Entero
	Escribir "introduzca dos numeros para proceder a la suma de los mismos"
	Leer n1, n2
	Mientras n1+n2>100 Hacer
		escribir "la suma de " n1 " y ", n2 " no es valida"
		Leer n1, n2
	FinMientras
	
	Escribir "la suma de " n1 " y ",n2 " es: " n1+n2
	
FinAlgoritmo
