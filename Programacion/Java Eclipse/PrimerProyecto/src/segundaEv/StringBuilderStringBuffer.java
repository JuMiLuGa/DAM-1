package segundaEv;

public class StringBuilderStringBuffer {

	public static void main(String[] args) {
		
		
		
		/*String cad = "hola";
		String cad2 = "hola";
		String cad3 = new String("hola");
		String cad4 = new String("hola");

		
		cad += "r";
		
		System.out.println(cad == cad2);
		*/
		
		//String Builder
		
		StringBuilder sb = new StringBuilder("hola");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.setLength(2);
		System.out.println(sb.length());
		System.out.println(sb.toString());
		
		sb.setLength(5);
		System.out.println(sb.length());
		System.out.println(sb.toString());
		
		sb.setCharAt(3, 'a');
		System.out.println(sb.toString());
		
		sb.append("fresa");
		System.out.println(sb.toString());
		System.out.println(sb.reverse());
		
		//String Buffer
		
		
	}

}
