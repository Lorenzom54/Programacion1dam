package ejemploLibro;

public class Libro {

        String titulo;

        String editorial;

        String autor;

        long isbn;

        double precio;

        int numpag;

        public void infolibro(){
            System.out.println("Titulo: "+ this.titulo);
            System.out.println("Editorial: "+ this.editorial);
            System.out.println("Autor: "+ this.autor);
            System.out.println("ISBN: "+ this.isbn);
            System.out.println("Precio: "+ this.precio);
            System.out.println("Numero de paginas: "+ this.numpag);
        }



}
