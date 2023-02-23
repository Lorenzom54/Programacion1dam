package Fecha;

public class Fecha {
    //Atributos

    private int mes;
    private int dia;
    private int anyo;

    //Constructores


    public Fecha(int mes, int dia, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    //Metodos


    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public void mostrarFecha(){
        System.out.println(this.dia+"/"+this.mes+"/"+this.anyo);
    }
}
