package ej5_16;

public class Main {

    public static void sumaColumna(int a1[][]){

        int totalFila=0;
        int totalColumna=0;

        for (int i = 0; i < a1[0].length; i++) { //Columna
            for (int j = 0; j < a1.length; j++) {  //Fila
                totalColumna=totalColumna+a1[j][i];
            }
            System.out.println("Columna "+i+" "+"suma: "+totalColumna);
            totalFila=0;
        }
    }


    public static void main(String[] args) {
        int a1[][] = {
                {2, 8, 4, 1, 7, 9, 3},
                {4, 1, 2, 5, 7, 4, 1},
                {2, 8, 4, 1, 7, 9, 3},
                {4, 1, 2, 5, 7, 4, 1},
                {7, 2, 11, 54, 4, 1, 1}
        };

        sumaColumna(a1);

    }
}
