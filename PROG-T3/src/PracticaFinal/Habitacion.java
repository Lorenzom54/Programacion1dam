package PracticaFinal;

import java.util.ArrayList;

public class Habitacion {

    //Atributos

    String id;

    String nombre;

    String descripcion;

    int num_camas;

    int max_personas;

    boolean banyera;

    boolean ocupada;

    double precio;

    //Constructor

    public Habitacion(){}

    public Habitacion(String id, String nombre, String descripcion, int num_camas, int max_personas, boolean banyera, boolean ocupada, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.num_camas = num_camas;
        this.max_personas = max_personas;
        this.banyera = banyera;
        this.ocupada = ocupada;
        this.precio = precio;
    }

    //Metodo


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNum_camas() {
        return num_camas;
    }

    public void setNum_camas(int num_camas) {
        this.num_camas = num_camas;
    }

    public int getMax_personas() {
        return max_personas;
    }

    public void setMax_personas(int max_personas) {
        this.max_personas = max_personas;
    }

    public boolean isBanyera() {
        return banyera;
    }

    public void setBanyera(boolean banyera) {
        this.banyera = banyera;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
