
public class Ejercicio2ArrayBidimensional {

	public static void main(String[] args) {
		int[][] matriz = new int[4][5];
		

		//Dar los valores a la matriz
		for(int i = 0 ; i<matriz.length ; i++) {
			for(int j = 0 ; j<matriz[i].length ; j++) {
				
				matriz[i][j] = (int) ((Math.random()*10)+1);
			}
		}
		int sumaFila;
		//mostrar valores matriz
		for (int i = 0; i < matriz.length; i++) {
			sumaFila=0;
			for (int j = 0; j < matriz[i].length; j++) {
				sumaFila+=matriz[i][j]; // Equivalente a: sumaFila = sumaFila + matriz[i][j]
				System.out.printf("%3d",matriz[i][j]);
			}
			System.out.println(" = " + sumaFila);
		}
		
		System.out.println("---------------------");
		int sumaColumna;		
		for(int i = 0 ; i < matriz[0].length ; i++ ) {
			sumaColumna = 0;
			for(int j = 0 ; j < matriz.length ; j++) {
				if(matriz[j][i] % 2 == 0) {
					sumaColumna+=matriz[j][i];
				}
			}
			System.out.printf("%3d",sumaColumna);
		}
		
	}

}
