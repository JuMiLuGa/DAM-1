import java.util.Scanner;
public class EjercicioCond9 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		String lunes = ("Sistemas Informaticos");
		String martes = ("Bases de Datos");
		String miercoles = ("Contornos de Desenvolvemento");
		String jueves = ("Bases de Datos");
		String viernes = ("Programación");
		
		System.out.println("Elija un dia");
		System.out.println("Lunes");
		System.out.println("Martes");
		System.out.println("Miercoles");
		System.out.println("Jueves");
		System.out.println("Viernes");
		String dia = entrada.next();
		
		switch (dia) {
		case "lunes": 
			System.out.println("El lunes a primera hora toca " + lunes);
			break;
		case "martes":
			System.out.println("El martes a primera hora toca " + martes);
			break;
		case "miercoles":
			System.out.println("El miercoles a primera hora toca " + miercoles);
			break;
		case "jueves":
			System.out.println("El jueves a primera hora toca " + jueves);
			break;
		case "viernes":
			System.out.println("El viernes a primera hora toca " + viernes);
			break;
		default:
			System.out.println("Dia libre");
		}
		entrada.close();
	}
}
