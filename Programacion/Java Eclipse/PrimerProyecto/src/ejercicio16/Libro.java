package ejercicio16;

public class Libro extends Publicacion {

	private String titulo;
	private String tipoPortada;
	private String isbn;
	private String nombreAutor;
	private String editorial;

	public Libro() {
		super();
		this.titulo = null;
		this.tipoPortada = null;
		this.isbn = null;
		this.nombreAutor = null;
		this.editorial = null;
	}
	
	public Libro(int numP, float Precio, String titulo, String tipoPortada, String isbn, String nombreAutor, String editorial) {
		super(numP, Precio);
		this.titulo = titulo;
		this.tipoPortada = tipoPortada;
		this.isbn = isbn;
		this.nombreAutor = nombreAutor;
		this.editorial = editorial;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipoPortada() {
		return tipoPortada;
	}

	public void setTipoPortada(String tipoPortada) {
		this.tipoPortada = tipoPortada;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	@Override
	public void imprimir() {
		System.out.println("Nombre: " + this.getNombreAutor());
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Editorial: " + this.getEditorial());
		System.out.println("Portada: " + this.getTipoPortada());
		System.out.println(this.getNumeroDePaginas() + " paginas");
	}
}
