package formato;

public class VHS extends Formato {
    private int annioLanzamiento;

    public VHS() {
    }

    public VHS(Pelicula pelicula, String tipo, int annioLanzamiento) {
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
        System.out.println(this.getPelicula().getTituloFormateado() + " en VHS (" + this.getAnnioLanzamiento() + ")");
    }
    
    
    
    
}
