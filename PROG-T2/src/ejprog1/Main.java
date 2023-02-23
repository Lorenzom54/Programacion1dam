package ejprog1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int dia;
        int mes;
        int año;

        System.out.println("Introduce un dia: ");
        dia=sc.nextInt();

        System.out.println("Ahora introduce el mes: ");
        mes=sc.nextInt();

        System.out.println("Introduce el año: ");
        año=sc.nextInt();

        if(dia>=31){
            System.out.println("Dia Invalido");
        }
        if(mes>12){
            System.out.println("Mes invalido");
        }
        if(año>2022){
            System.out.println("Año invalido");
        }else{
            System.out.println("La fecha es "+dia+" "+mes+" "+año);
        }

    }
}
