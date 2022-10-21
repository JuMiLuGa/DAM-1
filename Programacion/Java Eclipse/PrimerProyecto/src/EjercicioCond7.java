import java.util.Scanner;

public class EjercicioCond7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//INTRODUCIMOS 1º NUMERO
		System.out.print("Introduzca primer numero");
		int num1 = entrada.nextInt();
		//INTRODUCIMOS 2º NUMERO
		System.out.print("Introduzca segundo numero");
		int num2 = entrada.nextInt();
		//INTRODUCIMOS 3º NUMERO
		System.out.print("Introduzca tercer numero");
		int num3 = entrada.nextInt();
		
		//COMPROBAMOS LAS CONDICIONES DADAS
		
		if(num1 == num2 + num3) {
			System.out.println("La suma del segundo numero y el terecero es igual al primero");
			
		}else if (num2 == num1 + num3) {
			System.out.println("La suma del primer numero y el terecero es igual al segundo");
			
		}else if (num3 == num1 + num2) {
			System.out.println("La suma del primer numero y el segundo es igual al tercero");
			//SI NO CUMPLE NINGUNA DE LAS CONDICIONES:
		}else {
			System.out.println("Los numeros no cumplen la condicion");
		}
		entrada.close();
}
}
