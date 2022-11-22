
public class Ejercicio4ArrayBidimensional {

	public static void main(String[] args) {
		int[][] matriz = new int[3][7];

		// Dar valores a la matriz entre 5 y 20
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) ((Math.random() * 16) + 5);
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("%3d", matriz[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		//numero menor de cada fila y decir en que columna está
		for (int i = 0; i < matriz.length; i++) {
			int m = matriz[i][0];
			int f = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < m) {
					m = matriz[i][j];
					f = j;
				}
			}
			System.out.println("Número menor fila " + (i + 1) + " (" + m + ") está en la columna " + (f + 1));
		}
		System.out.println();
		//numero mayor de cada columna y decir en que fila está
		for (int i = 0 ; i < matriz[0].length ; i++ ) {
			int M = matriz[0][i];
			int c = 0;
			for(int j = 0 ; j < matriz.length ; j++) {
				if (matriz[j][i] > M) {
					M = matriz[j][i];
					c = j;
				}
			}
			System.out.println("Número mayor columna " + (i + 1) + " (" + M + ") está en la fila " + (c + 1));
		}
	}

}
