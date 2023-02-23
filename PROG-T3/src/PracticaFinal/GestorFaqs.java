package PracticaFinal;

import java.util.ArrayList;

public class GestorFaqs {

    private ArrayList<Faqs> listapreguntas=new ArrayList<>();

    GestorFaqs(ArrayList<Faqs> listapreguntas){
        listapreguntas=listapreguntas;
        generarPreguntas();
    }

    public ArrayList<Faqs> getListapreguntas() {
        return listapreguntas;
    }

    public void setListapreguntas(ArrayList<Faqs> listapreguntas) {
        this.listapreguntas = listapreguntas;
    }


    public void generarPreguntas(){
        listapreguntas.add(new Faqs(1,"¿Cómo puedo llamar fuera del hotel con el teléfono de la habitación?","Primero descuelgas el Telefono, a continuacion pulsas 0, e introduces el numero deseado."));

        listapreguntas.add(new Faqs(2,"¿A cuanto esta el centro de el Hotel?","A 1KM."));

        listapreguntas.add(new Faqs(3,"¿Cuanto es de Fianza?","Se retienen 100€ de la tarjeta."));
    }

}
