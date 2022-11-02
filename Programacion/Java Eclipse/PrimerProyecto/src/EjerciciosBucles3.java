import java.util.Scanner;

public class EjerciciosBucles3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Escriba un numero: ");
		int suma = 0;
		int contador = 0;
		int num = entrada.nextInt();

		entrada.close();

		for (int i = num; i >= 1; i--) {
			if (num % i == 0) {
				suma = suma + i;
				contador++;
				System.out.println("El numero " + i + " es divisor de " + num + ".");
				
			}
		}
		double media = (suma/contador);
		
		System.out.println("El numero " + num + " tiene " + contador + " divisores.");
		System.out.println("La media de los divisores es " + media + ".");
	}
}
