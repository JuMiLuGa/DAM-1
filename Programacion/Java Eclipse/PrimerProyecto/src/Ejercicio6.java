import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introducir el valor 1");
		double x = entrada.nextDouble();
		System.out.println("Introducir el valor 2");
		double y = entrada.nextDouble();
		
		System.out.println("El valor de X es " + x + " y el valor de Y es " + y);
		
		double aux = x;
		 x = y;
		 y = aux;
		
		System.out.println("El valor de X es " + x + " y el valor de Y es " + y);
		
		entrada.close();
	}

}
