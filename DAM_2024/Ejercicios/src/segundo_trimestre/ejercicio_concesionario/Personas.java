package segundo_trimestre.ejercicio_concesionario;
/*
A un concesionario de coches llegan clientes para comprar automóviles. De cada coche interesa saber la
matrícula, modelo, marca y color. Un cliente puede comprar varios coches en el concesionario.
Cuando un cliente compra un coche, se le hace una ficha en el concesionario
con la siguiente información: dni, nombre, apellidos, dirección y teléfono.

El concesionario también dispone de un taller en el que los mecánicos reparan los coches que llevan los clientes.
Un mecánico repara varios coches a lo largo del día, y un coche puede ser reparado por varios mecánicos.
Los mecánicos tienen un dni, nombre, apellidos, fecha de contratación y salario.
Se desea guardar también la fecha en la que se repara cada vehículo
y el número de horas que se ha tardado en arreglar cada automóvil.
 */
public abstract class Personas {
    private String dni;
    private String nombre;
    private String apellidos;


    public Personas(String dni, String apellidos, String nombre) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'';
    }

}
