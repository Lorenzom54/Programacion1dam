package ejercicio6_2;

public class Barco extends Vehiculo{
    float eslora;

    public Barco(String marca, String color, float eslora) {
        super(marca, color);
        this.eslora = eslora;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Eslora:" + eslora);
    }
}
