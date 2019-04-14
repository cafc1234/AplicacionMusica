package co.edu.konradlorenz.cardview;

public class Cancion {
    private String nombreCancion;
    private String nombreArtista;
    private String duracion;
    private int coverMiniatura;

    public Cancion(){

    }

    public Cancion(String nombreCancion, String nombreArtista, String duracion, int coverMiniatura) {
        this.nombreCancion = nombreCancion;
        this.nombreArtista = nombreArtista;
        this.duracion = duracion;
        this.coverMiniatura = coverMiniatura;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCoverMiniatura() {
        return coverMiniatura;
    }

    public void setCoverMiniatura(int coverMiniatura) {
        this.coverMiniatura = coverMiniatura;
    }
}
