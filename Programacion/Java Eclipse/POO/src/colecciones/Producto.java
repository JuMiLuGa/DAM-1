package colecciones;

import java.util.Objects;

public class Producto implements Comparable<Producto>{
	private String nombre;
	private int id;
	private double precio;
	private int cantidad;
	
	public Producto(String nombre, int id, double precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return cantidad + " " + nombre + " (" + id + ") " + precio + "€";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return id == other.id;
	}

	@Override
	public int compareTo(Producto o) {
		return this.id - o.id;
	}
	
	
	
}
