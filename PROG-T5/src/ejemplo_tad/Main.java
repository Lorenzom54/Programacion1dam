package ejemplo_tad;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros=new ArrayList<>();

        ArrayList<Elemento> misElementos=new ArrayList<>();

        misElementos.add(new Elemento("Mesa", 50));
        Elemento nuevo=new Elemento("Coche",5000);
        misElementos.add(nuevo);

        //ArrayList<Integer> numerosPrimos=new
         //       ArrayList<>();
       // numerosPrimos.add(12);

        for (int i = 0; i < 10; i++) {
            numeros.add((int) (Math.random()* 10 ));
        }

        numeros.add(0,3);

        numeros.add(5);
        numeros.add(7);
        numeros.add(5);
        numeros.add(10);
        //numeros.addAll(numerosPrimos);

        System.out.println(numeros.size());
        System.out.println(numeros);



    }
}
