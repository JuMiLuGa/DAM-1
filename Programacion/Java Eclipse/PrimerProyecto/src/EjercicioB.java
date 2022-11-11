
import java.util.Scanner;

public class EjercicioB {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduzca la temperatura: ");
		// pedimos la temperatura
		double temp = entrada.nextDouble();
		// pedimos la unidad
		String unid = entrada.next();

		entrada.close();

		// LAS UNIDADES SERÁN EN MAYÚSCULA

		switch (unid) {
		// si tengo C de celsius lo pasara a farenheit
		case "C":
			System.out.println(temp + "ºC equivalen a " + ((temp * 9 / 5) + 32) + "ºF");
			break;
		// si tengo F de fareheit lo pasara a celsius
		case "F":
			System.out.println(temp + "ºF equivalen a " + ((temp - 32) * 5 / 9) + "ºC");
			break;
		// en el caso que pongamos algo que no corresponda
		default:
			System.out.println("El sistema " + unid + " no se reconoce");
		}
	}
}
