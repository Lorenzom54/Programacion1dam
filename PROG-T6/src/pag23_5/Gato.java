package pag23_5;

public class Gato extends Animal{

    //Constructor

    public Gato() {
    }

    public Gato(String nombre, String sonido) {
        super(nombre, sonido);
    }

    //Metodo


    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Hola, mi nombre es " + nombre);
    }

    @Override
    public void hablar() {
        super.hablar();
        System.out.println(sonido);
    }
}
