package ejercicio6_3;

public class Main {
    public static void main(String[] args) {
        Secretario s1 = new Secretario("Pepe",40,"e1",0,160);

        Comercial c1 = new Comercial("Carmona",19,"Comercial1",0,150,2000);

        s1.calcularSueldo();
        c1.calcularSueldo();
    }
}
