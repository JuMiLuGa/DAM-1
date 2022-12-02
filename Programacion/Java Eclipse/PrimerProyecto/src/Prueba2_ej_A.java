import java.util.Scanner;

public class Prueba2_ej_A {

	public static void main(String[] args) {

		// definir los valores de las letras
		final String letras = "TRWAGMYFPDXBNJZSQVHLCKET";

		Scanner ent = new Scanner(System.in);

		String dninumeros = "";

		// pedir por teclado el dni
		System.out.print("Introduzca un numero de DNI seguido de su letra, sin espacios: ");
		String dni = ent.next();

		ent.close();

		// coger solo numeros
		for (int i = 0; i < dni.length() - 1; i++) {
			dninumeros = dninumeros + dni.charAt(i);
		}

		// pasar la cadena a entero
		int dniint = Integer.parseInt(dninumeros);

		// calcular que letra corresponde
		int numletra = dniint % 23;

		char letradni = letras.charAt(numletra);

		String dnicompleto = dninumeros + letradni;

		System.out.println(dnicompleto);

		// comparamos el dni con el dni correcto
		if (dnicompleto.equals(dni)) {
			System.out.println("El DNI introducido es correcto.");
		} else {

			System.out.println("El DNI introducido no es correcto, deberia ser: " + dnicompleto + ".");

		}
	}

}
