import java.util.*;
public class Calculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un numero entero para calcular su factorial");
		int resultado = 1;
		int numero = entrada.nextInt();
		entrada.close();
		
		for(int i = numero ; i>1 ; i-- ) {
			resultado = resultado*i;
		}
		
		
		System.out.println("El factorial de "+ numero + " es " + resultado);
	}
}
