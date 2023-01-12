package documentos;

import documentos.RRHH.Contrato;
import documentos.gestion_economica.Factura;

public class ImportarPaquetes {

	public static void main(String[] args) {
        Factura factura1 = new Factura ("Jesús Carretero", 100.0);
        Factura factura2 = new Factura ("Félix García", 300.0);
        Contrato contrato1 = new Contrato ("Alejandro Calderón", 12);
        Contrato contrato2 = new Contrato ("Javier Fernández", 6);
        factura1.imprimirInfo();
        factura2.imprimirInfo();
        contrato1.imprimirInfo();
        contrato2.imprimirInfo();
    }

}
