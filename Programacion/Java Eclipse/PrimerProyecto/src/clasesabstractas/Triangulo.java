package clasesabstractas;

public class Triangulo extends Figura {
	private int base;
	private int altura;

	public Triangulo(int base, int altura, String color) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double area() {
		return base * altura / 2.0;
	}
}
