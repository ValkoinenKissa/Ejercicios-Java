package segundo_trimestre.empleados_empresa;

import java.util.List;

/*
En la clase Main, crea un array de empleados y almacena objetos de ambos tipos (EmpleadoTiempoCompleto y EmpleadoPorHoras).
Recorre el array e imprime la información de cada empleado, utilizando polimorfismo.
 */
public class Gestion {
    final EntradaSalida es = new EntradaSalida();

    protected void crearEmpleadoTiempoCompleto(List<Empleado> listaEmpleados) {
        String nombre;
        double salarioBase;
        Empleado empleado;
        nombre = es.leerTexto("Introduzca el nombre del empleado: ");
        salarioBase = validarSalario();
        empleado = new EmpleadoTiempoCompleto(nombre, salarioBase);
        listaEmpleados.add(empleado);
    }

    protected void crearEmpleadoPorHoras(List<Empleado> listaEmpleados) {
        String nombre;
        double tarifaHoras;
        int horasTrabajadas;
        Empleado empleado;
        nombre = es.leerTexto("Introduzca el nombre del empleado: ");
        horasTrabajadas = validarHorasTrabajadas();
        tarifaHoras = validarSalarioPorHoras();
        empleado = new EmpleadoPorHoras(nombre, 0, horasTrabajadas, tarifaHoras);
        listaEmpleados.add(empleado);

    }

    private int validarHorasTrabajadas() {
        int horas = es.leerEntero("Introduce las horas trabajadas, deben de estar entre 1 y 8 horas");
        while (horas < 1 || horas > 8) {
            horas = es.leerEntero("Las horas que realiza el trabajador deben de estar entre 1 y 8 horas." +
                    " Intente de nuevo");
        }
        return horas;
    }

    private double validarSalario() {
        double salarioBase = es.leerDouble("Introduzca el salario del empleado, debe de ser mayor o " +
                "igual que el SMI (1.134 euros): ");
        while (salarioBase > 1.134) {
            salarioBase = es.leerDouble("El salario para el trabajador debe de ser superior o igual al SMI " +
                    "(1.134 euros). Intente de nuevo.");
        }

        return salarioBase;

    }

    private double validarSalarioPorHoras() {
        double salarioHoras = es.leerDouble("Introduzca el precio de la hora trabajada, " +
                "recuerde que no puede ser inferior a 8,45 euros/hora");
        while (salarioHoras > 8.45) {
            salarioHoras = es.leerDouble("El salario pagado por hora no puede ser inferior a 8,45 euros/hora." +
                    " Intentalo de nuevo: ");

        }

        return salarioHoras;
    }
}
