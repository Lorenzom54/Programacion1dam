package Calculador;


import java.util.Scanner;

public class Main{

    public static void main(String[] args)
    {
        //Crear un menu para la calculadora
        //1.Sumar
        //2.Restar
        //3.Multiplicar
        //4.Dividir (Controlar la division por cero)
        //5. Salir (no podeis salir del programa hasta pulsar el 5)

        //Declaracion variables
        Scanner sc = new Scanner(System.in);

        int operaciones;
        double num1, num2;
        //Preguntar usuario

        do {
            System.out.println("Introduce el número 1: ");
            num1 = sc.nextDouble();
            System.out.println("Introduce el numero 2: ");
            num2 = sc.nextDouble();
            System.out.println("Introduce la operación a realizar (1.Sumar,2.Restar,3.Multiplicar,4.Dividir,5. Salir)");
            operaciones = sc.nextInt();

            //CALCULOS


            switch (operaciones) {
                case 1:
                    System.out.println("Suma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resta: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplicación: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Division: " + (num1 / num2));
                    break;
                default:
                    System.out.println("Operador no valido");

            }

        } while (operaciones != 5);
        System.out.println("Salir");
    }

}

