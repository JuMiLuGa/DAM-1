package Ordenacion;

public class Color implements Comparable {
	private String nombre;

	public Color(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

	@Override
	public int compareTo(Object o) {
		Color c = (Color) o;
		if (this.nombre.length() < c.nombre.length())
			return 1;
		if (this.nombre.length() > c.nombre.length())
			return -1;
		return 0;
	}

}
