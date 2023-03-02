package interfaces;

public class Rectangulo extends Figura implements OperacionesBasicas, OperacionesAvanzadas {
	private int base, altura;
	
	public Rectangulo(int base,int altura, String color) {
		super(color);
		this.base=base;
		this.altura=altura;
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
	public double area() {
		return base * altura;
	}
	
	public void rotar(int grados) {
		if(grados>OperacionesBasicas.rotacionMinima)
		System.out.println("El rectangulo ha rotado "+grados+"º");
		else 
			System.out.println("El ángulo mínimo de rotación es "+OperacionesBasicas.rotacionMinima+"º");
	}
	
	public String serializar() {
		StringBuilder sb = new StringBuilder();
		sb.append("Rectangulo:");
		sb.append("radio= "+this.base);
		sb.append("altura= " + this.altura);
		sb.append(" área=" +this.area());
		sb.append(" color=" +this.getColor());
		
		return sb.toString();
	}
	
}
