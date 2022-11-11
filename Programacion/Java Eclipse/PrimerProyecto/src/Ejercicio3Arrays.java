import java.util.Scanner;

public class Ejercicio3Arrays {

	public static void main(String[] args) {
		int[] numero = new int[15];
		int aux; 
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 15; i++) {
			System.out.print("Introduzca un numero para el " + (i + 1) + "º: ");
			numero[i] = entrada.nextInt();
		}

		entrada.close();

		System.out.println("Rotando el orden quedaria asi: ");
		aux = (numero[numero.length-1]);
		
		
		for (int i = numero.length-1; i > 0; i--) {
			numero[i] = numero[i-1] ;
		}
		
		numero[0] = aux;
		
		for(int j: numero) {
			System.out.println(j);
		}
		
	}

}
