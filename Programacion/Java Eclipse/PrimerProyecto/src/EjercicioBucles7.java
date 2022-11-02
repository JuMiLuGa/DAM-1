import java.util.Scanner;

public class EjercicioBucles7 {

	public static void main(String[] args) {
		
		int resultado = 0; 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escribir primer factor: ");
		int f1 = entrada.nextInt();
		
		System.out.print("Escribir segundo factor: ");
		int f2 = entrada.nextInt();
		
		entrada.close();
	
		for(int i=1 ; i<=f2; i++ ) {
			
			resultado = resultado +f1;
			
		}
		
System.out.println(f1 + " X " + f2 + " = " + resultado);
	}
	

}
