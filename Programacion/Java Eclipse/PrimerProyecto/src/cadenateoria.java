
public class cadenateoria {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String frase = "Un caramelo de limon";

        frase = new String("Un caramelo de limón");

        char[] arrayDia = { 'L', 'u', 'n', 'e', 's' };
        String dia = new String(arrayDia);
//        System.out.println(dia);
//        System.out.println(dia.length());
//        //System.out.println(arrayDia.length);
//        
//        String cadParcial = new String(arrayDia,1,2);
//        System.out.println(cadParcial);
//        
        System.out.println("Cadena: " + frase);
        System.out.println("Cadena en MAYUSCULAS: " + frase.toUpperCase());
        System.out.println("Cadena en MAYUSCULAS: " + frase.toLowerCase());
        System.out.println("Longitud cadena: " + frase.length());
        System.out.println("Primer caracter: " + frase.charAt(0));
        System.out.println("Ultimo caracter: " + frase.charAt(frase.length() - 1));
        System.out.println("Indice primer caracter 'a': " + frase.indexOf('a'));
        System.out.println("Indice primer caracter 'a': " + frase.lastIndexOf('a'));

        for (int i = 0; i < frase.length(); i++) {
            System.out.printf("%3s", frase.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < frase.length(); i++) {
            System.out.printf("%3s", i);
        }
        System.out.println();

        String sabor = frase.substring(15);
        String caramelo = frase.substring(3, 11);
        System.out.println("Sabor: " + sabor);
        System.out.println("Caramelo: " + frase.substring(3, 11));

        System.out.println("Indica primera cadena 'li': " + frase.indexOf("li"));

        System.out.println("indice priemra cadena 'CARAMELO': " + frase.toUpperCase().indexOf("CARAMELO"));

        System.out.println("Sabor== \"limón\". " + (sabor == "limón"));

        System.out.println(frase.startsWith("Un"));
        System.out.println(frase.endsWith("ón"));

        String palabrasConcatenadas = caramelo.concat(sabor);

        System.out.println(palabrasConcatenadas);
        System.out.println(palabrasConcatenadas.replace("lim", "mel"));
        palabrasConcatenadas = palabrasConcatenadas.replace("lim", "mel");
        System.out.println(palabrasConcatenadas);

        palabrasConcatenadas = palabrasConcatenadas.replaceFirst("me", "ME");
        System.out.println(palabrasConcatenadas);

        // Metodos valueof
        // Convierte valores de tipo primitivo a String
        String cadena = "";
        System.out.println("Cadena : '" + cadena + "'");
        System.out.println("Cadena : '" + cadena.valueOf(5 < 3) + "'");
        System.out.println("Cadena : '" + cadena.valueOf('M') + "'");

        double numero = 3.768;
        String cadNumero = String.format("%9.2f", numero);
        System.out.println("'" + cadNumero + "'");

        arrayDia = frase.toCharArray();
        for (char caracter : arrayDia) {
            System.out.println(caracter);
        }

        String nombres = "ana:pedro:manuel:ezequiel";
        String[] palabras = nombres.split(":");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

    }

}

