import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		//PEDIR POR TECLADO LA BASE
		Scanner triangulo = new Scanner(System.in);
		System.out.print("Escriba la base del triangulo: ");
		double base = triangulo.nextDouble();
		
		//PEDIR POR TECLADO LA ALTURA
		System.out.print("Escriba la altura del triangulo: ");
		double altura = triangulo.nextDouble();
		
		//CALCULOS NECESARIOS PARA CALCULAR EL AREA
		System.out.println("El area del triangulo de "+ altura +"cm de alto y "+ base +"cm de base es de: "+ ((altura*base)/2)+ "cm");
		triangulo.close();
	}

}
