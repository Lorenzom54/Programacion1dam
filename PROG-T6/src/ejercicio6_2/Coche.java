package ejercicio6_2;

public abstract class Coche extends Vehiculo{
    //Atributos
    int numRuedas;

    public Coche(String marca, String color, int numRuedas) {
        super(marca, color);
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Numero de rudas:" + numRuedas);
    }

    public abstract void correr();
}
