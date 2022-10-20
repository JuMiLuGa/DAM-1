import java.util.Scanner;

public class EjercicioCond1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		double num1 = entrada.nextDouble();
		System.out.println("Introduzca el segundo numero");
		double num2 = entrada.nextDouble();
		
		if(num1>num2) {
			System.out.println("El numero " + num2 + " es el menor");
		}else if(num1<num2) {
			System.out.println("El numero " + num1 + " es el menor");
		}else {
			System.out.println("El numero " + num1 + " y el numero " + num2 + " son iguales");
			
		}
		entrada.close();
	}

}
