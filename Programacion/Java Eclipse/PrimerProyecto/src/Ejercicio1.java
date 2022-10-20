//IMPORTAR UTIL PARA HACER ENTRADA DE TEXTO
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//ENTRADA DE TEXTO
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escriba su nombre: ");
		
		String nombre = entrada.nextLine();
		
		//LONGITUD DE PALABRA
		System.out.println(nombre + " tinene " + nombre.length() + " letras");
		
		//MOSTRAR PRIMERA LETRA DE PALABRA
		System.out.println("La primera letra de " + nombre + " es la letra " + nombre.charAt(0));
		
		//MOSTRAR ULTIMA LETRAS DE PALABRA
		System.out.println("La ultima letra de " + nombre + " es la letra " + nombre.charAt(nombre.length()-1));
		
	}

}
