package PracticaFinal;

import java.util.ArrayList;

public class GestorClientes {
    ArrayList<Cliente> listadoClientes =new ArrayList<>();


    public GestorClientes(ArrayList<Cliente> mostrarClientes) {
        generarClientes();
    }

    public boolean buscarCliente(Cliente cliente){
        for (Cliente miCliente : listadoClientes) {
            if (miCliente.getEmail().equals(cliente.getEmail())){

            }
        }
        return false;
    }

    public void agregarCliente(){
        listadoClientes.add(new Cliente("Abde","belghiti","12347899Y"));
    }

    public void mostrarClientes(){
        System.out.println(listadoClientes);
    }


    public void generarClientes(){
        listadoClientes.add(new Cliente("Abde", "belguitti","29597344R"));

        listadoClientes.add(new Cliente("Iker","Berna","12123212J"));

        listadoClientes.add(new Cliente("Jorge","Carmona","45454545T"));
    }
}
