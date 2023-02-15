package recursivo;

public class Recursividad {

	static int factorialRecursivo(int numero) {
//      System.out.println("Calculando el factorial de :" + numero);
		if (numero == 0)
			return 1;
		return numero * factorialRecursivo(numero - 1);
	}

	static void imprimir(int numero) {
		if (numero > 0) {
			imprimir(numero - 1);
			System.out.print(numero + " ");
		}
	}

	static boolean impar(int numero) {
		System.out.println("¿" + numero + " es impar?");
		if (numero == 0)
			return false;
		else
			return par(numero - 1);
	}

	static boolean par(int numero) {
		System.out.println("¿" + numero + " es par?");
		if (numero == 0)
			return true;
		else
			return impar(numero - 1);
	}

	static int obtenerCantidadDigitos(int num) {
		if (num <= 0)
			return 0;
		return obtenerCantidadDigitos(num / 10) + 1;
	}

	static int obtenerSumaNumeros(int num) {
		if (num <= 0) {
			return num;
		} else {
			return num % 10 + obtenerSumaNumeros(num / 10);
		}
	}

	static int obtenersumaNumero(int num) {
		if (num == 0)
			return 0;
		return num + obtenersumaNumero(num - 1);
	}

	public static int fibonacciB(int num) {
		int a = 0, b = 1, c;
		if (num == 0)
			return a;
		for (int i = 2; i <= num; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	public static int fibonacciR(int num) {
		if (num <= 1)
			return num;
		else
			return fibonacciR(num - 1) + fibonacciR(num - 2);
	}

	public static void main(String[] args) {

		System.out.println(factorialRecursivo(5));
		imprimir(3);
		System.out.println(impar(7));
		System.out.println(obtenerCantidadDigitos(34752));
		System.out.println(obtenerSumaNumeros(120));
		System.out.println(obtenersumaNumero(5));
		System.out.println("Fibonacci con bucle de " + 8 + " es " + fibonacciB(8));
		System.out.println("Fibonacci con recursividad de " + 8 + " es " + fibonacciR(8));

	}

}