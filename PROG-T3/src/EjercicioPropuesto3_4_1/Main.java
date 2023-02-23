package EjercicioPropuesto3_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaramos variables
        int operador;

        System.out.println("Que figura quieres que muestre (0. Salir, 1.Figura1, 2.Figura2, 3.Figura3, 4.Figura4)");
        operador = sc.nextInt();

        switch (operador) {
            case 0:
                System.out.println("Saliendo...");
                break;
            case 1:
                System.out.println(figura1(operador));
                break;
            case 2:
                System.out.println(figura2(operador));
                break;
            case 3:
                System.out.println(figura3(operador));
                break;
            case 4:
                System.out.println(figura4(operador));
                break;
        }
    }

    public static int figura1(int operador) {
        System.out.println("Figura 1");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        return operador;
    }

    public static int figura2(int operador) {
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
        return operador;
    }

    public static int figura3(int operador) {
        System.out.println("*****");
        System.out.println(" ****");
        System.out.println("  ***");
        System.out.println("   **");
        System.out.println("    *");
        return operador;
    }

    public static int figura4(int operador) {
        System.out.println("    *");
        System.out.println("   **");
        System.out.println("  ***");
        System.out.println(" ****");
        System.out.println("*****");
        return operador;
    }
}