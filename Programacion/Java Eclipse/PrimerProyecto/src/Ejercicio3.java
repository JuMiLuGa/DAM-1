import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//PEDIR PRECIO DE TRES PRODUCTOS POR TECLADO
		Scanner Precio = new Scanner(System.in);
		System.out.print("Escriba precio producto nº 1: ");
		double precio1 = Precio.nextDouble();
		
		System.out.print("Escriba precio producto nº 2: ");
		double precio2 = Precio.nextDouble();
		
		System.out.print("Escriba precio producto nº 3: ");
		double precio3 = Precio.nextDouble();
		
		//CALCULOS NECESARIOS PARA REALIZAR LA MEDIA
		
		System.out.println("La media entre los precios de los distintos establecimientos es de: " + ((precio1+precio2+precio3)/3));
	}

}
