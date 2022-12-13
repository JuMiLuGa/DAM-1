package segundaEv;

import java.util.Scanner;

public class ClasesEnvoltorio {

	public static void main(String[] args) {

		int num = 142;
		
		
		Integer n = new Integer(num);
		Integer n2 = Integer.valueOf("142");
		
		
		System.out.println("Double Value");
		System.out.println("n2=" + n2.doubleValue());
		System.out.println();
		System.out.println("Byte Value");
		System.out.println("n2=" + n2.byteValue());
		
		System.out.println();
		System.out.println();

		System.out.println("MIN y MAX Value");
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println();
		System.out.println();

		System.out.println("conversores");
		System.out.println(Integer.toString(num));
		System.out.println(Integer.toHexString(num));
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.parseInt("384"));
		System.out.println(Integer.parseInt("F", 16));
		
		System.out.println();
		System.out.println();

		System.out.println("Comparar");
		System.out.println(Integer.compare(num, 142));
		System.out.println(Integer.compare(num, 14));
		System.out.println(Integer.compare(num, 145));
		
		System.out.println();
		System.out.println();
		
		System.out.println("Otros metodos para comparar");
		Integer n3 = Integer.valueOf(10 * 14 + 2);
		System.out.println("n2=" + n2.toString());
		System.out.println("n3=" + n3.toString());
		System.out.println(n2 == n3);
		System.out.println(n2.equals(n3));
		System.out.println(n3.equals(n2));

		System.out.println();
		System.out.println();

		System.out.println("Valor minimo y maximo");
		System.out.println(Integer.min(15, num));
		System.out.println(Integer.max(15, num));
		
		System.out.println();
		System.out.println();

		System.out.println();
		int entero = n2.intValue();

	}

}
