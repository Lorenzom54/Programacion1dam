package prueba;

import java.util.ArrayList;

public class GestorAnimales {

    ArrayList<Animal> listadoAnimales;

    public GestorAnimales(ArrayList<Animal> listadoAnimales){
        this.listadoAnimales = listadoAnimales;
        generarDatos();
    }

    public void generarDatos(){
        listadoAnimales.add (new Animal("Leon","carnivoro", "4"));
        Animal nuevo =new Animal("Pato", "herviboro", "2");
        listadoAnimales.add(nuevo);
        listadoAnimales.add(new Animal("Caballo", "Carnivoro", "4"));
    }


}
