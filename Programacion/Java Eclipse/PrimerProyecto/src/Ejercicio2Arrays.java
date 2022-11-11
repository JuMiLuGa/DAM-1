
public class Ejercicio2Arrays {

	public static void main(String[] args) {
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];

		for (int i = 0; i < 20; i++) {
			numero[i] = (int) (Math.random() * 101);
			cuadrado[i] = (numero[i] * numero[i]);
			cubo[i] = (cuadrado[i] * numero[i]);
		}

		System.out.println("Ahora se mostraran en este orden:");
		System.out.println(" Numero | Cuadrado | Cubo ");

		for (int i = 0; i < 20; i++) {
			System.out.println(numero[i] + " " + " " + cuadrado[i] + " " + " " + cubo[i]);
		}

	}

}
