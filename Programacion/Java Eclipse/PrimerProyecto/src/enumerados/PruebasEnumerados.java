package enumerados;

public class PruebasEnumerados {
	
	enum Color {ROJO, VERDE, AZUL};
	
	public static void main(String[] args) {
		String color;
		color = "rojo";
		color = "verde";
		color = "azul";

		Color miColor = Color.VERDE;
		System.out.println(miColor);
		
		switch (miColor) {
		case ROJO:
			System.out.println("El color es rojo");
			break;
		case VERDE:
			System.out.println("El color es verde");
			break;
		case AZUL:
			System.out.println("El color es azul");
			break;
		}
		 for(Color c : Color.values()) {
	            System.out.println(c);
	        }
		 
		 Demarcacion delantero = Demarcacion.DELANTERO;
		 Demarcacion defensa = Demarcacion.DEFENSA;
		 Demarcacion xon = Demarcacion.PORTERO;
		 
		 System.out.println("La demarcacion de Xon es: " + xon.name());
		 
		 System.out.println(delantero.name());
		 System.out.println(delantero.toString());
		 System.out.println(delantero.ordinal());
		 System.out.println(delantero.compareTo(defensa));
		 System.out.println(delantero.compareTo(delantero));
		 
		 for(Demarcacion d:Demarcacion.values()) {
			 System.out.println(d.toString().toLowerCase() + " | ");
		 }
		 Equipo villareal = Equipo.VILLAREAL;
		 
		 System.out.println(villareal.getNombreClub());
		 System.out.println(villareal.getPuestoLiga());
		 
	}

}
