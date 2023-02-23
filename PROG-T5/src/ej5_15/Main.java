package ej5_15;

public class Main {

    public static void sumaFila(int a1[][]){

        int totalFila=0;

        for (int i = 0; i < a1.length; i++) { //Filas
            for (int j = 0; j < a1[0].length; j++) {  //Columnas
                 totalFila=totalFila+a1[i][j];
            }
            System.out.println("Fila "+i+" "+"suma: "+totalFila);
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

    sumaFila(a1);
    }
}
