package azul_7;

public class EMAIL extends Mensaje{
    //Atributos
    String archivos;

    //Constructor

    public EMAIL(String archivos) {
        this.archivos = archivos;
    }

    public EMAIL(String mensaje, String destinoRemitente, String archivos) {
        super(mensaje, destinoRemitente);
        this.archivos = archivos;
    }
}
