package serializacion.interfaces;

public class Rectangulo extends Figura implements OperacionesBasicas, OperacionesAvanzadas {
	private static final long serialVersionUID = 1L;
	private int b, altura;

	public Rectangulo(int base, int altura, String color) {
		super(color);
		this.b = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return b * altura;
	}

	public int getBase() {
		return b;
	}

	public void setBase(int base) {
		this.b = base;
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
			System.out.println("El rectángulo ha sido rotado " + grados + "º");
		else
			System.out.println("El ángulo mínimo de rotación es " + OperacionesBasicas.rotacionMinima);
	}
	
	@Override
	public String serializar() {
		StringBuilder sb = new StringBuilder();
		sb.append("Rectángulo:");
		sb.append(" base=" + this.b);
		sb.append(" altura=" + this.altura);
		sb.append(" área=" + this.area());
		sb.append(" color=" + this.getColor());
		
		return sb.toString();
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + b + ", altura=" + altura + ", area()=" + area() + ", getColor()=" + getColor()
				+ "]";
	}
	
	
}









