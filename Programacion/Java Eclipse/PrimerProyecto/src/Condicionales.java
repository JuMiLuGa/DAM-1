import java.util.Scanner;

public class Condicionales {
//ENTRADA POR TECLADO
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = entrada.nextInt();
		entrada.close();
		//INICIO DE SI
		if(num<0) {
			System.out.println("El numero introducido es negativo");
		}else if(num>0) {
			System.out.println("El numero introducido es positivo");
		}else {
			System.out.println("Has escrito 0");
		}

	}

}
