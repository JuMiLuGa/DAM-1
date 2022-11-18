
public class ArraysBidimensionales {

	public static void main(String[] args) {
		//primer[] es hacia abajo el segundo hacia la derecha
		// el el caso de [3][4]
		//XXXX
		//XXXX
		//XXXX
		
		int[][] matriz = new int[3][4];
		
		matriz[0][0] = 12;
		matriz[0][1] = 13;
		matriz[0][2] = 46;
		matriz[0][3] = 78;
		
		matriz[1][0] = 78;
		matriz[1][1] = 45;
		matriz[1][2] = 56;
		matriz[1][3] = 89;
		
		matriz[2][0] = 47;
		matriz[2][1] = 65;
		matriz[2][2] = 23;
		matriz[2][3] = 99;
								
		//fin de matriz
								
		//System.out.println(matriz[2][1]);
		
		for(int i=0; i<matriz.length;i++) {
			for(int j=0 ; j<matriz[i].length;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
