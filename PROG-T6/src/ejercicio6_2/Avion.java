package ejercicio6_2;

import java.lang.invoke.VarHandle;

public class Avion extends Vehiculo {

    int helices;

    public Avion(String marca, String color, int helices) {
        super(marca, color);
        this.helices = helices;
    }

    public int getHelices() {
        return helices;
    }

    public void setHelices(int helices) {
        this.helices = helices;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Helices: " + helices);
    }
}
