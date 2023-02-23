package ejemploBase;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1;
        cliente1 = new Cliente();

        cliente1.nombre = "Cristina";
        cliente1.apellidos = "Moreno";
        cliente1.email = "cris@elcampico.org";

        cliente1.infoCliente();
    }
}
