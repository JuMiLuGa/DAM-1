import java.util.Scanner;

public class EjercicioBucles5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca 10 numeros: ");
		int num;
		
		num = entrada.nextInt();
		
		int mayor= num;
		int menor= num;
		
		for(int i=1 ; i<=9 ; i++) {
			 num = entrada.nextInt();
			
			 if(num>mayor) {	
				mayor =num;
			}
			 if(num<menor) {	
					menor =num;
					}	
		}
		entrada.close();
		System.out.println("El numero mayor es: " + mayor);
		System.out.println("El numero menor es: " + menor);
	}
}
