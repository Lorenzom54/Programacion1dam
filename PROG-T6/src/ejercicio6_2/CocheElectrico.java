package ejercicio6_2;

public class CocheElectrico extends Coche{
    //Atributo

    private int bateria;


    //Constructor
    public CocheElectrico(String marca, String color, int numRuedas, int bateria) {
        super(marca, color, numRuedas);
        this.bateria = bateria;
    }

    @Override
    public void correr() {
        if (bateria<2){
            System.out.println("No hay bateria");
        }else {
            System.out.println("Tenemos bateria");
            this.mostrar();
            bateria=bateria-2;
        }
    }

    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Tienes "+bateria+" de bateria");
    }


    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
}
