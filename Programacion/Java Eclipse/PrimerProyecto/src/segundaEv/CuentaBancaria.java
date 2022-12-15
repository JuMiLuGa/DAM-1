package segundaEv;

public class CuentaBancaria {

	private double tipoInteres;
	private double saldo;

	public void estalecerTipoInteres(double tipo) {

		if (tipo < 0) {
			System.out.println("El tipo de interes no puede ser negativo.");
			return;
		}
		tipoInteres = tipo;

	}

	public void ingresar(double cantidad) {
		saldo += cantidad;
	}

	public void retirar(double cantidad) {

		if (cantidad - saldo > 0) {
			System.out.println("Saldo insuficiente.");
			return;
		}

		saldo -= cantidad;
	}

	public double obtenerSaldo() {

		return saldo;

	}

	public void abonarIntereses() {

		saldo += saldo * tipoInteres;
	}

	public static void main(String[] args) {
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.ingresar(1000);
		cuenta.estalecerTipoInteres(0.02);

		System.out.println("Su cuenta tiene un saldo de " + cuenta.obtenerSaldo());

		cuenta.ingresar(500);
		cuenta.retirar(200);

		System.out.println("Su cuenta tiene un saldo de " + cuenta.obtenerSaldo());

		cuenta.abonarIntereses();

		System.out.println("Su cuenta tiene un saldo de " + cuenta.obtenerSaldo());
	}
}
