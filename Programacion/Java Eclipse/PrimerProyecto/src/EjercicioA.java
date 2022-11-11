

import java.util.Scanner;

public class EjercicioA {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// pide el año por teclado
		System.out.print("Introduzca un año: ");
		int año = entrada.nextInt();

		entrada.close();

		// comprueba si es divisible entre 4 y si no es divisible entre 100
		if (año % 100 != 0 && año % 4 == 0) {
			// si es divisible entre 4 y si no es divisible entre 100 sera bisiesto
			System.out.println("El año " + año + " es bisiesto.");
		} else {
			// si no cumple la condicion anterior no será bisiesto
			System.out.println("El año " + año + " no es bisiesto.");
		}

	}

}
