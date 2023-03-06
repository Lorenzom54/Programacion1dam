package estudiofoto;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Atributos
        boolean salir = false;
        String opcion;
        String opcion1;
        String medidasLienzo;
        String nombreLienzo;
        String precioLienzo;
        String marcoLienzo;
        String tipoMarcoLienzo;
        String medidasTarjeta;
        String nombreTarjeta;
        String precioTarjeta;
        String marcoTarjeta;
        String tipoMarcoTarjeta;

        Tarjeta t1 = new Tarjeta("30X40","Cuadro de Oleo",30f,"Marco de Madera","Blanco");

        Foto f1 = new Foto("20X10","Foto Prueba",23.4f);

        Lienzo l1 = new Lienzo("30X40","Lienzo de Tela",10.5,true,"Madera");

        //l1.mostrarLienzo();
        //t1.mostrarTarjeta();
        System.out.println(t1.descuento());

        do{
            //Muestra Menu
            System.out.println("Escoge el Tipo de foto");
            System.out.println("1. Lienzo");
            System.out.println("2. Tarjeta");
            opcion = sc.nextLine();

            switch (opcion) {

                case "1":
                    System.out.println("Medidas del Lienzo: ");
                    medidasLienzo = sc.nextLine();
                    System.out.println("Nombre del Lienzo: ");
                    nombreLienzo = sc.nextLine();
                    System.out.println("Precio: ");
                    precioLienzo = sc.nextLine();
                    System.out.println("Con Marco: ");
                    marcoLienzo = sc.nextLine();
                    System.out.println("Tipo de Marco: ");
                    tipoMarcoLienzo = sc.nextLine();
                    break;

                case "2":
                    System.out.println("Medidas de la Tarjeta: ");
                    medidasTarjeta = sc.nextLine();
                    System.out.println("Nombre de la Tarjeta: ");
                    nombreTarjeta = sc.nextLine();
                    System.out.println("Precio: ");
                    precioTarjeta = sc.nextLine();
                    System.out.println("Texto: ");
                    marcoTarjeta = sc.nextLine();
                    System.out.println("Fondo: ");
                    tipoMarcoTarjeta = sc.nextLine();
                default:
                    System.out.println("Opcion no valida.");
            }


        }while(!salir);



    }
}
