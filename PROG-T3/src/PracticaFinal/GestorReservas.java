package PracticaFinal;

import java.util.ArrayList;

public class GestorReservas {

    private ArrayList<Reservas> listaReservas=new ArrayList<>();


    GestorReservas(ArrayList<Reservas> listaReservas){
        listaReservas=listaReservas;
        generarReservas();
    }

    public ArrayList<Reservas> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reservas> listaReservas) {
        this.listaReservas = listaReservas;
    }






    public void generarReservas(){
        listaReservas.add(new Reservas("3","02/12/2023","05/12/2023"));

        listaReservas.add(new Reservas(23,"5","Nº1","03/07/2023","05/07/2023"));
    }
    }

