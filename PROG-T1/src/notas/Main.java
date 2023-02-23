package notas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Scanner entrada=new Scanner(System.in);
        int nota;

        System.out.println("Introduce la nota: ");
        nota=entrada.nextInt();
        System.out.println("La nota es: "+ nota);

        if (nota<4){
            System.out.println("Has suspendio");
        } else if (nota==5) {
            System.out.println("Suficiente");
        } else if (nota==6) {
            System.out.println("Bien");
        } else if (nota==7) {
            System.out.println("Notable bajo");
        } else if (nota==8) {
            System.out.println("Notable");
        } else if (nota==9) {
            System.out.println("Sobresaliente");
        } else if (nota==10) {
            System.out.println("Excelente");
        }

        //Switch

        switch (nota){
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
                System.out.println("Notable");
                break;
            case 8:
                System.out.println("Notable alto");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 10:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Suspenso");

        }




    }
}
