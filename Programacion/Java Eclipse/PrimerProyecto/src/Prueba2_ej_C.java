import java.util.Scanner;

public class Prueba2_ej_C {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		// pedimos por teclado el numero de filas
		System.out.print("Introduzca la cantidad de filas: ");
		int numF = ent.nextInt();

		// pedimos por teclado el numero de columnas
		System.out.print("Introduzca la cantidad de columnas: ");
		int numC = ent.nextInt();

		// pedimos por teclado el caracter del contorno
		System.out.print("Introduzca el caracter para el contorno: ");
		String cc = ent.next();

		// pedimos por teclado el caracter del relleno
		System.out.print("Introduzca el caracter para el relleno: ");
		String cr = ent.next();

		ent.close();

		String[][] matriz = new String[numF][numC];

		// dar un caracter a los valores de los bordes y del relleno
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				// BORDES
				if (j == 0 || j == matriz[i].length - 1) {
					matriz[i][j] = cc;
				} else if (i == 0 || i == matriz.length - 1) {
					matriz[i][j] = cc;
					// RELLENO
				} else {
					matriz[i][j] = cr;
				}

			}

		}
		// Mostrar la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
