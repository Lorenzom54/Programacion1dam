package ClaseMath;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        //declaramos variables

        int base;
        int exponenete;
        int resultado=1;

        System.out.println("Introduce la base");
        base=sc.nextInt();
        System.out.println("Introduce el exponente");
        exponenete=sc.nextInt();

        for (int i=0;i<exponenete;i++){
            resultado=base*resultado;
        }
        System.out.println(resultado);



    }
}
