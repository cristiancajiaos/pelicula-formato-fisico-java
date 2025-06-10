package formato;

public class Formato {
    private Pelicula pelicula;
    private String tipo;

    public Formato() {
    }

    public Formato(Pelicula pelicula, String tipo) {
        this.pelicula = pelicula;
        this.tipo = tipo;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void getDescripcion() {
        System.out.println(this.pelicula.getTituloFormateado() + " en formato físico");
    }
}
