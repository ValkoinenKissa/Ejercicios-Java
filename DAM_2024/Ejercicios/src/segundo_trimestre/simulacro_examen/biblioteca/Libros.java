package segundo_trimestre.simulacro_examen.biblioteca;

public class Libros extends Articulos{
    private final int isbn;
    private final String genero;

    public Libros(String nombreArticulo, String descripcionArticulo, int isbn, String genero) {
        super(nombreArticulo, descripcionArticulo);
        this.isbn = isbn;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() +
                "isbn=" + isbn +
                ", genero='" + genero + '\'' +
                '}';
    }
}
