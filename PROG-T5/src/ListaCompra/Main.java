package ListaCompra;

import ejemplo_tad.Elemento;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> listaProductos =new ArrayList<>();

        Producto p1=new Producto("Piña",3,"2kg");

        listaProductos.add(p1);

        listaProductos.add(new Producto("Lechuga",6,"2 unidades"));

        listaProductos.add(new Producto("Pan", 2,"2 Barras"));

        listaProductos.add(new Producto("Pan de molde", 4,"3 Unidades"));







    }
}
