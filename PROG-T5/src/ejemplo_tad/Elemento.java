package ejemplo_tad;

public class Elemento {
    String nombre;
    int precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Elemento(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;



    }
}
