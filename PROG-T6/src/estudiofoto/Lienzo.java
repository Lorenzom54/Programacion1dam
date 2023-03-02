package estudiofoto;

public class Lienzo extends Foto{
    //Atributo

    boolean conMarco;

    String tipoMarco;

    //Constructores


    public Lienzo() {
    }

    public Lienzo(String medidas, String nombre, double precio, boolean conMarco, String tipoMarco) {
        super(medidas, nombre, precio);
        this.conMarco = conMarco;
        this.tipoMarco = tipoMarco;
    }

    //Metodos


    public boolean isConMarco() {
        return conMarco;
    }

    public void setConMarco(boolean conMarco) {
        this.conMarco = conMarco;
    }

    public String getTipoMarco() {
        return tipoMarco;
    }

    public void setTipoMarco(String tipoMarco) {
        this.tipoMarco = tipoMarco;
    }

    @Override
    public double descuento() {
        return precio*0.8;
    }

    public void mostrarLienzo(){
        System.out.println("Nombre: "+this.nombre+"\n"+"Medidas: "+ this.medidas +"\n"+"Su precio es de: "+ precio +" €"+"\n"+"Contiene Marco: "+ conMarco);
    }

    public void mostrarPrecioDescuento(){
        descuento();
    }

}