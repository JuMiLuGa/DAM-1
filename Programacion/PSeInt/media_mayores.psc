Algoritmo media_mayor_menor
	
	Definir A, B, C, D Como Entero
	Leer A, B, C, D
	
	si A<B y A<C y A<D Entonces
		Escribir "la media de los mayores es de : " (B+C+D)/3
		sino si B<A y B<C y B<D Entonces
				Escribir "la media de los mayores es de : " (A+C+D)/3
			SiNo
				si C<B y C<A y C<D Entonces
					Escribir "la media de los mayores es de : " (A+B+D)/3
				sino
					Escribir "la media de los mayores es de : " (A+B+C)/3
						
				FinSi
			FinSi
			
	FinSi
FinAlgoritmo
