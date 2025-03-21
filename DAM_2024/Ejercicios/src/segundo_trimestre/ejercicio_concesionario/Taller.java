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
    private final EntradaSalida es;
    private ArrayList<Personas> fichaMecanicos = new ArrayList<>();
    private Concesionario concesionario;
    private ArrayList<String> listaReparaciones = new ArrayList<>();


    public Taller() {
        this.es = new EntradaSalida();
    }


    private void darDeAltaMecanicos() {
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

    }

    protected void realizarReparacion() {
        String matriculaSeleccionada;
        System.out.println("Introuce la matricula del vehiculo a reparar, se mostraran todos los clientes: ");
        concesionario = new Concesionario();
        concesionario.mostarClientesConsecionario();


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


}
