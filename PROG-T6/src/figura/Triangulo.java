package figura;

public class Triangulo extends Figura {

    int base;
    int altura;

    public Triangulo(int base, int altura, String nombre, String color) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;

    }

    public void mostrar(){
        System.out.println(base);
        System.out.println(altura);
    }

    public float calcularArea(){
        System.out.println(base * altura / 2);
        return 0;
    }
}
