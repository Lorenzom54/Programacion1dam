package ejercicio6_3;

public class Persona {
    private String nombre;
    private int edad;
    public Persona(String n,int e){
        nombre=n;
        edad=e;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrar(){
        System.out.println("Nombre:"+nombre+"\tedad:"+edad);
    }
}

