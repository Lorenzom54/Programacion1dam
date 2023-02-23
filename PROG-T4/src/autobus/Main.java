package autobus;

public class Main {

    //Parametros por referencia

    public static void cambiarNombreConductor(Autobus mibus){
        //mibus.conductor = "Juanito";
    }

    public static void main(String[]args){

       Autobus a1, a2, a3, a4, a5;

       Autobus.precio=2.30f;

       a1 =new Autobus(true,"A1",40,"PEPE");

       a2 = new Autobus(false,"B2",50,"PEPA");

       a3 = new Autobus(true,"C3",60,"ANTONIA");

       a4 = new Autobus(false,"D4",30,"LORENZO");

       a5 = new Autobus(true, "E5",34,"ANTONIO");

       a3.cambiarPrecio(0.4f);
        cambiarNombreConductor(a3);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());

    }
}
