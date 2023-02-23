package ejemploPiloto;

public class Main {
    public static void main(String[] args) {
        //DECLARAR
        CocheCarreras c1,c2;
        Piloto pi1,pi2;

        pi1=new Piloto("Pepito",1.80f, 12345);
        pi2=new Piloto();

        System.out.println(pi1.toString());

        c1=new CocheCarreras("Ferrari",pi1, "500");
        c2=new CocheCarreras("Maserate",pi1, "600");
        pi2 = new Piloto();
        System.out.println(c1.toString());
        c2=new CocheCarreras();
        pi2.setNombre("Maria");
        pi2.setAltura(1.66f);
        pi2.setNumFederado(222);
        c2.setModelo("Mercedes");
        c2.setPiloto(pi2);
        c2.setCv("500");







    }
}
