public class operadores {
    public static void main(String[] args) throws Exception {
        
        // OPERADORES: simbolos que sirven para hacer operaciones con variables o valores ARITMETICOS:

        int a = 5;
        int b = 6;
        int c = a + b;
        int d = b-a;

        double e = 5;
        double f = 4;

        double g = e / f;       

        int h = 12;
        int i = h % 2;
        int j = 11;
        int k = j % 2;

        System.out.println(c);
        System.out.println(d);

        
        System.out.println(g);
        
        System.out.println(i);

        System.out.println(k);

        // OPERADORES DE COMPARACION
        boolean esMayor = a > b;
        boolean esMenor = a < b;
        boolean esIgual = a == b;

        System.out.println(esMayor);
        System.out.println(esMenor);
        System.out.println(esIgual);

        // OPERADORES DE LOGICA

        boolean condicion1 = true;
        boolean condicion2 = false;

        boolean resultadoAND = condicion1 && condicion2; // Ambos deben ser positivo para que sea true
        boolean resultadoORD = condicion1 || condicion2;    // uno de los dos debe ser positivo para que sea true
        boolean resultadoNOT = !condicion1; // lo opuesto a lo que tenga asignado

        System.out.println(resultadoAND);
        System.out.println(resultadoORD);
        System.out.println(resultadoNOT);


    }
}
