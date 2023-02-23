package figura;

public class Cuadrado extends Figura{
    int lado = 5;

    public Cuadrado(String nombre, String color, int lado) {
        super(nombre, color);
        this.lado = lado;
    }

    public void mostrar(){
        System.out.println(lado);
    }
    public float calcularArea(){
        System.out.println(lado * lado);
        return 0;
    }
}
