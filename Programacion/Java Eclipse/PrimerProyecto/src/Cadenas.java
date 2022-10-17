
public class Cadenas {

	public static void main(String[] args) {
		
		String nombre = "Julio";
		
		//LONGITUD DE PALABRA
		System.out.println(nombre + " tinene " + nombre.length() + " letras");
		
		//MOSTRAR n LETRA DE PALABRA
		System.out.println("La tercera letra de " + nombre + " es la letra " + nombre.charAt(2));
		
		//MOSTRAR n LETRAS DE PALABRA
		System.out.println(nombre.substring(1, 4));

		//COMPARAR CADENAS
		System.out.println(nombre.equals("Julio"));
	}

}
