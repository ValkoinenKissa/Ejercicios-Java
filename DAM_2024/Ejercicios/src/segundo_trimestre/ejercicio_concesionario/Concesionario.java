package segundo_trimestre.ejercicio_concesionario;

import java.util.ArrayList;
import java.util.List;

/*
A un concesionario de coches llegan clientes para comprar automóviles. De cada coche interesa saber la
matrícula, modelo, marca y color. Un cliente puede comprar varios coches en el concesionario.
Cuando un cliente compra un coche, se le hace una ficha en el concesionario
con la siguiente información: dni, nombre, apellidos, dirección y teléfono.

Los coches que el concesionario vende pueden ser nuevos o usados (de segunda mano).
De los coches nuevos interesa saber el número de unidades que hay en el concesionario.

De los coches viejos interesa el número de kilómetros que lleva recorridos.

El concesionario también dispone de un taller en el que los mecánicos reparan los coches que llevan los clientes.
Un mecánico repara varios coches a lo largo del día, y un coche puede ser reparado por varios mecánicos.
Los mecánicos tienen un dni, nombre, apellidos, fecha de contratación y salario.
Se desea guardar también la fecha en la que se repara cada vehículo
y el número de horas que se ha tardado en arreglar cada automóvil.
 */
public class Concesionario {
    protected List<Clientes> fichaClientes = new ArrayList<>();
    protected List<CochesNuevos> fichaVehiculosNuevos = new ArrayList<>();
    protected List<CochesUsados> fichaVehiculosUsados = new ArrayList<>();
    private final EntradaSalida es;

    public Concesionario() {
        this.es = new EntradaSalida();
    }

    private void recogerDatosCliente(String matriculaVehiculoSeleccionado) {
        System.out.println("Introduce los datos del cliente: ");
        Clientes cliente;
        String nombre, apellidos, direccion, dni, telefono;
        dni = es.leerTexto("Introduce el DNI: ");
        while (buscarCliente(dni)) {
            System.out.println("El cliente se encuentra registrado, introduce otro DNI");
            dni = es.leerTexto("Introduce el DNI: ");
        }
        nombre = es.leerTexto("Introduce el nombre del cliente: ");
        apellidos = es.leerTexto("Introduce los apellidos del cliente: ");
        direccion = es.leerTexto("Introduce la direccion del cliente: ");
        telefono = es.leerTexto("Introduce el telefono: ");
        if (buscarVehiculo(matriculaVehiculoSeleccionado)) {
            cliente = new Clientes(dni, apellidos, nombre, direccion, telefono, matriculaVehiculoSeleccionado);
            fichaClientes.add(cliente);
            System.out.println("Cliente creado correctamente, mostrando datos: " + cliente);
        } else {
            System.out.println("El vehiculo que intentas vender no se encuentra en el catalogo de vehiculos nuevos o " +
                    " de segunda mano: Operación de venta cancelada");
        }


    }

    private void mostarListaVehiculosNuevos() {

        if (!fichaVehiculosNuevos.isEmpty()) {
            for (Vehiculos vehiculo : fichaVehiculosNuevos) {
                System.out.println(vehiculo);
            }
        } else {
            System.out.println("No hay vehiculos disponibles para mostrar");
        }

    }

    private void mostarListaVehiculosViejos() {
        if (!fichaVehiculosUsados.isEmpty()) {
            for (Vehiculos vehiculo : fichaVehiculosUsados) {
                System.out.println(vehiculo);
            }
        } else {
            System.out.println("No hay vehiculos disponibles para mostrar");
        }

    }

    protected void agregarVehiculoNuevo() {
        CochesNuevos cochesNuevos;
        String matricula, color, modelo, marca;
        int stock;
        System.out.println("Introduce los datos del vehiculo: ");
        matricula = es.leerTexto("Introduce el matricula del vehiculo: ");
        color = es.leerTexto("Introduce el color del vehiculo: ");
        modelo = es.leerTexto("Introduce el modelo del vehiculo: ");
        marca = es.leerTexto("Introduce la marca: ");
        stock = es.leerEntero("Introduce el stock actual de este modelo: ");
        cochesNuevos = new CochesNuevos(matricula, color, marca, modelo, stock);
        fichaVehiculosNuevos.add(cochesNuevos);
        System.out.println("Vehiculo creado correctamente, mostrando datos: " + cochesNuevos);
    }

    protected void agregarVehiculoViejo() {
        CochesUsados cochesUsados;
        String matricula, color, modelo, marca;
        int numKilometros;
        System.out.println("Introduce los datos del vehiculo: ");
        System.out.println();
        matricula = es.leerTexto("Introduce el matricula del vehiculo: ");
        color = es.leerTexto("Introduce el color del vehiculo: ");
        modelo = es.leerTexto("Introduce el modelo del vehiculo: ");
        marca = es.leerTexto("Introduce la marca: ");
        numKilometros = es.leerEntero("Introduce los kilometros del vehiculo: ");
        cochesUsados = new CochesUsados(matricula, color, modelo, marca, numKilometros);
        fichaVehiculosUsados.add(cochesUsados);
        System.out.println("Vehiculo creado correctamente, mostrando datos: " + cochesUsados);

    }

    private String mostrarVehiculosaCliente() {
        String matriculaSeleccionada;
        System.out.println("Estos son los vehiculos disponibles en el concesionario");
        System.out.println();
        System.out.println("Vehiculos nuevos: ");
        mostarListaVehiculosNuevos();
        System.out.println();
        System.out.println("Vehiculos usados: ");
        mostarListaVehiculosViejos();
        System.out.println();
        matriculaSeleccionada = es.leerTexto("Introduce la matricula del vehiculo que te quieres quedar:");
        return matriculaSeleccionada;

    }

    protected void realizarVenta() {
        String matriculaVehiculoSeleccionado;
        matriculaVehiculoSeleccionado = mostrarVehiculosaCliente();
        System.out.println();
        recogerDatosCliente(matriculaVehiculoSeleccionado);
    }

    private boolean buscarVehiculo(String matricula) {

        for (CochesNuevos cochesNuevos : fichaVehiculosNuevos) {
            if (cochesNuevos.getMatricula().equals(matricula)) {
                return true;
            }
        }

        for (CochesUsados cochesUsados : fichaVehiculosUsados) {
            if (cochesUsados.getMatricula().equals(matricula)) {
                return true;
            }
        }
        return false;
    }

    private boolean buscarCliente(String dniCliente) {
        for (Clientes clientes : fichaClientes) {
            if (clientes.getDni().equals(dniCliente)) {
                return true;
            }
        }

        return false;
    }

    protected void mostarClientesConsecionario(){
        for (Clientes clientes : fichaClientes){
            System.out.println(clientes);
        }
    }
}
