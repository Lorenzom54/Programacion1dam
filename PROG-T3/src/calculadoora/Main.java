package calculadoora;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        int operador;
        System.out.println("Introduce el primer número");
        num1=sc.nextInt();
        System.out.println("Introduce el segundo número");
        num2=sc.nextInt();
        System.out.println("Introduce la operación a realizar (1.Sumar,2.Restar,3.Multiplicar,4.Dividir,5. Salir)");
        operador=sc.nextInt();

        switch (operador){
            case 0:
                System.out.println("Saliendo....");

            case 1:
                System.out.println(sumar(num1,num2));

            case 2:
                System.out.println(restar(num1,num2));

            case 3:
                System.out.println(multiplicar(num1,num2));
            case 4:
                System.out.println(dividir(num1,num2));

            default:
                System.out.println("caracter no autorizado");

        }



    }

    public static int sumar(int num1,int num2){
        System.out.println("SUMAR");
        int resultadosum=num1+num2;
        return resultadosum;
    }

    public static int restar(int num1,int num2){
        System.out.println("RESTAR");
        int resultadores=num1-num2;
        return resultadores;
    }

    public static int multiplicar(int num1,int num2){
        System.out.println("MULTIPLICAR");
        int resultadomult=num1*num2;

        return resultadomult;

    }
    public static int dividir(int num1,int num2){
        System.out.println("DIVIDIR");
        int resultadodiv=num1/num2;
        return resultadodiv;

    }
}
