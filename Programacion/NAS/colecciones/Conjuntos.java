package colecciones;

import java.util.*;

public class Conjuntos {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<>();
		numeros.add(21);
		numeros.add(7);
		numeros.add(94);
		numeros.add(4);
		numeros.add(21);
		numeros.add(12);
		numeros.add(21);
		System.out.println("numeros: " + numeros);
		for (Integer numero : numeros) {
			System.out.println(numero);
		}

		Set<String> nombres = new HashSet<>();
		nombres.add("Pedro");
		nombres.add("Ana");
		nombres.add("María");
		nombres.add("Evaristo");
		nombres.add("Ana");
		nombres.add("Lucía");
		System.out.println("nombres: " + nombres);
		for (String nombre : nombres) {
			System.out.print(nombre + " ");
		}

		Set<Producto> productos = new HashSet<>();
		productos.add(new Producto("sardinas", 44, 3.42, 9));
		productos.add(new Producto("colacao", 987, 8.95, 2));
		productos.add(new Producto("cerveza", 23, 4.59, 6));
		productos.add(new Producto("galletas", 123, 2.80, 4));
		productos.add(new Producto("mascarillas", 4000, 1.65, 10));
		productos.add(new Producto("colacao", 987, 8.95, 2));
		System.out.println();

		for (Producto producto : productos) {
			System.out.println(producto);
		}

		Set<String> colores = new TreeSet<>();
		colores.add("rojo");
		colores.add("azul");
		colores.add("verde");
		colores.add("azul");
		System.out.println("colores: " + colores);

//		ComparadorPrecioAscendente cmp = new ComparadorPrecioAscendente();

		Set<Producto> prods = new TreeSet<>();
		prods = new TreeSet<>(new Comparator<Producto>() {
			public int compare(Producto o1, Producto o2) {
				return Double.compare(o1.getPrecio(), o2.getPrecio());
			}
		});

		prods = new TreeSet<>(Collections.reverseOrder());
		prods = new TreeSet<>(Collections.reverseOrder(new ComparadorPrecioAscendente()));
		prods = new TreeSet<>(new ComparadorPrecioAscendente().reversed());

		prods = new TreeSet<>((a, b) -> b.getNombre().compareTo(a.getNombre()));
		prods = new TreeSet<>((a, b) -> a.getCantidad() - b.getCantidad());
		prods = new TreeSet<>((a, b) -> a.getNombre().length() - b.getNombre().length());

		prods = new TreeSet<>(Comparator.comparing(Producto::getCantidad, (p1, p2) -> p2.compareTo(p1)));
		prods = new TreeSet<>(Comparator.comparing(Producto::getCantidad).thenComparing(Producto::getPrecio));

		prods.addAll(productos);
		System.out.println("prods: " + prods);
		for (Producto producto : prods) {
			System.out.println(producto);
		}

		// SET: no admite duplicados
		System.out.println("\n----RESUMEN----");
		Set<Integer> conjunto1 = new HashSet<>(); // HashSet: no soporta orden
		conjunto1.add(20);
		conjunto1.add(10);
		conjunto1.add(1);
		conjunto1.add(5);
		conjunto1.add(20);
		System.out.println("HashSet: " + conjunto1);
		for (Integer integer : conjunto1) {
			System.out.print(integer + " ");
		}

		Set<Integer> conjunto2 = new TreeSet<>(); // TreeSet: ordena en función del comparador
		conjunto2.add(20);
		conjunto2.add(10);
		conjunto2.add(1);
		conjunto2.add(5);
		conjunto2.add(20);
		System.out.println("\nTreeSet: " + conjunto2);
		for (Integer integer : conjunto2) {
			System.out.print(integer + " ");
		}

		Set<Integer> conjunto3 = new LinkedHashSet<>(); // LinkedHashSet: usa el orden de inserción
		conjunto3.add(20);
		conjunto3.add(10);
		conjunto3.add(1);
		conjunto3.add(5);
		conjunto3.add(20);
		System.out.println("\nLinkedHashSet: " + conjunto3);
		for (Integer integer : conjunto3) {
			System.out.print(integer + " ");
		}

		Set<Integer> aleatoriosNoRepetidos = new TreeSet<>();
		List<Integer> aleatoriosRepetidos = new ArrayList<>();
		int numAleatoriosGenerados = 0;
		while (aleatoriosNoRepetidos.size() < 10) {
			int aleatorio = (int) (Math.random() * 15 + 1);
			if(!aleatoriosNoRepetidos.add(aleatorio))
				aleatoriosRepetidos.add(aleatorio);
			numAleatoriosGenerados++;
		}
		Collections.sort(aleatoriosRepetidos);
		System.out.println("\naleatoriosNoRepetidos: " + aleatoriosNoRepetidos 
				+ " Generados: " + numAleatoriosGenerados
				+ "\naleatoriosRepetidos: " + aleatoriosRepetidos);
		Set<Integer> numerosQueFaltan = new HashSet<>();
		for(int i = 1; i<=15;i++) {
			if(!aleatoriosNoRepetidos.contains(i))
				numerosQueFaltan.add(i);
		}
		System.out.println("numerosQueFaltan: " + numerosQueFaltan);
	}

}
