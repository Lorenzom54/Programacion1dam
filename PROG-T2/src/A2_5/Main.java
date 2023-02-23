package A2_5;

public class Main {
    public static void main(String[] args){
        int contador=0;

        //while
        while(contador<10){
            if (contador % 2 == 0) {
                System.out.println(contador+" HOLA");
            }
            contador++;
        }

        //do while
        contador=0;
        do {
            if (contador % 2 == 0) {
                System.out.println(contador + " HOLA");
            }
            contador++;
        }while (contador<10);




    }
}
