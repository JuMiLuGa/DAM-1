package enumerados;

public class Futbolista {
	private String nombre;
	private int dorsal;
	private Demarcacion demarcacion;
	private Equipo equipo;

	public Futbolista() {
		this.demarcacion=Demarcacion.DELANTERO;
		this.equipo=Equipo.SEVILLA;
	}

	public Futbolista(String nombre, int dorsal, Demarcacion demarcacion, Equipo equipo) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
		this.equipo = equipo;
	}
	
	@Override
	public String toString() {
		return this.dorsal + " - " + this.nombre + " - " + this.demarcacion.name() 
		+ " - " + this.equipo.getNombreClub();
	}
}













