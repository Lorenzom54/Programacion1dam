package a4_3;

public class Main {
    public static void main(String[]args){
        int opcion;

        do{
            opcion=Menu.menu();
            if (opcion<0 || opcion>2){
                System.out.println("Opcion invalida");
            }
        }while (opcion != 0);
        System.out.println("Saliendo...");
    }
}
