package segundo_trimestre.simulacro_examen.biblioteca;

public class Revistas extends Articulos{
    private final String tipoRevista;


    public Revistas(String nombreArticulo, String descripcionArticulo, String tipoRevista) {
        super(nombreArticulo, descripcionArticulo);
        this.tipoRevista = tipoRevista;
    }

    @Override
    public String toString() {
        return super.toString() +
                "tipoRevista='" + tipoRevista + '\'' +
                '}';
    }
}
