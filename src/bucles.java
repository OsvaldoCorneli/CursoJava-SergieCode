public class bucles {

    public static void main(String[] args) throws Exception {

        // for(inicializacion; condicion; actualizacion)

        for (int i = 0; i <= 10; i++) {

            System.out.println("Este es mi i: " + i);

        }

        // doble bucle for
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {

                System.out.println("Este es mi i: " + j);

            }

            System.out.println("Este es mi i: " + i);

        }


        int contador = 1;

        while (contador <= 5){
            System.out.println(contador);
            contador++;
        }

        
        
        // DO WHILE
        
        int contador1 = 1;
        
        do{
            
            System.out.println("Esto sucede antes de la condicion");
            contador1++;
            
        } while(contador1 <= 5);


        // PALABRAS RESERVADAS


        for(int i=1; i<=10; i++){

            System.out.println(i);
            if(i == 5){
                break; //Break Corta el bucle
            }
            System.out.println(i);

        }

        for(int i=1; i<=10; i++){

            System.out.println(i);
            if(i == 5){
                continue; // saltea las lineas que continuan del scope
            }
            System.out.println(i);
            
        }

        for(int i=1; i<=10; i++){

            System.out.println(i);
            if(i == 5){
                return; // Se corta el scope
            }
            System.out.println(i);
            
        }
        
        
        
    }
}