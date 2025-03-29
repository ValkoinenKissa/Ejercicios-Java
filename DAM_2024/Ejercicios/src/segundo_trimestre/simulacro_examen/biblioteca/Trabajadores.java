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
public class Trabajadores extends Usuarios {
    private final int idTrabajador;
    private double salario;


    public Trabajadores(String nombre, String correo, String apellido, int idTrabajador, double salario) {
        super(nombre, correo, apellido);
        this.idTrabajador = idTrabajador;
        this.salario = salario;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + " idTrabajador=" + idTrabajador +
                ", salario=" + salario +
                '}';
    }
}
