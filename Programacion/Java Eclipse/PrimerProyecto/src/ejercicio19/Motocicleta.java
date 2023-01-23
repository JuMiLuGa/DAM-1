package ejercicio19;

public class Motocicleta extends Vehiculo{

	private byte numeroDePlazas;
	

	public Motocicleta(String color, short cilindrada, short potencia) {
		super(color, cilindrada, potencia);
	}
	
	
	
	public byte obtenerNumeroDePlazas() {
		return numeroDePlazas;
	}

	public void establecerNumeroDePlazas(byte numeroDePlazas) {
		this.numeroDePlazas = numeroDePlazas;
	}

	public static void main(String[] args) {
		

	}
	
	public float impuesto() {
		return (this.getCilindrada()/30 + this.getPotencia()*30);
	}
}
