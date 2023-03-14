package colecciones;

import java.util.*;
public class ListaEnlazada {

	public static void main(String[] args) {
		LinkedList<String> colores = new LinkedList<>();
		colores.add("rojo");
		colores.add("azul");
		System.out.println("colores: " + colores);
		colores.add(1, "verde");
		System.out.println("colores: " + colores);
		
		
		System.out.print("\ndescendingIterator: ");
		Iterator<String> dit = colores.descendingIterator();
		while(dit.hasNext())
			System.out.print(dit.next() + " ");
		
		System.out.println("\n\nAñadir con ListIterator: ");
		ListIterator<String> lit = colores.listIterator();
		System.out.println(lit.next());
		lit.add("negro");
		lit.add("blanco");
		System.out.println("siguiente índice: " + lit.nextIndex());
		System.out.println("índice anterior: " + lit.previousIndex());
		System.out.println("color anterior: " + lit.previous());
		System.out.println("colores: " + colores);
		
		System.out.println("\nRecorrer hacia atrás con ListIterator: ");
		while(lit.hasPrevious())
			System.out.println(lit.previousIndex() + ": " + lit.previous());
		
		System.out.println("\nRecorrer desde el índice 2 con ListIterator: ");
		lit = colores.listIterator(2);
		while(lit.hasNext())
			System.out.println(lit.nextIndex() + ": " + lit.next());
		
		lit.add("amarillo");
		lit.add("verde");
		lit.add("violeta");
		lit.add("naranja");
		lit.add("verde");
		lit.add("marrón");
		lit.add("gris");
		System.out.println("colores: " + colores);
			
		System.out.println("\nCambiar el verde más cercano y anterior al índice 8 " 
		 + "por turquesa con ListIterator:");
		lit = colores.listIterator(8);
		while(lit.hasPrevious()) {
			if(lit.previous().equalsIgnoreCase("VERDE")) {
				lit.set("turquesa");
				break;
			}
		}
		System.out.println("colores: " + colores);
			
		
		LinkedList<String> coloresABorrar = new LinkedList<>();
		coloresABorrar.add("amarillo");
		coloresABorrar.add("violeta");
		
		colores.removeAll(coloresABorrar);
		System.out.println("colores: " + colores);
		
		LinkedList<String> coloresAEliminar = new LinkedList<>(Arrays.asList("azul", "marrón", "rojo"));
		colores.removeAll(coloresAEliminar);
		System.out.println("colores: " + colores);
		
		colores.addAll(coloresABorrar);
		System.out.println("colores: " + colores);
		
		colores.addAll(3, coloresAEliminar);
		System.out.println("colores: " + colores);
		
		colores.addFirst("beige");
		System.out.println("colores: " + colores);

		colores.removeLast();
		System.out.println("colores: " + colores);
		
		if(colores.removeLastOccurrence("verde"))
			System.out.println("eliminado el último verde");
		else
			System.out.println("no se encontró ningún verde");
		System.out.println("colores: " + colores);
		
		if(colores.removeLastOccurrence("verde"))
			System.out.println("eliminado el último verde");
		else
			System.out.println("no se encontró ningún verde");
		System.out.println("colores: " + colores);
		
		if(colores.removeLastOccurrence("verde"))
			System.out.println("eliminado el último verde");
		else
			System.out.println("no se encontró ningún verde");
		System.out.println("colores: " + colores);
		
		
//		LinkedList<String> coloresAEliminar = new LinkedList<>(Arrays.asList("azul", "marrón", "rojo"));
		String[] arrayVerbos = {"andar", "correr", "nadar"};
		List<String> listaVerbos = Arrays.asList(arrayVerbos);
		System.out.print("arrayVerbos: ");
		for(String verbo : arrayVerbos)
			System.out.print(verbo + " ");
		System.out.println("\nlistaVerbos: " + listaVerbos);
		arrayVerbos[1] = "BUCEAR";
		
		System.out.print("arrayVerbos: ");
		for(String verbo : arrayVerbos)
			System.out.print(verbo + " ");
		System.out.println("\nlistaVerbos: " + listaVerbos);
		 
		listaVerbos.set(0, "ESCALAR");
//		listaVerbos.add("PEDALEAR");
//		listaVerbos.remove(1);
		System.out.print("arrayVerbos: ");
		for(String verbo : arrayVerbos)
			System.out.print(verbo + " ");
		System.out.println("\nlistaVerbos: " + listaVerbos);
		
		List<String> sublista  = colores.subList(3, 8);
		System.out.println("colores: " + colores);
		System.out.println("sublista: " + sublista);
		
		System.out.println("\nSubstituir en sublista: " + sublista.set(1, "morado"));
		System.out.println("sublista: " + sublista);
		System.out.println("colores: " + colores);
		
		System.out.println("\nSubstituir en lista original: " + colores.set(5, "salmón"));
		System.out.println("sublista: " + sublista);
		System.out.println("colores: " + colores);
		
//		colores.add("fuscia");
//		System.out.println("colores: " + colores);
//		System.out.println("sublista: " + sublista);
		
		sublista.remove("turquesa");
		System.out.println("sublista: " + sublista);
		System.out.println("colores: " + colores);
		
		//COLAS
		Cola<String> colaNombres = new Cola<>();
		colaNombres.encolar("Ana");
		colaNombres.encolar("Pedro");
		colaNombres.encolar("Lucía");
		colaNombres.encolar("Mercedes");
		colaNombres.encolar("Mario");
		System.out.println("colaNombres: " + colaNombres);
		System.out.println("Le toca a: " + colaNombres.cabeza());
		System.out.println("Se atiende a: " + colaNombres.desencolar());
		System.out.println("Se atiende a: " + colaNombres.desencolar());
		colaNombres.encolar("Juán");
		System.out.println("colaNombres: " + colaNombres);
		
		
		//PILA
		Pila<String> pilaCartas = new Pila<>();
		pilaCartas.apilar("Tres bastos");
		pilaCartas.apilar("Sota oros");
		pilaCartas.apilar("Rey copas");
		pilaCartas.apilar("Siete oros");
		pilaCartas.apilar("Caballo espadas");
		System.out.println("pilaCartas: " + pilaCartas);
		System.out.println("saco carta: " + pilaCartas.desapilar());
		System.out.println("saco carta: " + pilaCartas.desapilar());
		pilaCartas.apilar("Seis bastos");
		System.out.println("pilaCartas: " + pilaCartas);
		System.out.println("La carta que está encima del todo es: " + pilaCartas.cabeza());
		
		
		//PriorityQueue
		PriorityQueue<Integer> enteros = new PriorityQueue<>();
		enteros.add(7);
//		enteros.add(null);
		enteros.add(4);
		enteros.add(11);
		enteros.add(6);
		enteros.add(7);
		enteros.add(2);
		enteros.add(9);
		
		System.out.println("enteros: " + enteros.toString());
		while(!enteros.isEmpty()) {
			System.out.print(enteros.poll() + " ");
		}
		
		enum ColoresPrioridad{ ROJO, VERDE, AZUL, AMARILLO, VIOLETA, BLANCO, NEGRO};
		
		PriorityQueue<ColoresPrioridad> cores = new PriorityQueue<>();
		cores.add(ColoresPrioridad.VERDE);
		cores.add(ColoresPrioridad.AMARILLO);
		cores.add(ColoresPrioridad.NEGRO);
		cores.add(ColoresPrioridad.VERDE);
		cores.add(ColoresPrioridad.AZUL);
		cores.add(ColoresPrioridad.BLANCO);
		cores.add(ColoresPrioridad.ROJO);
		cores.add(ColoresPrioridad.AMARILLO);
		System.out.println("cores: " + cores);
		while(!cores.isEmpty())
			System.out.print(cores.poll() + " ");
		
	}

}





