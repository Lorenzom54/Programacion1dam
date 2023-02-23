package estrcuturaFor;

public class Main {
    public static void main(String[]args){



    //for(inicializar variables;variables)
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }


        //10 al 50
        for(int i=10;i<=50;i++){
            System.out.println(i);
        }

        //Del 0 al 20, pero de dos en dos
        for(int i=0;i<=20;i+=2){
            System.out.println(i);
        }
        for(int i=0;i>=10;i++){
            System.out.println("5 X "+i+" = "+5*i);
        }
        int contador1,contador2;
        for(contador1=0,contador2=40;contador1<10 && contador2>15;contador1++,contador2-=3){
            System.out.println(contador1);
        }

        for(;contador1<10 && contador2>15;contador1++,contador2-=3){
            System.out.println(contador1);
        }

        String cadena= "Me encantan los bucles infinitos";
        for (int i=0;i<cadena.length();i++){
            System.out.println(cadena.charAt(i));
        }



    }
}
