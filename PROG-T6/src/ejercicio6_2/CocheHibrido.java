package ejercicio6_2;

public class CocheHibrido extends Coche{
    //Atributos

    private int bateria;
    private int deposito;

    //Constructor
    public CocheHibrido(String marca, String color, int numRuedas, int bateria, int deposito) {
        super(marca, color, numRuedas);
        this.bateria = bateria;
        this.deposito = deposito;
    }


    @Override
    public void correr() {

    }
}
