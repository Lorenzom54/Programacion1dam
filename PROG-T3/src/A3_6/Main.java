package A3_6;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //Declaramos Variables
        String nombre;
        int nota1,nota2,nota3,contador,sum;

        //Pedir nombre
        System.out.println("Introduce tu nómbre ");
        nombre= sc.nextLine();
        //Pedir notas
        System.out.println("Introduce el total de notas que quiere sumar");
        contador= sc.nextInt();
        System.out.println("Introduce la primera nota");
        nota1= sc.nextInt();
        System.out.println("Introduce la segunda nota");
        nota2= sc.nextInt();
        System.out.println("Introduce la tercera nota");
        nota3= sc.nextInt();

        //Calculo


            do {
                sum= nota1+nota2+nota3;
                System.out.println(sum/contador);
            }while (nombre=="Lorenzo");
            do {
                sum= nota1+nota2+nota3;
                System.out.println(sum/contador);
            }while (nombre=="Carmona");


    }
}
