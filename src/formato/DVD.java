package formato;

public class DVD extends Formato {
    private int annioLanzamiento;

    public DVD() {
    }

    public DVD(Pelicula pelicula, String tipo, int annioLanzamiento) {
        super(pelicula, tipo);
        this.annioLanzamiento = annioLanzamiento;
    }

    public int getAnnioLanzamiento() {
        return annioLanzamiento;
    }

    public void setAnnioLanzamiento(int annioLanzamiento) {
        this.annioLanzamiento = annioLanzamiento;
    }
    
    @Override
    public void getDescripcion() {
        System.out.println(this.getPelicula().getTituloFormateado() + " en DVD (" + this.getAnnioLanzamiento() + ")");
    }
}
