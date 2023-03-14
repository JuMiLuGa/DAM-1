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
		
		prods = new TreeSet<>((a, b)->b.getNombre().compareTo(a.getNombre()));
		prods = new TreeSet<>((a, b)->a.getCantidad()-b.getCantidad());
		prods = new TreeSet<>((a, b)->a.getNombre().length()-b.getNombre().length());
		
		prods = new TreeSet<>(Comparator.comparing(Producto::getCantidad, (p1, p2)->p2.compareTo(p1)));
		prods = new TreeSet<>(Comparator.comparing(Producto::getCantidad).thenComparing(Producto::getPrecio));
		
		prods.addAll(productos);
		System.out.println("prods: " + prods);
		for (Producto producto : prods) {
			System.out.println(producto);
		}
		
		
	}

}
