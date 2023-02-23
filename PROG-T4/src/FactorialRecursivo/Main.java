package FactorialRecursivo;

public class Main {
    public static int factorialR(int num){
        if (num==1) return 1; //CASO BASE
        else return num*factorialR(--num);
    }
}
