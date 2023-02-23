package ejercicio13_2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);

            int edad;


                System.out.println("Introduce tu edad");
                edad=sc.nextInt();

                for(int i=1;i<=edad;i++){
                System.out.println(i);
                }
    }
}
