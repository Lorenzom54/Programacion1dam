package A3_8;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        //Declaramos variables
        int numero, posicionComa;
        String direccion, calle, numeroString;


        System.out.println("Introduce una direccion (Separado entre comas)");
        direccion=sc.nextLine();
        //Posicion de la coma
        posicionComa=direccion.indexOf(",");
        //Posicion calle
        calle=direccion.substring(0, posicionComa);
        //Posicion numero calle
        numeroString=direccion.substring(posicionComa+1,direccion.length());
        //Quitamos espacios de todos lados
        numeroString=numeroString.trim();
        //String de numero en entero
        numero=Integer.parseInt(numeroString);
        //Mostrar datos
        System.out.println("La calle es: "+ calle);
        System.out.println("El numero de la calle es: "+ numero);



    }
}
