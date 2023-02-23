package ejemploPiloto;

public class Piloto {

    //ATRIBUTOS
    private String nombre;
    private float altura;
    private int numFederado;

    //CONSTRUCTOR

    public Piloto() {}

    public Piloto(String nombre, float altura, int numFederado) {
        this.nombre = nombre;
        this.altura = altura;
        this.numFederado = numFederado;
    }

    //GETTERANDSETTER


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getNumFederado() {
        return numFederado;
    }

    public void setNumFederado(int numFederado) {
        this.numFederado = numFederado;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "nombre='" + nombre + '\'' +
                ", altura=" + altura +
                ", numFederado=" + numFederado +
                '}';
    }
}
