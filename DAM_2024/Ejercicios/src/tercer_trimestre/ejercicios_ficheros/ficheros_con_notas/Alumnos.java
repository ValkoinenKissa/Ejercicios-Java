package tercer_trimestre.ejercicios_ficheros.ficheros_con_notas;
/*
Crea un programa que permita al profesor las siguientes tareas:

1.- Ingresar al alumno y su nota del módulo, siempre y cuando no exista.

2.- Modificar la nota del alumno/a, si existe.

3.- Eliminar la nota de un alumno/a si existe.

4.- Salir.
 */
public class Alumnos {
    private String nombre;
    private final String apellido;
    private String dni;
    private String nota;

    public Alumnos(String nombre, String apellido, String nota, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", nota='" + nota + '\'' +
                '}';
    }
}
