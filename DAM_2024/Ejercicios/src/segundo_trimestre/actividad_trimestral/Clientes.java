package segundo_trimestre.actividad_trimestral;

import java.util.ArrayList;

/*
Desarrollar una aplicación que me permita gestionar la compra y venta de tablets en la tienda.
Debes de guardar diferentes tipos de tablets y clientes.
TÚ decides qué propiedades tienen las tablets y cuáles los clientes.
Debes de tener una o varias arrays para guardar las tablets que están disponibles para vender y realizar las
ventas a los clientes. Haz un menú para que el usuario vea las diferentes opciones que puede realizar:

1.- Dar de alta una tablet. Comprobar que esa tablet no exista.
2.- Dar de alta un cliente. Comprobar que ese cliente no existe.
3.- Vender una tablet a un cliente.
4.- Mostrar tablets disponibles para la venta.
5.- Mostrar tablets compradas por un cliente en concreto.
6.- Salir.
 */
public class Clientes {
    private int idCliente;
    private String nombre;
    private String apellido;
    private int edadCliente;
    private int numTelefono;
    private String eCorreo;
    private final EntradaSalida es;

    protected Clientes() {
        this.es = new EntradaSalida();
    }

    protected Clientes(int idCliente, String nombre, String eCorreo, int numTelefono, String apellido, int edad) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.eCorreo = eCorreo;
        this.numTelefono = numTelefono;
        this.apellido = apellido;
        this.edadCliente = edad;
        this.es = new EntradaSalida();
    }

    protected String getNombre() {
        return nombre;
    }

    protected String getApellido() {
        return apellido;
    }

    protected int getIdCliente() {
        return idCliente;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edadCliente=" + edadCliente +
                ", numTelefono=" + numTelefono +
                ", eCorreo='" + eCorreo + '\'' +
                '}';
    }

    /// //////////////////////////////////////////////////////////////////////////////////////

    protected void tramitarAltaCliente(ArrayList<Clientes> listaClientes) {
        Clientes cliente;
        String nombre, apellido, eCorreo;
        int numTelefono, idCliente, edad;
        boolean clienteExixte;
        idCliente = es.leerEntero("Introduce el DNI del cliente sin la letra: ");
        clienteExixte = validarRegistroClientes(listaClientes, idCliente);
        if (clienteExixte) {
            es.mostrarMensaje("El DNI del cliente ya se encuentra registrado, intentalo de nuevo con otro DNI.");

        } else {
            nombre = es.leerTexto("Introduce el nombre del cliente: ");
            apellido = es.leerTexto("Introduce el apellido del cliente: ");
            edad = comprobarEdad();
            numTelefono = comprobarTelefono();
            eCorreo = es.leerTexto("Introduce el eCorreo del cliente: ");
            cliente = new Clientes(idCliente, nombre, eCorreo, numTelefono, apellido, edad);
            listaClientes.add(cliente);
            es.mostrarMensaje("Alta del cliente realizado con exito.");

            System.out.println(cliente);
        }

    }

    /// ////////////////////////////////////////////////////////////////////


    protected boolean validarRegistroClientes(ArrayList<Clientes> listaClientes, int idCliente) {
        for (Clientes c : listaClientes) {
            if (c.getIdCliente() == idCliente) {
                return true;
            }
        }
        return false;
    }

    /// //////////////////////////////////////////////////////////////////////


    private int comprobarEdad() {
        int edad;
        do {
            edad = es.leerEntero("Introduce la edad del cliente: ");
            if (edad < 18) {
                es.mostrarMensaje("Edad no válida, introdúcela de nuevo.");
            }
        } while (edad < 18);

        return edad;
    }

    /// ////////////////////////////////////////////////////////////////////

    private int comprobarTelefono() {
        int telefono;
        do {
            telefono = es.leerEntero("Introduce el telefono: ");

            if (telefono < 9) {
                es.mostrarMensaje("Telefono no valido, el telefono debe tener 9 digitos.");
            }

        }while (telefono < 9);

        return telefono;
    }

}
