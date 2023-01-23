package interfaces;

public class Triangulo extends Figura implements OperacionesBasicas, OperacionesAvanzadas{
	private int base;
	private int altura;
	
	public Triangulo(int base, int altura, String color) {
		super(color);
		this.altura=altura;
		this.base=base;
	}
	
	
	@Override
	
	public double area() {
		return base*altura/2f;
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
	
	public void rotar(int grados) {
		if(grados>OperacionesBasicas.rotacionMinima)
		System.out.println("El trianglo ha rotado "+grados+"º");
		else 
			System.out.println("El ángulo mínimo de rotación es "+OperacionesBasicas.rotacionMinima+"º");
	}
	
	@Override
	
    public String serializar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Triangulo:");
        sb.append(" base=" + this.base);
        sb.append(" altura= " + this.altura);
        sb.append(" área=" + this.area());
        sb.append(" color=" + this.getColor());

        return sb.toString();
    }
}

