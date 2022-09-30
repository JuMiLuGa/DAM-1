Algoritmo mayor_y_menor_4digitos
	
definir A, B, C, D Como Entero
Leer A, B, C, D
	
Si A>B y A>C y A>D Entonces
	M<-A
SiNo
	si B>A y B>C y B>D Entonces
		M<-B
	SiNo
		Si C>A y C>B y C>D Entonces
			M<-C
		SiNo
			Si D>A y D>B y D>C Entonces
				M<-D
			FinSi
		FinSi
	FinSi
FinSi
Si A<B y A<C y A<D Entonces
	n<-A
SiNo
	si B<A y B<C y B<D Entonces
		n<-B
	SiNo
		Si C<A y C<B y C<D Entonces
			n<-C
		SiNo
			Si D<A y D<B y D<C Entonces
				n<-D
			FinSi
		FinSi
	FinSi
FinSi

Escribir "el mayor es " M
Escribir "el menor es " n

Escribir m+n

FinAlgoritmo
