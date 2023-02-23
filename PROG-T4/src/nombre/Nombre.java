package nombre;

public class Nombre {
    //Atributos

    private String primerNombre;

    private String segundoNombre;

    private String primerApellido;

    private String segundoApellido;

    //Constructores

    public Nombre() {
    }

    public Nombre(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    //METODOS

    public void imprimir1(){
        System.out.println("Primer Nombre"+this.primerNombre);
        System.out.println("Segundo Nombre"+ this.segundoNombre);
        System.out.println("Primer Apellido"+ this.primerApellido);
        System.out.println("Segundo Apellido"+ this.segundoApellido);
    }
    public void imprimir2(){
        System.out.println("Primer Apellido"+ this.primerApellido);
        System.out.println("Segundo Apellido"+ this.segundoApellido);
        System.out.println("Primer Nombre"+this.primerNombre);
        System.out.println("Segundo Nombre"+ this.segundoNombre);
    }



}
