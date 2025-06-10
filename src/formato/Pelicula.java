package formato;

public class Pelicula {
    private String titulo;
    private int annio;
    private String pais;

    public Pelicula() {
    }

    public Pelicula(String titulo, int annio, String pais) {
        this.titulo = titulo;
        this.annio = annio;
        this.pais = pais;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public String getTituloFormateado() {
        return (this.getTitulo() + "(" + this.getPais() + ", " + this.getAnnio() + ")");
    }
    
}
