package colecciones;

import java.util.LinkedList;

public class Cola<E> {
	private final LinkedList<E> cola;
	
	public Cola() {
		super();
		this.cola = new LinkedList<>();
	}
	
	public void encolar(E elemento) {
		cola.offer(elemento);
	}
	
	public E desencolar() {
		return cola.poll();
	}
	
	public E cabeza() {
		return cola.peek();
	}

	@Override
	public String toString() {
		return cola.toString();
	}
	
	
	
}
