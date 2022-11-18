
public class Ejercicio3ArrayBidimensional {

	public static void main(String[] args) {
int[][] matriz = new int[4][5];
int[] arrayF = new int[4];
int[] arrayC = new int[5];

		//Dar los valores a la matriz
		for(int i = 0 ; i<matriz.length ; i++) {
			for(int j = 0 ; j<matriz[i].length ; j++) {
				
				matriz[i][j] = (int) ((Math.random()*10)+1);
			}
		}
		
		//mostrar valores matriz
		for (int i = 0; i < matriz.length; i++) {
			arrayF[i]=0;
			for (int j = 0; j < matriz[i].length; j++) {
				arrayF[i]+=matriz[i][j]; // Equivalente a: sumaFila = sumaFila + matriz[i][j]
				System.out.printf("%3d",matriz[i][j]);
			}
			System.out.println(" = " + arrayF[i]);
		}
		
		System.out.println("---------------------");
		
		for(int i = 0 ; i < matriz[0].length ; i++ ) {
			arrayC[i] = 0;
			for(int j = 0 ; j < matriz.length ; j++) {
				if(matriz[j][i] % 2 == 0) {
					arrayC[i]+=matriz[j][i];
				}
			}
			System.out.printf("%3d",arrayC[i]);
		}
	}

}
