package ejercicoB;

public class Producto {
	private String codigo;
	private String nombre;
	private String categoria;
	private String escala;
	private String proveedor;
	private int stock ;
	private double precioCompra;
	private double pvp;
	
	

	public Producto(String codigo, String nombre, String categoria, String escala, String proveedor, int stock,
			double precioCompra, double pvp) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
		this.escala = escala;
		this.proveedor = proveedor;
		this.stock = stock;
		this.precioCompra = precioCompra;
		this.pvp = pvp;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getEscala() {
		return escala;
	}

	public void setEscala(String escala) {
		this.escala = escala;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	@Override
	public String toString() {
		return "Código: " + codigo + " Nombre: " + nombre + " Categoria: " + categoria + " Escala: " + escala
				+ " Proveedor: " + proveedor + " Stock: " + stock + " PrecioCompra: " + precioCompra
				+ " Pvp: " + pvp + " €";
	}
	
	
	
	
	
}
