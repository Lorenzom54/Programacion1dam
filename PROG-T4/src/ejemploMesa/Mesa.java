package ejemploMesa;

public class Mesa {

    //Atributos
    String color;
    float tablero;
    int numPatas;
    int posicion;
    String forma;
    //Constructores
    Mesa(){}
    Mesa(String color, float tablero, int valor){
        this.color=color;
        this.tablero=tablero;
        this.numPatas=valor;
    }

    Mesa(String color, int numPatas, String forma, float tablero, int posicion){
        this.color=color;
        this.numPatas=numPatas;
        this.forma=forma;
        this.tablero=tablero;
        this.posicion=posicion;

    }


    //Metodos

    public void infoMesa(){
        System.out.println("Color: "+this.color);
        System.out.println("Tablero: "+this.tablero);
        System.out.println("Número de patas: "+this.numPatas);
        System.out.println("Posición"+this.posicion);
        System.out.println("Forma"+this.forma);
    }
}
