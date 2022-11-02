import java.util.Scanner;

public class EjercicioBucles6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduzca un numero: ");
		int num = entrada.nextInt();
		int multiplos;
		int res;
		
		System.out.print("Introduzca cuantos multiplos quiere ver: ");
		multiplos = entrada.nextInt();
		entrada.close();
		for(int i=1 ; i<=multiplos ; i++) {
			
			res = (num*i);
			
			System.out.print(res + ",");
				}
		}	
}


