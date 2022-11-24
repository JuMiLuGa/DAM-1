import java.util.Scanner;

public class Ejercicio5ArrayBidimensional {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] matriz = new int[4][4];
		int simetrica = 0;
		
		System.out.println("introduce los valores para la matriz");
		//pedir numeros para la matriz
		for(int i = 0 ; i<matriz.length; i++) {
			for(int j = 0 ; j<matriz[i].length; j++) {
				matriz[i][j] = entrada.nextInt();
			}
		}
		//comprobar simetria
		for(int i = 0 ; i<matriz.length; i++) {
			for(int j = 0 ; j<matriz[i].length; j++) {
				if(matriz[i][j] != matriz[j][i]) {
					simetrica = 1;
				}
			}
		}
		//imprimir la matriz
		for(int i = 0 ; i<matriz.length; i++) {
			for(int j = 0 ; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		//hacer la comprobacion para que escriba simetrica o no simetrica
		if(simetrica == 1) {
			System.out.println("No es simétrica");
		}else {
			System.out.println("Es simétrica");
		}
		
		if(simetrica != 1) {
			System.out.println("introduzca la columna que quiere cambiar");
			int colcam = entrada.nextInt();
			
			System.out.println("introduzca la fila que quiere cambiar");
			int filcam = entrada.nextInt();
			
			System.out.println("introduzca el valor por el que quiere cambiar");
			int cambio = entrada.nextInt();	
			
			colcam = colcam-1;
			filcam = filcam-1;
			
			matriz[filcam][colcam] = cambio;
			
			simetrica = 0;
			
			//comprobar simetria
			for(int i = 0 ; i<matriz.length; i++) {
				for(int j = 0 ; j<matriz[i].length; j++) {
					if(matriz[i][j] != matriz[j][i]) {
						simetrica = 1;
					}
				}
			}
			//imprimir la matriz
			for(int i = 0 ; i<matriz.length; i++) {
				for(int j = 0 ; j<matriz[i].length; j++) {
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println();
			}
			//hacer la comprobacion para que escriba simetrica o no simetrica
			if(simetrica == 1) {
				System.out.println("No es simétrica");
			}else {
				System.out.println("Es simétrica");
			}
		}
	}
}
