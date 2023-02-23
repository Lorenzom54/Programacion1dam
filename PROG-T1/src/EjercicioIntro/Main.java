package EjercicioIntro;

public class Main {
    static final double IVA=0.21;       //constante

    public static void main(String[] args) {

        int entero=10000;
        double resultado=0;
        short edad=19;
        long largo=100000;
        char caracter=97+1;     //97=a
        float decimal_float=5.7f;
        double decimal_largo=5.78;
        boolean control=false;

        System.out.println(entero);      //Para imprimir por pantalla
        System.out.println(caracter);
        System.out.println(decimal_float);
        System.out.println(decimal_largo);
        System.out.println(IVA*1000);

        resultado=5*2;
        System.out.println(resultado);

        if (!control){
            System.out.println("VERDAD");
        }
        String cadena="El archivo esta en C\\Archivos programa";
        System.out.println(cadena);
    }
}
