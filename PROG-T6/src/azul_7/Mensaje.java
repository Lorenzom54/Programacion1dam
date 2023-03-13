package azul_7;

public class Mensaje {
    //Atributos

    String mensaje;
    String destinoRemitente;

    //Constructor

    public Mensaje() {
    }

    public Mensaje(String mensaje, String destinoRemitente) {
        this.mensaje = mensaje;
        this.destinoRemitente = destinoRemitente;
    }

    //Metodo

    public String enviarMensaje(){
        System.out.println("Este es el mensaje: " + mensaje);
        return mensaje;
    }
    public void recibirMensaje(String mensaje){
        System.out.println("Mensaje recibido: " + destinoRemitente);
        return mensaje;
    }
}
