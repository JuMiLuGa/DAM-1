package segundaEv;

import java.util.Scanner;

public class factor {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		System.out.println("introduzca un numero: ");
		int num = ent.nextInt();
		ent.close();
		int acumulador = 1;
		for(int i = num ; i > 1 ; i--) {
			acumulador = acumulador * i;
		}

		System.out.println("El factorial de " + num + " es " + acumulador);
	}

}
