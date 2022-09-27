Algoritmo ordenar_numeros
	Escribir "introducir 3 numeros"
	
	Leer n1, n2, n3
	
	si n1<n2 y n2<n3 Entonces
		Escribir n1, n2, n3
	SiNo
		si n3<n2 y n2<n1
			Escribir n3, n2, n1
		SiNo
			si n1<n3 y n3>n2
				Escribir n2, n1, n3
			SiNo
				si	n3<n1 y n1<n2
					Escribir n3, n1, n2
				SiNo
					si n2<n1 y n1<n3
						Escribir n2, n1, n3
					SiNo si n1<n3 y n2>n3
							Escribir n1, n3, n2
						SiNo
							Escribir n2, n3, n1
							
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi

FinAlgoritmo
