import java.util.Scanner;

public class ejercicio1Arays {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		int contador = 0;
		int contadorinv = 9;
		int contadorder = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca 10 numeros");

		for (int i = 1; i < 11; ++i) {
			System.out.print("Escriba el numero " + (contador+1) + "º: ");
			numeros[contador] = entrada.nextInt();
			contador++;

		}

		System.out.println("Los numeros en el orden que los has escrito es:  ");
		for (int i = 1; i < 11; ++i) {

			System.out.print(numeros[contadorder++] + " ");
		}
		System.out.println(" ");

		System.out.println("Los numeros al revés del orden que los has escrito es:  ");
		for (int i = 1; i < 11; ++i) {

			System.out.print(numeros[contadorinv--] + " ");
		}

	}

}
