package clases_anidadas;


import clases_anidadas.ClaseExterna.ClaseAnidadaEstatica;
import clases_anidadas.ClaseExterna.ClaseAnidadaInterna;
public class Pruebas {

	public static void main(String[] args) {

		ClaseAnidadaEstatica cae = new ClaseAnidadaEstatica();
		cae.imprimir();
		
		ClaseExterna ce = new ClaseExterna();
		ClaseAnidadaInterna cai = ce.new ClaseAnidadaInterna();
		cai.imprimir();
		
		ce.metodoExterno();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
