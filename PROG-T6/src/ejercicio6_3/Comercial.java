package ejercicio6_3;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.SortedMap;

public class Comercial extends Empleado{
    //Atributos

    int horas;

    int km;

    //Constructor
    public Comercial(String n, int e, String idEmpleado, int sueldo, int horas, int km) {
        super(n, e, idEmpleado, sueldo);
        this.horas = horas;
        this.km = km;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    //Metodos
    @Override
    public void calcularSueldo() {
        System.out.println("El sueldo total es " + (horas*6+0.30*km) + "€");
    }
}
