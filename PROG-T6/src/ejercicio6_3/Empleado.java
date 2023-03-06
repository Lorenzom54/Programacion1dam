package ejercicio6_3;

public abstract class Empleado extends Persona{
    //Atributos

    String idEmpleado;

    int sueldo;

    //Constructor
    public Empleado(String n, int e, String idEmpleado, int sueldo) {
        super(n, e);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }
    public abstract void calcularSueldo();

}
