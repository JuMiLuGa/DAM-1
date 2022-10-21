import java.util.Scanner;

public class EjercicioCond8 {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);

	System.out.println("Introducir la nota: ");
	int nota = entrada.nextInt();
			
		switch(nota) {
			
			case 0:
			case 1: 
			case 2:
			case 3:
			case 4:
				System.out.println("Insuficiente");
		break;
				
			case 5:
				System.out.println("Suficiente");
			
			case 6:
			case 7:
				System.out.println("Bien");
		break;
			
			case 8:
			case 9:
				System.out.println("Notable");
		break;
			
			case 10:
				System.out.println("Sobresaliente");
		break;
			
			default:
				System.out.println("La nota que has introducido no es valida");
			}
entrada.close();
	}
}
