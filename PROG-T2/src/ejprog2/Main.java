package ejprog2;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        //Declaramos variables

        String nombre;
        Scanner sc=new Scanner(System.in);

        //Pedimos nómbre

        System.out.println("Introduce tu nómbre");
        nombre= sc.nextLine();

        System.out.println("Bien benido "+ nombre);
    }
}
