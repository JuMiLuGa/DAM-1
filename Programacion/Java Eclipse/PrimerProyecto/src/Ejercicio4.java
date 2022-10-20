import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//PEDIR POR TECLADO EL SUELDO
		Scanner Sueldo = new Scanner(System.in);
		System.out.print("Escriba sueldo del trabajador: ");
		double salario = Sueldo.nextDouble();
		
		double ret = ((salario*20)/100);
		System.out.println("La retencion sera de: " + ret);
		
		System.out.println("Dinero a cobrar (salario+retencion)es de: " + (ret+salario));

		Sueldo.close();
	}

}
