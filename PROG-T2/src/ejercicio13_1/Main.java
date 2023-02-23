package ejercicio13;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);

         System.out.println("Introduce una palabra");
         String palabra;
         palabra =sc.nextLine();

         int contador=1;


         for(;contador<=10;contador++){
             System.out.println(palabra);
         }






    }
}
