package sort;

public class Main {
    public static void intercambiar(int numeros[],int i,short minimo){
        int aux;
        aux=numeros[i];
        numeros[i]=numeros[minimo];
        numeros[minimo]=aux;
    }

    public static void mostrarNumeros(int numeros[]){
        for (int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]+",");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int numeros[]={7,4,5,-1,1};
        for(int i=0; i < numeros.length;i++){
            int minimo = i;
            for(int j=i+1; j < numeros.length;j++){
                if(numeros[j]<numeros[minimo])
                    minimo=j;
            }
            intercambiar(numeros,i, (short) minimo);
        }

    }
}
