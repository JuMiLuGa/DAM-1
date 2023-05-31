package colecciones;

import java.util.LinkedList;

public class Pila<E> {
	private LinkedList<E> pila;
	
	public Pila() {
		super();
		this.pila=new LinkedList<>();
	}
	
	public void apilar(E elemento) {
		pila.push(elemento);
	}
	
	public E desapilar() {
		return pila.pop();
	}
	
	public E cabeza() {
		return pila.peek();
	}

	@Override
	public String toString() {
		return pila.toString();
	}
	
	
}
