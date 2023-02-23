package ej5_8;

import java.util.Scanner;

public class Main {

    public static void mostrarPalabras(char[] frase){
        for(char letra : frase){
            if(letra==' ');
            System.out.println(letra);
        }

      /*
        for(int i=0;i<frase.length;i++){
            if(frase[i]==' '){
                System.out.println();
            }
            else{
                System.out.println(frase[i]);
            }
        }*/
    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String frase="";
        System.out.println("Introduce una frase: ");
        frase=entrada.nextLine();
        //Combierte el array a caracteres
        char[] letras=frase.toCharArray();
        mostrarPalabras(letras);
    }
}
