package ejercicio16;

public class Periodico extends Publicacion {
	private String nombre;
    private String fecha;
    
    public Periodico() {
		this.nombre = "";
		this.fecha = "";
	}
    
    public Periodico(int numeroDePaginas, float precio) {
		super(numeroDePaginas, precio);
	}	
    
    public Periodico(String nombre, String fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
    
	public Periodico(int numeroDePaginas, float precio, String nombre, String fecha) {
		super(numeroDePaginas, precio);
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
    
	@Override
	
	public void imprimir () {
		System.out.println("Nombre: " + this.getNombre());
		System.out.println("Fecha: " + this.getFecha());
		System.out.println(this.getNumeroDePaginas() + " paginas");
		System.out.println(this.getPrecio() + " €");
	}
	
	
}
