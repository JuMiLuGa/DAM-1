package prueba4_dam_dual;

public class PruebaCarpeta {

    public static void main(String[] args) {
        Carpeta carpeta = new Carpeta("C:\\Java\\prueba4\\carpetilla");
        
        carpeta.listar();
        carpeta.mostrarPropiedades();
        
        carpeta.cambiarNombre("nuevoNombre");
    }

}
