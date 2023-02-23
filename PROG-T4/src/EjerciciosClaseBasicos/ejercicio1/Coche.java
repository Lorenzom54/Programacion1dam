package EjerciciosClaseBasicos.ejercicio1;

public class Coche {

    //Atributos

    String matricula;

    String marca;

    String color;

    int numPuertas;

    float motor;

    float precio;

    boolean nuevo;

    boolean revisado;

    boolean cambioAceite;

    int anyo;

    //Constructores

    //Contructor que recibe la matrícula, la marca, el año y el color del coche

    Coche(){}

    Coche(String matricula, String marca, int anyo, String color){

        this.matricula=matricula;

        this.marca=marca;

        this.anyo=anyo;

        this.color=color;
    }

    //Contructor con todos los valores

    Coche(String matricula, String marca, String color, int numPuertas, float motor, float precio, boolean nuevo, boolean revisado, boolean cambioAceite, int anyo){
        this.matricula=matricula;

        this.marca=marca;

        this.color=color;

        this.numPuertas=numPuertas;

        this.motor=motor;

        this.precio=precio;

        this.nuevo=nuevo;

        this.revisado=revisado;

        this.cambioAceite=cambioAceite;

        this.anyo=anyo;
    }
    //Metodos

    public void infoCoche(){
        System.out.println("Marca "+ this.marca);
        System.out.println("Color "+ this.color);
        System.out.println(this.numPuertas+ " numero de puertas");
        System.out.println(this.motor+ "Centrimetos cubicos de cilindrada");
        System.out.println("Precio "+ this.precio);
        System.out.println("Estado "+ this.nuevo);
        System.out.println("Revision "+ this.revisado);
        System.out.println("Cambio de aceite "+ this.cambioAceite);
        System.out.println("Año matriculacion "+ this.anyo);

    }




}
