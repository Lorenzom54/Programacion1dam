package A3_7;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        //Declaramos variables

        String usuario,apellidos,edad,calle;
        double salario;
        int numcalle;

        //Preguntamos al usuario

        System.out.println("Introduce el usuario");
        usuario=sc.nextLine();
        System.out.println("Introduce tus apellidos");
        apellidos=sc.nextLine();
        System.out.println("Introduce tu edad");
        edad=sc.nextLine();
        System.out.println("Introduce tu calle");
        calle=sc.nextLine();
        System.out.println("Introduce el numero de la calle");
        numcalle=sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el salario");
        salario=sc.nextDouble();



    }
}
