package segundaEv;

public class Racional {

	private int numerador;
	private int denominador;

	public void asignarDatos(int num, int den) {

		numerador = num;
		
		if (den == 0) {
			den = 1; // el denominador no puede ser 0
		}
		
		denominador = den;

	}

	public void visualizarRacional() {
		System.out.println(numerador + "/" + denominador);
	}

	public static Racional sumar(Racional a, Racional b) {

		Racional resultado = new Racional();

		int num = a.numerador * b.denominador + b.numerador * a.denominador;
		int den = a.denominador * b.denominador;

		resultado.asignarDatos(num, den);

		return resultado;
	}

	public static void main(String[] args) {
		Racional r1, r2, r3;
		r1 = new Racional();
		r2 = new Racional();
		r3 = new Racional();

		r1.asignarDatos(2, 5);
		r2.asignarDatos(3, 7);

		System.out.print("1º: ");
		r1.visualizarRacional();

		System.out.println();

		System.out.print("2º: ");
		r2.visualizarRacional();

		System.out.println();

		r3 = sumar(r1, r2);

		System.out.print("Resultado: ");
		r3.visualizarRacional();
	}
}