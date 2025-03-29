package segundo_trimestre.simulacro_examen.biblioteca;

public class Peliculas extends Articulos{
    private final int duraccionPelicula;
    private final String clasificacionPelicula;

    public Peliculas(String nombreArticulo, String descripcionArticulo, int duraccionPelicula, String clasificacionPelicula) {
        super(nombreArticulo, descripcionArticulo);
        this.duraccionPelicula = duraccionPelicula;
        this.clasificacionPelicula = clasificacionPelicula;
    }

    @Override
    public String toString() {
        return super.toString() + "duraccionPelicula=" + duraccionPelicula +
                ", clasificacionPelicula='" + clasificacionPelicula + '\'' +
                '}';
    }
}
