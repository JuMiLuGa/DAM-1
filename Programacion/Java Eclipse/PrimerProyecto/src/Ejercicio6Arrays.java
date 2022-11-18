import java.util.Scanner;

public class Ejercicio6Arrays {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] num = new int[10];
		
		System.out.println("Escriba 10 numeros");
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("Numero " + (i+1) + "º : ");
			num[i] = entrada.nextInt();
		}
		
		entrada.close();

		int M = num[0];
		int m = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > M) {
				M = num[i];
			}
			if (num[i] < m) {
				m = num[i];
			}
		}

		for (int i = 0; i < num.length; i++) {
		
			if (num[i] == M) {
				System.out.println( num[i] + " Maximo");
			}else if (num[i] == m) {
				System.out.println( num[i] + " Mínimo");
			}else {
				System.out.println(num[i]);
			}
		}
	}
}

