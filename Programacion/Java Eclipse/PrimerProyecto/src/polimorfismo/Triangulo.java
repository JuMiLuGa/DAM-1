package polimorfismo;

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

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
}
