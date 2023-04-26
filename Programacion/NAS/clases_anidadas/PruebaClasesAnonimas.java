package clases_anidadas;

public class PruebaClasesAnonimas {

	public static void main(String[] args) {
		
		double lado = 7.5;
		
		Figura pepe = new Figura() {
			
			@Override
			public double area() {
				return lado * lado;
			}
		};
		
		System.out.println("El área de un cuadrado de lado "
				+ lado + " es: " + pepe.area());
	}

}
