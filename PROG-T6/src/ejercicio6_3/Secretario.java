package ejercicio6_3;

public class Secretario extends Empleado{

    //Atributos

    int horas;

    //Constructor

    public Secretario(String n, int e, String idEmpleado, int sueldo,int horas) {
        super(n, e, idEmpleado, sueldo);
        this.horas = horas;
    }

    //Metodos

    public double getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public void calcularSueldo() {
        System.out.println("El sueldo total es "+horas*7+" €");
    }
}
