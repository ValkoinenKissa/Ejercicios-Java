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
        es.limpiarEscaner();
        salarioBase = validarSalario();
        empleado = new EmpleadoTiempoCompleto(nombre, salarioBase);
        listaEmpleados.add(empleado);
        es.mostrarMensaje("El empleado ha sido creado correctamente.");
    }

    protected void crearEmpleadoPorHoras(List<Empleado> listaEmpleados) {
        String nombre;
        double tarifaHoras;
        int horasTrabajadas;
        Empleado empleado;
        nombre = es.leerTexto("Introduzca el nombre del empleado: ");
        es.limpiarEscaner();
        horasTrabajadas = validarHorasTrabajadas();
        tarifaHoras = validarSalarioPorHoras();
        empleado = new EmpleadoPorHoras(nombre, 0, horasTrabajadas, tarifaHoras);
        listaEmpleados.add(empleado);
        es.mostrarMensaje("El empleado ha sido creado correctamente.");

    }

    private int validarHorasTrabajadas() {
        int horas;
        do {
            horas = es.leerEntero("Introduce las horas trabajadas, deben de estar entre 1 y 40 horas");

            if (horas < 1 || horas > 40) {
                horas = es.leerEntero("Las horas que realiza el trabajador deben de estar entre 1 y 40 horas." +
                        " Intente de nuevo");
            }
        } while (horas < 1 || horas > 40);

        return horas;
    }

    private double validarSalario() {
        double salarioBase;
        do {
            salarioBase = es.leerDouble("Introduzca el salario del empleado, debe de ser mayor o " +
                    "igual que el SMI (1.134 euros): ");

            if (salarioBase < 1.134) {
                salarioBase = es.leerDouble("El salario para el trabajador debe de ser superior o igual al SMI " +
                        "(1.134 euros). Intente de nuevo.");
            }
        } while (salarioBase < 1.134);

        return salarioBase;

    }

    private double validarSalarioPorHoras() {
        double salarioHoras;
        do {
            salarioHoras = es.leerDouble("Introduzca el precio de la hora trabajada, " +
                    "recuerde que no puede ser inferior a 8,45 euros/hora");
            if (salarioHoras < 8.45) {
                salarioHoras = es.leerDouble("El salario pagado por hora no puede ser inferior a 8,45 euros/hora." +
                        " Intentalo de nuevo: ");
            }

        } while (salarioHoras < 8.45);

        return salarioHoras;
    }

    protected void mostrarInfoFinalEmpleados(List<Empleado> listaEmpleados) {
        double salarioBase;
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof EmpleadoTiempoCompleto) {
                //Aplicacion de requisitos salario final y asignacion con un setter
                salarioBase = empleado.calcularSalario();
                empleado.setSalarioBase(salarioBase);
                System.out.println(empleado.mostrarInformacion());
                //Downcasting para ejecutar el metodo obtener beneficios de forma polimorfica
                System.out.println(((EmpleadoTiempoCompleto) empleado).obtenerBeneficios());
            }

            if (empleado instanceof EmpleadoPorHoras) {
                //Aplicacion de requisitos salario final y asignacion con un setter
                salarioBase = empleado.calcularSalario();
                empleado.setSalarioBase(salarioBase);
                System.out.println(empleado.mostrarInformacion());
                //Downcasting para ejecutar el metodo obtener beneficios de forma polimorfica
                System.out.println(((EmpleadoPorHoras) empleado).obtenerBeneficios());
            }
        }
    }
}
