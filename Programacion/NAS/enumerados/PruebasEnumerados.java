package enumerados;

public class PruebasEnumerados {
	enum Color {
		ROJO, VERDE, AZUL;
	};

	public static void main(String[] args) {
		String color;
		color = "rojo";
		color = "verde";
		color = "azul";
		color = "coche";

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

		for (Color c : Color.values()) {
			System.out.println(c);
		}

		Demarcacion delantero = Demarcacion.DELANTERO;
		Demarcacion defensa = Demarcacion.DEFENSA;
		Demarcacion xon = Demarcacion.PORTERO;

		System.out.println("La demarcación de Xon es: " + xon.name());

//		System.out.println(delantero.name());
//		System.out.println(delantero.toString());
//		System.out.println(delantero.ordinal());
//		System.out.println(delantero.compareTo(defensa));
//		System.out.println(defensa.compareTo(delantero));

//		for(Demarcacion d:Demarcacion.values()) {
////			System.out.print(d.toString().toLowerCase() + " | ");
//		}

		Equipo villarreal = Equipo.VILLARREAL;
		System.out.println(villarreal.getNombreClub());
		System.out.println(villarreal.getPuestoLiga());
		
		for(Equipo e : Equipo.values()) {
			System.out.println(e.getPuestoLiga() + ": " + e.getNombreClub().toUpperCase());
		}
		
		String club = "sevilla".toUpperCase();
		Equipo sevilla = Equipo.valueOf(club);
		System.out.println(sevilla.getNombreClub());
		
		Equipo.mostrarEquipos();
				
		Futbolista iniesta = new Futbolista("Andrés Iniesta", 8, Demarcacion.CENTROCAMPISTA,Equipo.BARÇA);
		System.out.println(iniesta.toString());
		
		Futbolista casillas=new Futbolista();
		System.out.println(casillas.toString());
	}
}














