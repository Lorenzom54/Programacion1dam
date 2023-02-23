package figura;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(2,5,"Triangulo1","azul");
        triangulo.calcularArea();

        Cuadrado cuadrado = new Cuadrado("Cuadrado1","Rosa",4);
        cuadrado.calcularArea();

        Rectangulo rectangulo =new Rectangulo("Rectangulo", "Verde", 4,7);
        rectangulo.calculaArea();
    }




}
