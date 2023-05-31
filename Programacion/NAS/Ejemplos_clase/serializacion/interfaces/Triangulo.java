package serializacion.interfaces;

public class Triangulo extends Figura implements OperacionesBasicas, OperacionesAvanzadas {
	private static final long serialVersionUID = 1L;
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

	@Override
	public void rotar(int grados) {
		if (grados > OperacionesBasicas.rotacionMinima)
			System.out.println("El triángulo ha rotado " + grados + "º");
		else 
			System.out.println("El ángulo mínimo de rotación es " + OperacionesBasicas.rotacionMinima);
	}

	@Override
	public String serializar() {
		StringBuilder sb = new StringBuilder();
		sb.append("Triángulo:");
		sb.append(" base=" + this.base);
		sb.append(" altura=" + this.altura);
		sb.append(" área=" + this.area());
		sb.append(" color=" + this.getColor());
		
		return sb.toString();
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", area()=" + area() + ", getColor()=" + getColor()
				+ "]";
	}
	
	
}









