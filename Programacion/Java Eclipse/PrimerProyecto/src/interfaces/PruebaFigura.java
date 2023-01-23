package interfaces;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PruebaFigura {

	public static void main(String[] args) {
		OperacionesBasicas ob;
		ob = new Triangulo(3,5, "azul");
		ob.rotar(3);
		ob.rotar(15);
		
//		ob = new Circulo(5,"verde");
		ob = new Rectangulo(2,4,"rojo");
		
		Figura f = (Rectangulo)ob;
		Rectangulo r = (Rectangulo)f;
		ob.rotar(45);
		f.getColor();
		f.area();
		r.rotar(60);
		r.getColor();
		r.getAltura();
		
		if (ob instanceof Triangulo)
			System.out.println("Es un triangulo");
		if (ob instanceof Rectangulo)
			System.out.println("Es un rectangulo");
		if (ob instanceof Circulo)
			System.out.println("Es un circulo");
		if (ob instanceof Figura)
			System.out.println("Es una figura");
		if (ob instanceof Object)
			System.out.println("Es un objeto");
		
		if (ob instanceof OperacionesBasicas)
			System.out.println("Implementa la interfaz Operaciones Basicas");
		
	System.out.println("Angulo minimo de rotación: "+OperacionesBasicas.rotacionMinima);
		
	Figura[] figuras = new Figura[5];
    figuras[0] = new Circulo(4, "rojo");
    figuras[1] = new Triangulo(2, 7, "verde");
    figuras[2] = new Rectangulo(4, 6, "amarillo");
    figuras[3] = new Circulo(3, "azul");
    figuras[4] = new Triangulo(7, 3, "morado");
    
	for(Figura figura:figuras) {
		/*Circulo cir = (Circulo)figura;
		cir.serializar()*/
		if(figura instanceof Circulo)
		System.out.println(((OperacionesAvanzadas)figura).serializar());
	}
		
	OperacionesAvanzadas[] oas = new OperacionesAvanzadas[5];
	oas[0] = new Circulo(4, "rojo");
	oas[1] = new Triangulo(2, 7, "verde");
	oas[2] = 
			new Rectangulo(4, 6, "amarillo");
	oas[3] = new Circulo(3, "azul");
	oas[4] = new Triangulo(7, 3, "morado");
	for(OperacionesAvanzadas oa:oas) {
		System.out.println(oa.serializar());
		System.out.println(((Figura)oa).area());
	}
	
	System.out.println("---------------------");
	
	int[] enteros = {4,2,7,5,9,11,32,1,6};
	Arrays.sort(enteros);
	for(int entero:enteros) {
		System.out.println(entero);
	}
		
	}	
}
