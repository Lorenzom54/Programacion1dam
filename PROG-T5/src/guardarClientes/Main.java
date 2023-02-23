package guardarClientes;

public class Main {
    public static void generarClientes(Cliente[] listadoClientes) {
        listadoClientes[0] = new Cliente("Sergio", "Vera", "1234F");
        listadoClientes[1] = new Cliente("Manuel", "Garcia", "12345aa");
        listadoClientes[2] = new Cliente("Tractores", "Manolo", "12312a");
    }

    public static void mostrarClientes(Cliente[] listadoClientes) {
        for (Cliente c : listadoClientes) {
            if (c != null)
                System.out.println(c.toString());
        }
    }

    public static boolean buscarCliente(String dni, Cliente[] listadoClientes) {
        for (Cliente c : listadoClientes) {
            if (c!= null) {
                if (dni.equals(c.getDni())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Cliente[] listadoClientes = new Cliente[50];
        generarClientes(listadoClientes);
        mostrarClientes(listadoClientes);
        if(buscarCliente("12312a", listadoClientes)){
            System.out.println("Encontrado el cliente");
        }else {
            System.out.println("El cliente no esta registrado");
        }
        String miNombre="pepe";
        boolean datosOk=Validaciones.comprobarNombre(miNombre);
        System.out.println("La validacion da: "+datosOk);
    }
}
