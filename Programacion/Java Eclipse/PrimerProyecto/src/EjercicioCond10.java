import java.util.Scanner;

public class EjercicioCond10 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
System.out.println("Escriba un numero entre el 1 y el 7 y te dara el dia de la semana");
int dia = entrada.nextInt();

	switch (dia) {
	case 1:
		System.out.println("Es Lunes");
	break;
	case 2:
		System.out.println("Es Martes");
	break;
	case 3:
		System.out.println("Es Miercoles");
	break;
	case 4:
		System.out.println("Es Jueves");
	break;
	case 5:
		System.out.println("Es Viernes");
	case 6:
		System.out.println("Es Sabado");
	break;
	case 7:
		System.out.println("Es Domingo");
	break;
	
	default:
		System.out.println("El numero introducido esta fuera del rango");
				}
entrada.close();
	}

}
