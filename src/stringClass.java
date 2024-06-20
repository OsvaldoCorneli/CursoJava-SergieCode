public class stringClass {

    public static void main(String[] args) throws Exception {
        String texto = "Este es un texto asignado a una variable String";

        System.out.println(texto);

        int longitud = texto.length();
        
        System.out.println(longitud);

        char caracter = texto.charAt(5);

        System.out.println(caracter);

        String subcadena = texto.substring(5,16);

        System.out.println(subcadena);

        String minuscula = texto.toLowerCase();

        System.out.println(minuscula);

        String mayuscula = texto.toUpperCase();

        System.out.println(mayuscula);

        int indice = texto.indexOf("texto");

        System.out.println(indice);

        String reemplazado = texto.replace("texto", "ejemplo");

        System.out.println(reemplazado);

        boolean contiene = reemplazado.contains("texto");
        boolean contiene2 = reemplazado.contains("ejemplo");

        System.out.println("este texto contiene texto? " + contiene);
        System.out.println("este texto contiene ejemplo? " + contiene2);

        // sin espacion al inicio y final trim()


    }
    
}
