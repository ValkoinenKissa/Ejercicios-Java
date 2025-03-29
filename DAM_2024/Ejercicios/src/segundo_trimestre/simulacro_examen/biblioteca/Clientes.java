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
public class Clientes extends Usuarios{
    private final int idCliente;
    private final String fechaNacimiento;

    public Clientes(String nombre, String correo, String apellido, int idCliente, String fechaNacimiento) {
        super(nombre, correo, apellido);
        this.idCliente = idCliente;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdCliente() {
        return idCliente;
    }

    @Override
    public String toString() {
        return super.toString() + "idCliente=" + idCliente +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
