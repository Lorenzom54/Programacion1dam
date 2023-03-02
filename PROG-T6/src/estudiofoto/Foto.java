package estudiofoto;

public class Foto {
    //Atributos

    String medidas;
    String nombre;
    double precio;

    //Constructores


    public Foto() {
    }

    public Foto(String medidas, String nombre, double precio) {
        this.medidas = medidas;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getMedidas() {
        return medidas;
    }

    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarFoto(){
        System.out.println("Nombre: "+this.nombre+"\n"+"Medidas: "+ this.medidas +"\n"+"Su precio es de: "+ precio +" €");
    }

    public double descuento (){
        return precio*0.8;
    }
    public void mostrarPrecioDescuento(){
        descuento();
    }
}
