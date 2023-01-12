package herencia;

public class Punto {
	private int x, y;
	
	public Punto() {
			super();
	}

	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Punto(int v) {
		super();
		this.x = v;
		this.y = v;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void dibujar() {
		System.out.println("Coordenadas: (" + x + ", " + y +")");

	}

}
