package segundo_trimestre.empleados_empresa;
/*
Crea una clase abstracta llamada Empleado con los siguientes atributos:
nombre (String)
salarioBase (double)
Debe contener un metodo abstracto calcularSalario(), que será implementado en las clases hijas.
Implementa un constructor y un metodo mostrarInformacion() que muestre el nombre y el salario.
 */
public abstract class Empleado {
    private String nombre;
    private double salarioBase;

    public Empleado() {
    }

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected double getSalarioBase() {
        return salarioBase;
    }

    protected void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    protected abstract double calcularSalario();


    protected String mostrarInformacion() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
