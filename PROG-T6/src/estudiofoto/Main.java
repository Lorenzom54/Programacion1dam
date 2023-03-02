package estudiofoto;



public class Main {

    public static void main(String[] args) {
        Tarjeta t1 = new Tarjeta("30X40","Cuadro de Oleo",30f,"Marco de Madera","Blanco");
        Tarjeta t2 = new Tarjeta();
        Tarjeta t3 = new Tarjeta();

        Foto f1 = new Foto("20X10","Foto Prueba",23.4f);
        Foto f2 = new Foto();
        Foto f3 = new Foto();

        Lienzo l1 = new Lienzo("30X40","Lienzo de Tela",10.5,true,"Madera");
        Lienzo l2 = new Lienzo();
        Lienzo l3 = new Lienzo();

        //l1.mostrarLienzo();
        //t1.mostrarTarjeta();
        System.out.println(t1.descuento());


    }
}
