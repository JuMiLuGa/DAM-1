import java.util.Scanner;

public class CalculadoraSteamMarket {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escriba el precio de venta");
		double precio = entrada.nextDouble();
		entrada.close();
		
		double precioF = ((precio/1.15)-0.01);

		System.out.println("Recibira " + precioF + "€ si lo vende al precio de " + precio + "€");
	}

}
