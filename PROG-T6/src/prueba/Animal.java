package prueba;

public class Animal {

    String nombre;
    String tipo;
    String numPatas;

    public Animal(String nombre, String tipo, String numPatas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numPatas = numPatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(String numPatas) {
        this.numPatas = numPatas;
    }
}
