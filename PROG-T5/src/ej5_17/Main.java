package ej5_17;

public class Main {
    public static void dibujo(String[] args) {

        char dibujo1[][]=new char[7][11];


        for (int i = 0; i < dibujo1.length; i++) { //Fila
            for (int j = 0; j < dibujo1[0].length; j++) { //Columna
                if (j < 5) dibujo1[i][j] = 'O';
                else dibujo1[i][j] = 'X';
            }
        }
    }

    public static void main(String[] args) {

        System.out.println();

    }

}
