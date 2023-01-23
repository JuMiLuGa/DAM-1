package ejercicio19;

public class PruebaVehiculos {

	public static void main(String[] args) {
        Motocicleta motoBarata = new Motocicleta("Rojo", (short) 125, (short) 25);
        Motocicleta motoCara = new Motocicleta("Amarillo", (short) 600, (short) 90);
        Camion camionNormal = new Camion("Rojo", (byte) 4, (byte) 2, (short) 4000, (short) 300);
        Camion camionEnorme = new Camion("Rojo", (byte) 12, (byte) 4, (short) 15000, (short) 800);

        motoBarata.establecerNumeroDePlazas((byte) 2);
        System.out.println("Plazas: " + motoBarata.obtenerNumeroDePlazas());
        System.out.println("Cilindrada: " + motoBarata.getCilindrada());
        System.out.println("Nº ejes: " + camionEnorme.obtenerNumeroDeEjes());
        
        System.out.println(motoBarata.impuesto());
        System.out.println(camionEnorme.impuesto());
    }
	
}
