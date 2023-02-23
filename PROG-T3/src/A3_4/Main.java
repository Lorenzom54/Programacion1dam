package A3_4;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        // Declaramos las variables
        Scanner sc=new Scanner(System.in);
        int opcion, subopcion = 0;
        // Mostramos un menu y pedimos una opción
        System.out.print("MENU\n*******\n\n");
        System.out.println("1. Sub Menu 1");
        System.out.println("2. Salir");
        System.out.print("Elige una opción:");
        opcion=sc.nextInt();
        switch(opcion) {
            case 1: // Aquí mostramos el siguiente submenú
                System.out.print("SUB-MENU\n*********\n\n");
                System.out.println("1. Sub-opción 1.1.");
                System.out.println("2. Salir");
                System.out.print("Elige una opción:");
                subopcion=sc.nextInt();
                break;
            case 2: System.out.println("Saliendo del programa...");
                break;
            default: System.out.println("Opción no válida");

                if (subopcion == 1){
                    System.out.println("Subopción1.1.");
                }
                if (subopcion == 2){
                    System.out.println("Saliendo...");
                }else {
                    System.out.println("No válida");
                }
        }
    }
    }
