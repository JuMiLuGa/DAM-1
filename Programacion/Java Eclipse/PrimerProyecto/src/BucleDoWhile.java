import java.util.*;

public class BucleDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Introduzca un numero impar: ");
			numero = entrada.nextInt();
			
			
		}while(numero % 2 != 0);
		entrada.close();
		System.out.println("El numero "+ numero + " es par asi que finaliza");
		
	}

}
