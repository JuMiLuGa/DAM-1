package herencia;

public class PuntoColor extends Punto{
	private String color;
	
	public PuntoColor(int x, int y, String color) {
		this.color = color;
	}
	public static void main(String[] args) {
		PuntoColor pc = new PuntoColor(2, 3, "verde");
		System.out.println(pc.getY());
	}
}
