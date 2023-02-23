package ejercicio13_3;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        int num=0;

        System.out.println("Introduce un número entero y positívo");
        num=sc.nextInt();

        for(int i=1;num<=i;i++){

            if(i%2==1) {

                if (num == i || i == --num) {
                    System.out.println(i);
                } else {
                    System.out.println(i + ",");
                }

            }
        }




    }
}
