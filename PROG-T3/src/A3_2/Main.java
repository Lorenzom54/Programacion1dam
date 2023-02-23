package A3_2;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //variables
        int hora;

        //Pedir hora al usuario

        System.out.print("Introduce un hora: ");
        hora=sc.nextInt();

        if(hora>=0 && hora<=12) {
            System.out.println("Buenos dias");
        }else if (hora>=12 && hora<=21) {
            System.out.println("Buenas tardes");
        }else if(hora>=21 && hora<=24){
            System.out.println("Buenas noches");
        } else{
            System.out.println("Hora no valida");
        }
    }
}
