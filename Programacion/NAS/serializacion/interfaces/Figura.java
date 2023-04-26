package serializacion.interfaces;

import java.io.Serializable;

public abstract class Figura implements Comparable, Serializable {
	private static final long serialVersionUID = 2L;
	private String color;

	public Figura(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public abstract double area();

	@Override
	public int compareTo(Object o) {
		Figura f = (Figura) o;
		if (this.area() < f.area())
			return 1;
		if (this.area() > f.area())
			return -1;
		return 0;
	}

	@Override
	public String toString() {
		return "Figura [color=" + color + ", area()=" + area() + "]";
	}
	
	
}









