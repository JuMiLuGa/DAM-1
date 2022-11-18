import java.util.Scanner;
public class Ejercicio5Arrays {

	public static void main(String[] args) {
		int mult;
		int[] num = new int[20];
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 401);
		}
		
		System.out.print("Que multiplos quieres ver: ");
		mult = entrada.nextInt();
		entrada.close();
		
		for (int j = 0; j<num.length; j++) {
			if (num[j] % mult == 0) {
				System.out.println("[" + num[j] + "] ");
			}else {
				System.out.println( num[j] );
			}
		}
	}

}
