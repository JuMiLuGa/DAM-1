import java.util.Scanner;

public class EjercicioCond3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		
		double n = entrada.nextInt();
		
		if ((n % 2) == 0) {
		      System.out.println("El número introducido es par");
		    } else {
		      System.out.println("El número introducido es impar");
		    }

		    if ((n % 3) == 0) {
		      System.out.println("y divisible entre 3.");
		    } else {
		      System.out.println("y no es divisible entre 3.");
		    }
				
		    entrada.close();
	}

}
