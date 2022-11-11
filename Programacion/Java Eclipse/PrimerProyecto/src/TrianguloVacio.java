import java.util.Scanner;

public class TrianguloVacio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca el número de filas: ");
		int numFilas = entrada.nextInt();
		System.out.print("Introduzca el caracter: ");
		String caracter = entrada.next();

		int numEspacios = numFilas - 1;
		int numCaracteres = 1;

		// Espacios
		for (int i = 1; i <= numFilas; i++) {
			for (int j = 1; j <= numEspacios; j++) {
				System.out.print(" ");
			}
			
			// Triangulo
			for (int j = 1; j <= numCaracteres; j++) {
				if (j == 1 || i == numFilas || j == numCaracteres) {
					System.out.print(caracter);
					
					// Vaciado
				} else {
					System.out.print(" ");
				}
			}
			numEspacios--;
			numCaracteres += 2;
			System.out.println();
		}
	}

}
