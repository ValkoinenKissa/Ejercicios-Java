package segundo_trimestre.ejercicio_concesionario;

import java.util.ArrayList;

/*
El concesionario también dispone de un taller en el que los mecánicos reparan los coches que llevan los clientes.
Un mecánico repara varios coches a lo largo del día, y un coche puede ser reparado por varios mecánicos.
Los mecánicos tienen un dni, nombre, apellidos, fecha de contratación y salario.
Se desea guardar también la fecha en la que se repara cada vehículo
y el número de horas que se ha tardado en arreglar cada automóvil.
 */
public class Taller {
    private final EntradaSalida es = new EntradaSalida();
    private final ArrayList<Personas> fichaMecanicos = new ArrayList<>();
    private final ArrayList<Reparaciones> listaReparaciones = new ArrayList<>();
    private final Concesionario concesionario;

    public Taller(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    protected void darDeAltaMecanicos() {
        String dni, nombre, apellidos, fechaContratacion;
        double salario;
        System.out.println("A continuación, introduce los datos del nuevo mecanico que quieres dar de alta: ");
        Personas mecanico;
        dni = es.leerTexto("Introduce el DNI: ");
        while (buscarMecanico(dni)) {
            System.out.println("El mecanico se encuentra registrado, introduce otro DNI");
            dni = es.leerTexto("Introduce el DNI: ");
        }
        nombre = es.leerTexto("Introduce el nombre del mecanico: ");
        apellidos = es.leerTexto("Introduce los apellidos del mecanico: ");
        fechaContratacion = es.leerTexto("Introduce la fecha de contratacion del mecanico (dd/mm/yyyy): ");
        salario = es.leerDouble("Introduce el salario del mecanico: ");
        mecanico = new Mecanicos(dni, apellidos, nombre, fechaContratacion, salario);
        fichaMecanicos.add(mecanico);
        System.out.println("Se ha registrado correctamente al mecanico, mostrando sus datos: " + mecanico);
        es.limpiarEscaner();

    }

    protected void realizarReparacion() {
        Reparaciones reparacion;
        String matriculaSeleccionada, dniMecanicos, fechaReparacion;
        int horasEmpleadas;
        ArrayList<String> dniMecanicosInvolucrados = new ArrayList<>();
        System.out.println("Introuce la matricula del vehiculo a reparar, se mostraran todos los clientes: ");
        concesionario.mostarClientesConsecionario();

        matriculaSeleccionada = es.leerTexto("Introduce la matricula del vehiculo: ");
        if (concesionario.buscarVehiculo(matriculaSeleccionada)) {
            System.out.println("A continuación se mostrara los mecanicos disponibles para realizar la reparacion: ");
            mostrarMecanicos();
            while (true) {
                dniMecanicos = es.leerTexto("Introduce el DNI de los mecanicos que realizaran la reparacion: ");
                dniMecanicosInvolucrados.add(dniMecanicos);
                String decision = es.leerTexto("¿Quieres seguir introduciedo mecanicos? (S/N): ").toUpperCase();
                if (decision.equals("N")) {
                    break;
                }
            }

            fechaReparacion = es.leerTexto("Introduce la fecha de reparacion (dd/mm/yyyy): ");
            horasEmpleadas = es.leerEntero("Introduce las horas empleadas en la reparacion del vehiculo");
            reparacion = new Reparaciones(matriculaSeleccionada, horasEmpleadas, fechaReparacion, dniMecanicosInvolucrados);
            listaReparaciones.add(reparacion);
            System.out.println("Los datos de la reparación han sido almacenados correctamente: ");
            es.limpiarEscaner();


        } else {
            System.out.println("El vehiculo introducido no se encuentra registrado, prueba de nuevo");
        }


    }

    private void mostrarMecanicos() {
        System.out.println("Mostrando lista de mecanicos: ");
        if (!fichaMecanicos.isEmpty()) {
            for (Personas m : fichaMecanicos) {
                System.out.println(m.toString());
            }
        } else {
            System.out.println("No hay mecanicos disponilbles.");
        }
    }


    private boolean buscarMecanico(String dniMecanico) {
        for (Personas mecanicos : fichaMecanicos) {
            if (mecanicos.getDni().equals(dniMecanico)) {
                return true;
            }
        }

        return false;
    }

    protected void mostarReparaciones() {
        System.out.println("Mostrando lista de reparaciones: ");
        if (!listaReparaciones.isEmpty()) {
            for (Reparaciones reparacion : listaReparaciones) {
                System.out.println(reparacion);
            }
        }else {
            System.out.println("No hay reparaciones disponibles.");
        }
    }


}
