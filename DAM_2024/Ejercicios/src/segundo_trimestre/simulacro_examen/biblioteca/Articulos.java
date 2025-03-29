package segundo_trimestre.simulacro_examen.biblioteca;
/*
Tenéis que realizar una aplicación para llevar a cabo la gestión de una biblioteca.
Dicha aplicación, la usan los trabajadores para la gestión de artículos y clientes

1.- Dar de alta un usuario, siempre y cuando, no exista ya.

2.- Dar de alta un artículo. Los artículos pueden ser libros, revistas y películas.

3.- Hacer un pŕestamo

4.- Salir

Tiempo maximo 30 mins
 */
public abstract class Articulos {
    private final String nombreArticulo;
    private final String descripcionArticulo;


    public Articulos(String nombreArticulo, String descripcionArticulo) {
        this.nombreArticulo = nombreArticulo;
        this.descripcionArticulo = descripcionArticulo;
    }

    @Override
    public String toString() {
        return "Articulos{" +
                "nombreArticulo='" + nombreArticulo + '\'' +
                ", descripcionArticulo='" + descripcionArticulo + '\'' +
                '}';
    }
}
