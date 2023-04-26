package interfaces;

public class Circulo extends Figura implements OperacionesAvanzadas {
	private int radio;

	public Circulo(int radio, String color) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double area() {
		return Math.PI * radio * radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public String serializar() {
		StringBuilder sb = new StringBuilder();
		sb.append("Círculo:");
		sb.append(" radio=" + this.radio);
		sb.append(" área=" + this.area());
		sb.append(" color=" + this.getColor());
		
		return sb.toString();
	}

}







