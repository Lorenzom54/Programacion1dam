package PracticaFinal;

public class Cliente {
    //Atributos

    String nombre;

    String apellidos;

    String email;

    int Telefono;

    String dni;

    String fechaNacimiento;

    String CodigoAcceso;

    //Constructores



    public Cliente(String nombre, String apellidos, String email, int telefono, String dni, String fechaNacimiento, String codigoAcceso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        Telefono = telefono;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        CodigoAcceso = codigoAcceso;
    }

    public Cliente(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    //GetterSetter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCodigoAcceso() {
        return CodigoAcceso;
    }

    public void setCodigoAcceso(String codigoAcceso) {
        CodigoAcceso = codigoAcceso;
    }

    //Metodos


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", Telefono=" + Telefono +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", CodigoAcceso='" + CodigoAcceso + '\'' +
                '}';
    }

    public void infoBasica(){
        System.out.println(this.nombre);
        System.out.println(this.apellidos);
        System.out.println(this.dni);

    }

}
