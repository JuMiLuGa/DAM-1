
public class Primos2a100 {

	public static void main(String[] args) {

		boolean esPrimo = true;
		for (int j = 2; j <= 100; j++) {
			esPrimo = true;
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					esPrimo = false;
					break;
				}
			}

			if (esPrimo) {
				System.out.println("-" + j + " --> Es primo");
			} else {
				System.out.println("-" + j + " --> No es primo");
			}

		}

	}
}