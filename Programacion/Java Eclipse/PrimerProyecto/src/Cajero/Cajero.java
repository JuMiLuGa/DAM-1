package Cajero;

import java.util.Scanner;

class Cajero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cuenta cuenta = null;
		int opcion;
		float cantidad;
		do {
			System.out.println("1.- Crear cuenta vacía.");
			System.out.println("2.- Crear cuenta con saldo inicial.");
			System.out.println("3.- Ingresar dinero.");
			System.out.println("4.- Sacar dinero.");
			System.out.println("5.- Ver saldo.");
			System.out.println("6.- Salir.");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				cuenta = new Cuenta();
				System.out.println("Cuenta vacía creada.");
				break;
			case 2:
				System.out.println("Introduce el saldo inicial:");
				cantidad = sc.nextFloat();
				cuenta = new Cuenta(cantidad);
				System.out.println("Cuenta con saldo inicial de " + cantidad + " creada.");
				break;
			case 3:
				if (cuenta == null) {
					System.out.println("Debe crear una cuenta primero.");
				} else {
					System.out.println("Introduce la cantidad a ingresar:");
					cantidad = sc.nextFloat();
					cuenta.ingresar(cantidad);
					System.out.println("Ingreso de " + cantidad + " realizado.");
				}
				break;
			case 4:
				if (cuenta == null) {
					System.out.println("Debe crear una cuenta primero.");
				} else {
					System.out.println("Introduce la cantidad a extraer:");
					cantidad = sc.nextFloat();
					cuenta.extraer(cantidad);
					System.out.println("Extracción de " + cantidad + " realizada.");
				}
				break;
			case 5:
				if (cuenta == null) {
					System.out.println("Debe crear una cuenta primero.");
				} else {
					System.out.println("Saldo actual: " + cuenta.getSaldo());
				}
				break;
			case 6:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción invalida. Por favor, seleccione una opción valida.");
			}
		} while (opcion != 6);
		sc.close();
	}
}
