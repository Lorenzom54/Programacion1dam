package azul_7;

public class MMS extends Mensaje{

    //Atributos
    String imagenes;

    public MMS(String imagenes) {
        this.imagenes = imagenes;
    }

    public MMS(String mensaje, String destinoRemitente, String imagenes) {
        super(mensaje, destinoRemitente);
        this.imagenes = imagenes;
    }
}
