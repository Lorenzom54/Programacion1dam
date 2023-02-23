package barcos;

public class Main {
    public static void main(String[] args) {
        int barcos[][] = {
                {0,0,0,1},
                {1,0,0,0},
                {0,0,0,0},
                {0,1,0,0}
        };

        for(int f=0;f<barcos.length;f++){
            for (int col=0; col<barcos[0].length;col++){
                System.out.print(barcos[f][col]+",");
            }
            System.out.println();
        }

        int aciertos=0,fila,columna;





    }
}
