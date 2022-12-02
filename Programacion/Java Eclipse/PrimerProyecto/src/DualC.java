import java.util.Scanner;

public class DualC {

	public static void main(String[] args) {

		// variables inicio
		int dim;
		// variables fin

		Scanner ent = new Scanner(System.in);

		// definimos la matriz
		System.out.print("Indica de cuanto quieres la orden: ");
		dim = ent.nextInt();
		ent.close();
		System.out.println("Has indicado que la matriz sea de " + dim + "X" + dim);
		int[][] matriz = new int[dim][dim];
		System.out.println();

		// rellenamos la matriz de la forma correspondiente
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				matriz[x][y] = 0;
				if (x >= y) {
					matriz[x][y] = (int) (Math.random() * 10);
				}
			}

		}
		// mostramos la matriz
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				System.out.print(matriz[x][y] + " ");
			}
			System.out.println();
		}
	}

}
