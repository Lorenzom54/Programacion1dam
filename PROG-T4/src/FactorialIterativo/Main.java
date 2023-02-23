package FactorialIterativo;

public class Main {

    public static int factorial(int num){
        int resultado=num;
        do {
            resultado=resultado*(--num);
        }while (num>1);
        return resultado;

    }

    public static void main(String[] args) {
        System.out.println("FACTORIAL "+factorial(4));
    }
}
