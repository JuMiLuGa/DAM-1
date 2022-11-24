import java.util.Scanner;
public class Ejercicio6ArrayBidimensional {

	public static void main(String[] args) {
		int[][] matriz = new int[2][4];
		Scanner ent = new Scanner(System.in);
		System.out.println("Dar valores a la matriz");
		// Dar los valores a la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = ent.nextInt();
			}
		}
		System.out.println("Matriz normal");
		System.out.println();
		// mostrar valores matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Matriz traspuesta");
		System.out.println();

		// mostrar valores matriz traspuesta
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				System.out.print(matriz[j][i] + " ");
			}
			System.out.println();
		}

	}

}
