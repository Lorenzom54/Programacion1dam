package figuras;

public class Triangulo extends Figura implements Calculable,Dibujable{
    private int altura, base;


    public Triangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public Triangulo(String nombre, String color, int posicion, int altura, int base) {
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
        return base*altura/2;
    }

    @Override
    public float calculasPerimetro() {
        return base*3;
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
