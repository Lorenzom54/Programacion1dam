package ejercicio6_2;

public class Vehiculo {
    //Atributos
    String marca;
    String color;

    //Constructor
    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    //Metodos


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrar(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Color: " + this.color);
    }
}
