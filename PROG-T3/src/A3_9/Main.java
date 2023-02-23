package A3_9;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        //Declaramos variables

        int posicioncoma;
        String nombres,firsname,secondname;

        System.out.println("Introduce dos nombres(Separados entre comas)");
        nombres=sc.nextLine();

        posicioncoma=nombres.indexOf(",");
        firsname=nombres.substring(0,posicioncoma);
        secondname=nombres.substring(posicioncoma+1, nombres.length());







    }
}
