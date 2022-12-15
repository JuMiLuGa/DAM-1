package segundaEv;

import java.util.Scanner;

public class RectanguloTexto {

	private int base;
	private int altura;
	
	
	
	public void establecerBase(int valor) {
		base = valor;
	}
	
	public int obtenerBase() {
		return base;
	}
	
	public void establecerAltura(int valor) {
		altura = valor;
		
	}
	
	public int obtenerAltura() {
		return altura;
	}
	
	public int obtenerArea() {
		return base*altura;
		
	}
	
	public void dibujar() {
		for(int i = 0 ; i < altura ; i++) {
			for(int j = 0 ; j < base ; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		RectanguloTexto rt = new RectanguloTexto();
		Scanner ent = new Scanner(System.in);
		rt.establecerBase(ent.nextInt());
		rt.establecerAltura(ent.nextInt());
		System.out.println("Base: " + rt.obtenerBase());
		System.out.println("Altura: " + rt.obtenerAltura());
		int area = rt.obtenerArea();
		
		System.out.println("Area: " + rt.obtenerArea());
		rt.dibujar();
		
		RectanguloTexto rt2 = new RectanguloTexto();
	}
}
