package documentos.gestion_economica;

public class Factura {

	private String comprador;
    private double importe;
    
    public Factura(String nuevoComprador, double nuevoImporte) {
    	this.comprador = nuevoComprador;
    	this.importe = nuevoImporte;
    	
    }
    public void imprimirInfo() {
    	System.out.println("Nombre: " + comprador);
    	System.out.println("Importe: " + importe);
    	System.out.println();
    }
    
    public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
