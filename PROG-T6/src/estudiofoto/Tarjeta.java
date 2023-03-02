package estudiofoto;

public class Tarjeta extends Foto{
    //Atributos

    String texto;

    String fondo;

    //Constructores


    public Tarjeta() {
    }

    public Tarjeta(String medidas, String nombre, double precio, String texto, String fondo) {
        super(medidas, nombre, precio);
        this.texto = texto;
        this.fondo = fondo;
    }

    //Metodos


    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFondo() {
        return fondo;
    }

    public void setFondo(String fondo) {
        this.fondo = fondo;
    }

    public void mostrarTarjeta(){
        System.out.println("Su nombre es: "+ this.nombre + "\n" + "Su Medida es: " + this.medidas + "\n" + "Su precio es: " + this.precio + "€");
    }



    @Override
    public double descuento() {
        return precio*0.85;
    }

    public void mostrarPrecioDescuento(){
        descuento();
    }
}
