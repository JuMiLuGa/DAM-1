package polimorfismo;

public class PruebaFigura {

	public static void main(String[] args) {
		Figura f;
		f = new Triangulo(3, 4, "marron");
		System.out.println(f.getColor());
		//System.out.println(f.getClass());
			
		Triangulo t = new Triangulo(4, 3, "gris");
		System.out.println(t.getBase());
	}

}
