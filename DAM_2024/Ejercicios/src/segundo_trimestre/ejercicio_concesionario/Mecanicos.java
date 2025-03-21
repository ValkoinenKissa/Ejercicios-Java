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
public class Mecanicos extends Personas {
    private final String fechaContratacion;
    private double salario;


    public Mecanicos(String dni, String apellidos, String nombre, String fechaContratacion, double salario) {
        super(dni, apellidos, nombre);
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()  +
                "fechaContratacion='" + fechaContratacion + '\'' +
                ", salario=" + salario +
                '}';
    }
}
