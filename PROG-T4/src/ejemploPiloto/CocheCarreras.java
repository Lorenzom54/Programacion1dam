package ejemploPiloto;

public class CocheCarreras {
    //ATRIBUTOS
    private String modelo;
    private Piloto piloto;
    private String cv;

    //CONSTRUCTORES


    public CocheCarreras() {
    }

    public CocheCarreras(String modelo, Piloto piloto, String cv) {
        this.modelo = modelo;
        this.piloto = piloto;
        this.cv = cv;
    }

    //GETTERANDSETTER


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "CocheCarreras{" +
                "modelo='" + modelo + '\'' +
                ", piloto='" + piloto + '\'' +
                ", cv='" + cv + '\'' +
                '}';
    }
}
