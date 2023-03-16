package prueba4_dam_dual;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializador {
    
    public static CargadorMovil deserializar(String ruta) {
        try (FileInputStream fis = new FileInputStream(ruta);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            CargadorMovil cm = (CargadorMovil) ois.readObject();
            return cm;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar: " + e.getMessage());
            return null;
        }
    }
    
    public void main(String[] args) {
    	CargadorMovil cm = Deserializador.deserializar("ruta_al_fichero/cargadorMovilSerializado.ser");
    	System.out.println(cm);

    }
}
