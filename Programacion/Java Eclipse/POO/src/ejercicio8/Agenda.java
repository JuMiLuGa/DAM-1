package ejercicio8;

import java.io.*;
import java.util.*;

class Coche implements Serializable {
    private String marca;
    private String modelo;
    private String color;

    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String toString() {
        return "Coche favorito: " + marca + " " + modelo + " de color " + color;
    }
}

class Pelicula implements Serializable {
    private String titulo;
    private int anio;

    public Pelicula(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    public String toString() {
        return "Película favorita: " + titulo + " (" + anio + ")";
    }
}

class Persona implements Serializable {
    private String nombre;
    private int numHermanos;
    private Coche[] cochesFavoritos;
    private Pelicula[] pelisFavoritas;

    public Persona(String nombre, int numHermanos) {
        this.nombre = nombre;
        this.numHermanos = numHermanos;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre);
        sb.append(" (");
        if (numHermanos == 0) {
            sb.append("hijo único)");
        } else if (numHermanos == 1) {
            sb.append("un hermano)");
        } else {
            sb.append(numHermanos);
            sb.append(" hermanos)");
        }
        sb.append("\n");

        if (cochesFavoritos != null) {
            for (Coche coche : cochesFavoritos) {
                sb.append("   ");
                sb.append(coche.toString());
                sb.append("\n");
            }
        }

        if (pelisFavoritas != null) {
            for (Pelicula pelicula : pelisFavoritas) {
                sb.append("   ");
                sb.append(pelicula.toString());
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    public void setCochesFavoritos(Coche[] cochesFavoritos) {
        this.cochesFavoritos = cochesFavoritos;
    }

    public void setPelisFavoritas(Pelicula[] pelisFavoritas) {
        this.pelisFavoritas = pelisFavoritas;
    }

    public Coche[] getCochesFavoritos() {
        return cochesFavoritos;
    }

    public Pelicula[] getPelisFavoritas() {
        return pelisFavoritas;
    }
}

public class Agenda {

    private static final String FILE_NAME = "agenda.ser";

    public static void serializar(Persona[] personas, String ruta) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta));
            out.writeObject(personas);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Persona[] deserializar(String ruta) {
        Persona[] personas = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta));
            personas = (Persona[]) in.readObject();
            in.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return personas;
    }

    public static Persona[] añadirContacto(Persona[] personas, Persona persona) {
        Persona[] nuevasPersonas = Arrays.copyOf(personas, personas.length + 1);
        System.arraycopy(personas, 0, nuevasPersonas, 0, personas.length);
        nuevasPersonas[personas.length] = persona;
        return nuevasPersonas;
    }

    
    public static Persona[] eliminarContacto(Persona[] personas, String nombre) {
        Persona[] nuevasPersonas = new Persona[personas.length - 1];
        int j = 0;
        for (int i = 0; i < personas.length; i++) {
            if (!personas[i].toString().startsWith(nombre)) {
                nuevasPersonas[j] = personas[i];
                j++;
            }
        }
        return nuevasPersonas;
    }

    public static Persona[] buscarPorNombre(Persona[] personas, String nombre) {
        List<Persona> lista = new ArrayList<>();
        for (Persona p : personas) {
            if (p.toString().startsWith(nombre)) {
                lista.add(p);
            }
        }
        return lista.toArray(new Persona[lista.size()]);
    }

    public static void mostrarAgenda(Persona[] personas) {
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
    public static void main(String[] args) {
        // Creamos algunas personas
        Persona p1 = new Persona("Juan", 2);
        Persona p2 = new Persona("Pedro", 0);
        Persona p3 = new Persona("María", 1);
        
        // Añadimos coches y películas favoritas a algunas personas
        Coche c1 = new Coche("Ford", "Mustang", "rojo");
        Coche c2 = new Coche("Audi", "R8", "blanco");
        Pelicula peli1 = new Pelicula("El padrino", 1972);
        Pelicula peli2 = new Pelicula("Pulp Fiction", 1994);
        p1.setCochesFavoritos(new Coche[] {c1, c2});
        p2.setPelisFavoritas(new Pelicula[] {peli1, peli2});
        
        // Creamos un array de personas
        Persona[] agenda = {p1, p2, p3};
        
        // Mostramos la agenda
        System.out.println("Agenda original:");
        mostrarAgenda(agenda);
        
        // Añadimos una nueva persona
        Persona p4 = new Persona("Ana", 3);
        agenda = añadirContacto(agenda, p4);
        System.out.println("\nAgenda después de añadir a Ana:");
        mostrarAgenda(agenda);
        
        // Buscamos personas por nombre
        Persona[] encontradas = buscarPorNombre(agenda, "María");
        System.out.println("\nPersonas encontradas con nombre María:");
        mostrarAgenda(encontradas);
        
        // Eliminamos una persona
        agenda = eliminarContacto(agenda, "Pedro");
        System.out.println("\nAgenda después de eliminar a Pedro:");
        mostrarAgenda(agenda);
        
        // Serializamos la agenda
        serializar(agenda, FILE_NAME);
        
        // Deserializamos la agenda
        Persona[] agendaDeserializada = deserializar(FILE_NAME);
        System.out.println("\nAgenda deserializada:");
        mostrarAgenda(agendaDeserializada);
}  
}


