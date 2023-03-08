package figuras;

public abstract class Figura {
    protected String nombre;
    protected String color;
    protected int posicion;

    //Constructor
    public Figura() {
    }

    public Figura(String nombre, String color, int posicion) {
        this.nombre = nombre;
        this.color = color;
        this.posicion = posicion;
    }

    //Metodo
    public abstract void mostrar();
}
