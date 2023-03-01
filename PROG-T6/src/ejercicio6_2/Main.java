package ejercicio6_2;

public class Main {
    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo("SEAT","BLANCO");
        Vehiculo v2 = new Coche("BMW","NEGRO", 4);

        v2.mostrar();

        Coche c1 = new Coche("AstonMartin","Verde",4);

        Barco b1 = new Barco("RoyalCaribean","Blanco", 6.5f);

        Avion a1 = new Avion("Airbus", "Blanco", 16);

        c1.mostrar();

        b1.mostrar();

        a1.mostrar();
    }
}
