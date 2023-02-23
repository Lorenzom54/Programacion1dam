package prueba;

import PracticaFinal.Validaciones;

import java.sql.DataTruncation;
import java.util.Scanner;

public class Main {

    public static int totalPal;
    public static int totalCod;
    public static int totalCodNum;

    public static String codigoNumericoTotal;


    public static boolean Comprobarfrase(String fraseControl) {

        fraseControl = fraseControl.toLowerCase();
        String codigoFinal="";
        String[] palabras = fraseControl.split(" ");
        int totalPalabras = 0;
        char texto[]=new char[4];
        String texto2="";
        int cod = 0;
        int codNum = 0;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length()!=0) {
                totalPalabras++;
                cod=cod+palabras[i].charAt(0);      //Primera posicion
                texto[i]=(char)palabras[i].charAt(0);
                texto2=palabras[i].charAt(0)+"";
                codNum=codNum+(int)palabras[i].charAt(palabras[i].length()-1);
                totalPal = totalPalabras;
                totalCod = cod;
                int codNumDividido = codNum / totalPalabras; //total 108
                int codigoModulo = codNum % 4;
                totalCodNum = codNumDividido - codigoModulo;
            }else{
                System.out.println("Introduce un grupo de 4 palabras");
                return false;
            }



            String palabra1 = palabras[i].charAt(0)+"";
             codigoFinal = codigoFinal+palabra1;
        }
        codigoNumericoTotal=codigoFinal+(totalCodNum+"");
        codigoNumericoTotal = codigoNumericoTotal.toUpperCase();

        return true;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fraseControl;


        while (true){
            System.out.println("Frase de control (4 Palabras separados por espacios, la primera letra de cada palabra en mayuscula)");
            fraseControl = sc.nextLine();
            if (Comprobarfrase(fraseControl)) {
                System.out.print(codigoNumericoTotal);
               // System.out.println(totalCodNum);
                break;
            } else {
                System.out.println("Frase no valida");
            }
        }


    }
}
