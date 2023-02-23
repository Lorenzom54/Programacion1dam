package autobus;

public class Autobus {
        //Atributos
    private boolean esElectrico;
    private String linea;
    static float precio;
    private int pasajeros;
    private String conductor;

    //GETTER Y SETTER

    //Electrico
    public boolean getesElectrico(){
        return esElectrico;
    }
    public void setEsElectrico(boolean electric){
        this.esElectrico=electric;
    }

    //Linea
    public String getLinea(){
        return linea;
    }
    public void setLinea(String line){
        this.linea=line;
    }

    //Pasajeros
    public int getPasajeros(){
        return pasajeros;
    }
    public void setPasajeros(int pasajers){
        this.pasajeros=pasajers;
    }

    //Conductor

    public String getConductor(){
        return conductor;
    }
    public void setConductor(String conductorr){
        this.conductor=conductorr;
    }

    //Constructores

    Autobus(){}

    Autobus(boolean esElectrico, String linea, int pasageros, String conductor) {
        this.esElectrico = esElectrico;
        this.linea = linea;
        this.pasajeros = pasajeros;
        this.conductor = conductor;
    }

    public static void cambiarPrecio(float valor){

        precio=precio+valor;

    }



    @Override
    public String toString() {
        return "Autobus{" +
                "esElectrico=" + esElectrico +
                ", linea='" + linea + '\'' +
                ", precio "+ precio+
                ", pasageros=" + pasajeros +
                ", conductor='" + conductor + '\'' +
                '}';
    }
}
