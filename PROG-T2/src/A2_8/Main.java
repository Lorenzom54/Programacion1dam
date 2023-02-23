package A2_8;

public class Main {
    public static void main(String[]args){

        double nota=5;

        switch ((int)nota){
            case 0:
                System.out.println("No Presentado");
                break;

            case 1: case 4:
                System.out.println("Suspenso");
            break;

            case 5:
                System.out.println("Aprobado");
                break;

            case 6: case 7:
                System.out.println("Bien");
                break;

            case 8: case 9:
                System.out.println("Notable");
                break;
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Nota no valida");
                break;

        }



    }
}
