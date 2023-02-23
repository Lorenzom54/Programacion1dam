package estructurasIteracion;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int contador=10;
        int tabla=2;
        int opcion=0;

        System.out.println("Tabla del "+tabla);
        while(contador>=0){
            System.out.println(tabla+" X "+contador+ " = "+tabla*contador);
            contador--;
        }

        do {
            System.out.println("1. SOLICITAR INFORMACION");
            System.out.println("2. PONER UNA QUEJA");
            System.out.println("0. SALIR");
        }while (opcion!=0);

        /*}switch (opcion){
            case 1:
                System.out.println("QUIERO SOLICITAR INFORMACIÓN");
                break;
        }*/





    }
}
