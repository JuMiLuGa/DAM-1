
import java.util.Scanner;

public class EjercicioD {

	public static void main(String[] args) {

		int suma = 0;

		Scanner entrada = new Scanner(System.in);

		// pedimos por teclado el numero a comprobar
		System.out.print("Introduzca un numero: ");
		int num = entrada.nextInt();

		entrada.close();
		// comprobamos los numeros uno a uno
		for (int i = 1; i < num; i++) {

			if (num % i == 0) {
				suma = suma + i;
			}

		}
		// si la suma de los divisores es igual al numero
		if (suma == num) {
			System.out.println("El numero " + num + " es perfecto, ya que la suma de sus divisores excepto el mismo es " + suma);
			// si no cumple la condicion dada
		} else {
			System.out.println("El numero " + num + " no es perfecto, ya que la suma de sus divisores excepto el mismo es " + suma);
		}
	}
}
