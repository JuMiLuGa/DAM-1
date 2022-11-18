
public class Ejercicio1ArrayBidimensional {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i] == matriz[j]) {
					System.out.print("1" + " ");
				} else {
					System.out.print("0" + " ");
				}
			}
			System.out.println();
		}
	}

}
