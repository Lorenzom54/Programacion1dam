package PracticaFinal;

public class Cliente {
    //Atributos

    String nombre;

    String apellidos;

    String email;

    String telefono;



    String fechaNacimiento;

    String CodigoAcceso;

    //Constructores

    public Cliente (){}

    public Cliente(String nombre, String apellidos, String email, String telefono, String fechaNacimiento, String codigoAcceso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;

        this.fechaNacimiento = fechaNacimiento;
        CodigoAcceso = codigoAcceso;
    }

    public Cliente(String nombre, String apellidos, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        telefono = telefono;
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
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", CodigoAcceso='" + CodigoAcceso + '\'' +
                '}';
    }

    public void infoBasica(){
        System.out.println(this.nombre);
        System.out.println(this.apellidos);
        

    }

}
