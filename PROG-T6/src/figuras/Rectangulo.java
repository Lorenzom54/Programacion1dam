package figuras;

public class Rectangulo extends Figura implements Calculable,Dibujable{

    private int altura, base;


    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo(String nombre, String color, int posicion, int altura, int base) {
        super(nombre, color, posicion);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public void mostrar() {
        System.out.println("Valores: ");
        System.out.println(nombre + "\n" + color + "\n" + posicion + "\n Altura: " + altura + "\n Base: " + base);
    }

    @Override
    public float calcularArea() {
        return base*altura;
    }

    @Override
    public float calculasPerimetro() {
        return 2*base+2*altura;
    }

    @Override
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo Rectángulo");
    }
}