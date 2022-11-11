import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduzca el numero de filas: ");
		int F = entrada.nextInt();
		
		System.out.print("Introduzca el caracter: ");
		String car = entrada.next();

		int numEsp = F-1;
		int numcar = 1;
		
		for(int i = 0 ; i<F ; i++) {
			for(int j = 1 ; j<= numEsp ; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= numcar ; j ++) {
				System.out.print(car);
			}
			numEsp--;
			numcar += 2;
			System.out.println();
		}
	}

}
