package figura;

public class Rectangulo extends Figura{
    int lado = 2;
    int base = 2;

    public Rectangulo(String nombre, String color, int lado, int base) {
        super(nombre, color);
        this.lado = lado;
        this.base = base;
    }

    public void mostrar(){
        System.out.println(lado);
        System.out.println(base);
    }

    public float calculaArea(){
        System.out.println(base * lado);
        return 0;
    }


}
