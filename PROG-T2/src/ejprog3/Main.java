package ejprog3;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        //Declaramos Variables
        int num1, num2;
        int operaciones;

        Scanner sc = new Scanner(System.in);

        //Pedir valores numericos

        System.out.println("Introduce el primer número");
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo valor númerico");
        num2 = sc.nextInt();
        System.out.println("Introduce la operación a realizar (1.Sumar,2.Restar,3.Multiplicar,4.Dividir,5. Salir)");
        operaciones = sc.nextInt();

        switch (operaciones){

            case 1:
                System.out.println("La suma es: "+ (num1 + num2));
                break;
            case 2:
                System.out.println("La resta es: "+ (num1 - num2));
                break;
            case 3:
                System.out.println("La multiplicacion "+ (num1 * num2));
                break;
            case 4:
                System.out.println("La multiplicacion "+ (num1 / num2));
                break;
            case 5:
                System.out.println("Saliendo .....");
                break;
            default:
                System.out.println("Invalido");
                break;



        }





    }
}
