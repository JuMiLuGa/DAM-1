package ejercicio16;

public class Publicacion {

	private int numeroDePaginas;
	private float precio;

	public Publicacion(int numeroDePaginas, float precio) {
		this.numeroDePaginas = numeroDePaginas;
		this.precio = precio;
	}

	public Publicacion() {
		this.numeroDePaginas = 0;
		this.precio = 0;
	}
	
	
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	
	public void imprimir() {
		System.out.println("Nº Paginas: " + this.getNumeroDePaginas());
		System.out.println("Nº Paginas: " + this.getPrecio() + "€");
	}
}
