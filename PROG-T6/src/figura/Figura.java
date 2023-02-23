package figura;

public class Figura {
    String nombre;
    String color;

    public Figura(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public void mostrar() {
        System.out.println(nombre);
        System.out.println(color);
    }
}
