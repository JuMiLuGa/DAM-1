package prueba4_dam_dual;

public class PruebaCarpeta {

    public static void main(String[] args) {
        Carpeta carpeta = new Carpeta("E:\\DAM 1\\Programacion\\Java Eclipse\\prueba_4\\src\\prueba4_dam_dual");
        
        carpeta.listar();
        carpeta.mostrarPropiedades();
        
        carpeta.cambiarNombre("nuevoNombre");
    }

}
