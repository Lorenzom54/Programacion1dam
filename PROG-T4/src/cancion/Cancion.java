package cancion;

public class Cancion {
    //ATRIBUTOS
    private String titulo;
    private String autor;

    //CONSTRUCTOR
    Cancion(){}

    Cancion(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
    }

    //METODOS


    public String dameTitulo() {
        return titulo;
    }

    public void ponTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String dameAutor() {
        return autor;
    }

    public void ponAutor(String autor) {
        this.autor = autor;
    }
}
