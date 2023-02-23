package A2_9;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        int numero1,numero2,total;


        Scanner sc= new Scanner(System.in);


        //int num1=1;
        //int num2=5;

        System.out.println("Introduce un número");
        numero1=sc.nextInt();

        System.out.println("Introduce otro número");
        numero2=sc.nextInt();

        total=numero2 + numero1;

        System.out.println ("El resultado es: "+total);


    }
}
