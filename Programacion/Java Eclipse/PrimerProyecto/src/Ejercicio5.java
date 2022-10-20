import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca el primer numero");
		double num1 = entrada.nextDouble();
		System.out.print("Introduzca el segundo numero");
		double num2 = entrada.nextDouble();
		System.out.print("Introduzca el tercer numero");
		double num3 = entrada.nextDouble();
		
		double media = ((num1+num2+num3)/3);
		
		System.out.println("La media entre los numeros" + num1 + " " + num2 + " " + " y " + num3 + " es igual a: " + media);
		
		entrada.close();
	}

}
