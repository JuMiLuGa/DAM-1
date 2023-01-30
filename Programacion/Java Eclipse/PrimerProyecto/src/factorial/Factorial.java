package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int fact = 1;
		
		Scanner ent = new Scanner(System.in);

		System.out.print("Escriba un numero para realizar el factorial: ");
		int n1 = ent.nextInt();
		ent.close();
		
			for (int i = 1; i < n1; i++) {
				fact += fact * i;
			}
		System.out.println("El factorial de " + n1 + " es: " + fact);
	}
}
