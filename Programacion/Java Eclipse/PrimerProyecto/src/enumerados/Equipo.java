package enumerados;

public enum Equipo {

		BARÇA("FC Barcelona", 1), REAL_MADRID("Real Madrid", 2),
		SEVILLA("Sevilla FC", 4), VILLAREAL("Villareal", 7);
		
		private String nombreClub;
		private final int puestoLiga;
		
		private Equipo(String nombreClub, int puestoLiga) {
			this.nombreClub = nombreClub;
			this.puestoLiga = puestoLiga;
		}

		public String getNombreClub() {
			return nombreClub;
		}

		public void setNombreClub(String nombreClub) {
			this.nombreClub = nombreClub;
		}

		public int getPuestoLiga() {
			return puestoLiga;
		}
		
		
	}


