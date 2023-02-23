package validar;

import java.util.Scanner;

public class Main {


    public static char obtenerLetraDNI(String miDNI){
        String letrasDNI= "TRWAGMYFPDXBNJZSQVHLCKE";
        long numDNI;
        String numerosDNI=miDNI.substring(0,8);
        System.out.println("Letra para: "+ numerosDNI);
        numDNI=Long.parseLong(numerosDNI);
        int resto=(int)numDNI%23;
        return letrasDNI.charAt(resto);

    }
    public static boolean validarDNI(String miDNI) {
        //Comprobamos que tiene 9 caracteres
        if (miDNI.length() !=9) {
            System.out.println("Logitud del DNi incorrecta");
            return false;
        }
        //Comprobamos que os ocho primeros son números y el ultimo es una letra
        //Comprobacion de los 8 primeros numeros
        for (int i = 0; i < miDNI.length() - 1; i++) {
            if (miDNI.charAt(i) < '0' || miDNI.charAt(i) > '9') {
                System.out.println("Los primeros ocho caracteres son numeros");
                return false;
            }
        }
        //Comprobacion de la letra
        miDNI=miDNI.toLowerCase();
        char letra=miDNI.charAt(miDNI.length()-1);
        if (miDNI.charAt(miDNI.length()-1)>'A' || miDNI.charAt(miDNI.length()-1)>'Z'){
            System.out.println("El ultimo caracter debe ser una letra");
            return false;
        }
        //Comprobar que la letra es correcta
        if (obtenerLetraDNI(miDNI)!=miDNI.charAt(miDNI.length()-1)){
            System.out.println("La letra del DNI es incorrecta");
            return false;
        }

        return false;
    }




    public static void main(String[]args){
        //Recoger un dni por teclado, y va a comprobar que es correcto
        Scanner sc=new Scanner(System.in);
        String dni;
        boolean dniCorrecto=false;

        System.out.println("Introduce el DNI: ");
        dni=sc.nextLine();
        dniCorrecto=validarDNI(dni);
    }
}
