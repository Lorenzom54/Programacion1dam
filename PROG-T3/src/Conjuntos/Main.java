package Conjuntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void mostrar(Iterator it, String cabecera) {
        int pos =0;
        System.out.println(cabecera);
        while (it.hasNext()){
            System.out.println("Posición: "+pos+" "+it.next().toString());
            pos++;
        }

    }

    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        TreeSet<String> ts=new TreeSet<>();

        hs.add("Hola");
        hs.add("esto");


        hs.add("esto");
        hs.add("es un saludo");


        ts.add("pato");
        ts.add("gato");
        ts.add("gallina");
        ts.add("hormiga");
        ts.add("pato");


    }
}
