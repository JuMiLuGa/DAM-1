
public class Ejercicio4Array {

	public static void main(String[] args) {
		int[] numero = new int[20];
		int[] aux = new int[20];

		int contador = 0;

		for (int i = 0; i < 20; i++) {
			numero[i] = (int) (Math.random() * 101);
		}

		for (int i = 0; i < 20; i++) {
			if (numero[i] % 2 == 0) {
				aux[contador] = numero[i];
				contador++;
			}

		}
		for (int i = 0; i < 20; i++) {
			if (numero[i] % 2 != 0) {
				aux[contador] = numero[i];
				contador++;
			}
		}
		for (int auxiliar : aux) {
			System.out.println(auxiliar);
		}
	}
}