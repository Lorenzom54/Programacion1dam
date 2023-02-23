package ejemploMesa;

public class Main {
    public static void main(String[]args){

        Mesa mesaRustica, mesaModerna, mesaAuxiliar;

        mesaRustica=new Mesa();
        mesaModerna=new Mesa();
        mesaAuxiliar=new Mesa();

        mesaRustica.color="roble";
        mesaRustica.tablero=40.0f;
        mesaRustica.numPatas=4;
        mesaRustica.posicion=0;
        mesaRustica.forma="Cuadrada";

        mesaModerna.color="cristal";
        mesaModerna.tablero=36.0f;
        mesaModerna.numPatas=4;
        mesaModerna.posicion=0;
        mesaModerna.forma="triangular";

        mesaAuxiliar.color="Cerezo";
        mesaAuxiliar.tablero=30.0f;
        mesaAuxiliar.numPatas=1;
        mesaAuxiliar.posicion=2;
        mesaAuxiliar.forma="Redonda";

        mesaRustica.infoMesa();



    }
}
