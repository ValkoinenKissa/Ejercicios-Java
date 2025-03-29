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
public abstract class Usuarios {
    private String nombre;
    private final String apellido;
    private final String correo;


    public Usuarios(String nombre, String correo, String apellido) {
        this.nombre = nombre;
        this.correo = correo;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
