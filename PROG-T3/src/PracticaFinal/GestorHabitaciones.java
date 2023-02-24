package PracticaFinal;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorHabitaciones {

    private ArrayList<Habitacion> listaHabitaciones=new ArrayList<>();

    GestorHabitaciones(ArrayList<Habitacion> listadoHabitaciones){
        listaHabitaciones=listadoHabitaciones;
        generaHabitaciones(listaHabitaciones);
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public ArrayList<Habitacion> habitacionesDisponibles(int personasReserva){

        ArrayList<Habitacion> disponibles=new ArrayList<>();
        for(Habitacion h : listaHabitaciones){
            if(h.getMax_personas()>= personasReserva) disponibles.add(h);
        }
        return disponibles;
    }

    public void generaHabitaciones(ArrayList<Habitacion> listaHabitaciones){
        listaHabitaciones.add(new Habitacion("Nº1","Habitación DELUXE","1Personas",1,1,true,false,56.90));
        listaHabitaciones.add(new Habitacion("Nº2","Habitación LUXE","1Personas",1,1,false,false,50.00));

        listaHabitaciones.add(new Habitacion("Nº3","Habitación LOSE","2Personas", 1, 2, false, true, 40.00));
        listaHabitaciones.add(new Habitacion("Nº4","Habitación TOUS","2Personas", 2, 2, false, true, 23.89));

        listaHabitaciones.add(new Habitacion("Nº5","Habitación TUPER","3personas", 2, 3, true, true, 70.90));
        listaHabitaciones.add(new Habitacion("Nº6","Habitación CARMO","3personas", 3, 3, true, true, 71.00));

        listaHabitaciones.add(new Habitacion("Nº7","Habitación MC","4persona", 3, 4, false, true, 23.89));
        listaHabitaciones.add(new Habitacion("Nº8","Habitación VS","4persona", 4, 4, false, true, 32.00));
    }



}
