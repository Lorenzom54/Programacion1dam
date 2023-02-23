package a4_3;

import java.util.Scanner;

public class Menu {

    static int menu(){
        int opc;

        Scanner sc=new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("*******");
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("0. Opción 0");
        opc=sc.nextInt();
        return opc;

    }
}
