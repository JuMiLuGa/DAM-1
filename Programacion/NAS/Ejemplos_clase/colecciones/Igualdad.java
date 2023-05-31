package colecciones;

import java.util.Objects;

public class Igualdad {

	public static void main(String[] args) {
		String c1 = "Rojo";
		String c2 = "Verde";
//		String c3 = "Rojo";
		String c3 = new String("Rojo");
		
		System.out.println("c1.hashCode():" + c1.hashCode());
		System.out.println("c2.hashCode():" + c2.hashCode());
		System.out.println("c3.hashCode():" + c3.hashCode());
		System.out.println("c1.equals(c2)" + c1.equals(c2));
		System.out.println("c1.equals(c3)" + c1.equals(c3));
		System.out.println("c1 == c2 " + (c1 == c2));
		System.out.println("c1 == c3 " + (c1 == c3));
		
		c1 = c2;
		System.out.println("\n---- c1 = c2 ----");
		System.out.println("c1.hashCode():" + c1.hashCode());
		System.out.println("c2.hashCode():" + c2.hashCode());
		System.out.println("c3.hashCode():" + c3.hashCode());
		System.out.println("c1.equals(c2)" + c1.equals(c2));
		System.out.println("c1.equals(c3)" + c1.equals(c3));
		System.out.println("c1 == c2 " + (c1 == c2));
		System.out.println("c1 == c3 " + (c1 == c3));
		
		
		Libro l1 = new Libro("Como programar en Java", "Deitel", 977311505);
		Libro l2 = new Libro("Como programar en Java", "Deitel", 977311505);
		
		System.out.println("\n--- Ejemplo libros ---");
		System.out.println("l1.hashCode() " + l1.hashCode());
		System.out.println("l2.hashCode() " + l2.hashCode());
		System.out.println("l1.equals(l2) " + l1.equals(l2));
		System.out.println("l1 == l2 " + (l1 == l2));
		
	}

}

class Libro{
	private String titulo;
	private String autor;
	private long isbn;
	public Libro(String titulo, String autor, long isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}
	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return isbn == other.isbn;
	}

	
	
	
}






