import java.util.Scanner;

public class EjercicioCond5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escriba un numero de 4 cifras");
		
		String num = entrada.nextLine();
		
		if (num.length()>4) {
			System.out.println("El numero tiene mas de 4 cifras");			
		}else {
			System.out.print(num.charAt(3));
			System.out.print(num.charAt(2));
			System.out.print(num.charAt(1));
			System.out.print(num.charAt(0));
		}
			
		entrada.close();

	}

}
