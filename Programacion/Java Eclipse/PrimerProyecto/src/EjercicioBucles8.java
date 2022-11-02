import java.util.Scanner;

public class EjercicioBucles8 {

	public static void main(String[] args) {
		
		int base;
		int exponente;
		int resultado = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escribir la base: ");
		base = entrada.nextInt();
		
		System.out.print("Escribir el exponente: ");
		exponente = entrada.nextInt();
		
		entrada.close();
		
			for(int i=1 ; i<=exponente; i++ ) {
			
				resultado = resultado + base;
			
			}
System.out.println(resultado);
	}

}
