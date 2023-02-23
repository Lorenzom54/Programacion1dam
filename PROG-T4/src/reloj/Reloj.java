package reloj;

public class Reloj {
    //Atributos

    int horas;

    int minutos;

    int segundos;


    //Constructores

    public Reloj(){}

    //Este constructor pone por defecto la hora en 0

    public Reloj(int horas){
        this.horas = horas;
    }
    //Constructor que inicializa todos los atributos
    public Reloj(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    //Metodos

    public void horaActual(){
        System.out.print("La hora actual es: "+this.horas+":"+this.minutos+":"+this.segundos);
    }

    public void pasarUnMinuto(){

    }
}
