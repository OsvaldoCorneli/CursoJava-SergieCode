import java.util.Scanner;

public class PrimerJuego {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la maquina expendedora dee bebidas");
        System.out.println("Elegi una opcion de las siguientes: ");
        System.out.println("1 - Cafe");
        System.out.println("2 - Mate");
        System.out.println("3 - Gaseosa");
        System.out.println("4 - Cerveza");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Buenisima eleccion, de paso combina con el curso de Java de Sergie Code");
            break;
            case 2:
                System.out.println("Debes ser Argentino, Uruguayo o Paraguayo! Buena eleccion!");
            break;
            case 3:
                System.out.println("Tene cuidado con el azucar porque es mala para la salud");
            break;
            case 4:
                System.out.println("Si tomate vino no manejes, por favor");
            break;
        
            default:
            System.out.println("Opcion no valida");
                break;
        }
        if(opcion <= 4){
        System.out.println("Disfrute de su bebida");}

        scanner.close();


    }
}
