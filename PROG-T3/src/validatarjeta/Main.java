package validatarjeta;

import java.util.Scanner;

public class Main {

    public static boolean IdentifiTarjeta(String numTarjeta){

        String identificarTipo;
            // Visa
            if (numTarjeta.matches("^4[0-9]{12}(?:[0-9]{3})?$")) {
                System.out.println("Visa");
                return true;
            }
            // JCB
            else if (numTarjeta.matches("^(?:2131|1800|35\\d{3})\\d{11}$")) {
                System.out.println("JCB");
                return true;
            }
            // MasterCard
            else if (numTarjeta.matches("^5[1-5][0-9]{14}$")) {
                System.out.println("MasterCard");
                return true;
            }
            // American Express
            else if (numTarjeta.matches("^3[47][0-9]{13}$")) {
                System.out.println("American Express");
                return true;
            }
            // Discover
            else if (numTarjeta.matches("^6(?:011|5[0-9]{2})[0-9]{12}$")) {
                System.out.println("Discover");
                return true;
            }
            // No reconocida
            else {
                System.out.println("No reconocida");
                return false;
            }
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numTarjeta;

        while(true){
            System.out.println("******************************");
            System.out.println("******TARJETA DE CRÉDITO******");
            System.out.println("******************************");

            System.out.println("Introduce el numero de tarjeta, sin guiones y sin espacios: ");
            numTarjeta = sc.nextLine();
            if (IdentifiTarjeta(numTarjeta)){
                break;
            }else {
                System.out.println("No se ha podido validar la tarjeta");
            }

        }

    }

}
