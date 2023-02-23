package PracticaFinal;

import java.util.ArrayList;

public class GestorHabitaciones {

    private ArrayList<Habitacion> listaHabitaciones=new ArrayList<>();

    GestorHabitaciones(ArrayList<Habitacion> listadoHabitaciones){
        listaHabitaciones=listadoHabitaciones;
        generaHabitaciones();
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
    public void generaHabitaciones(){
        listaHabitaciones.add(new Habitacion("Nº1","Pepito","1Personas",1,1,true,true,56.90));

        listaHabitaciones.add(new Habitacion("Nº2","Manolo","2Personas", 1, 2, false, true, 23.89));

        listaHabitaciones.add(new Habitacion("Nº3","Isabel","3personas", 2, 3, true, true, 70.90));

        listaHabitaciones.add(new Habitacion("Nº4","Santiago","4persona", 3, 4, false, true, 23.89));

        listaHabitaciones.add(new Habitacion("Nº5","Domingo","4Personas", 4, 5, true, true, 58.88));
    }
}
