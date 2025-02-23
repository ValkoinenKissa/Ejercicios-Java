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
public class Ventas {
    private final EntradaSalida es;
    private int idCliente;
    private String nombre;
    private String apellido;
    private int idProducto;
    private String marca;
    private String modelo;

    public Ventas() {
        this.es = new EntradaSalida();
    }

    public Ventas(String modelo, String marca, int idProducto, String apellido, String nombre, int idCliente) {
        this.es = new EntradaSalida();
        this.modelo = modelo;
        this.marca = marca;
        this.idProducto = idProducto;
        this.apellido = apellido;
        this.nombre = nombre;
        this.idCliente = idCliente;
    }

    protected int getIdCliente() {
        return idCliente;
    }

    @Override
    public String toString() {
        return "Ventas{" +
                "modelo='" + modelo + '\'' +
                ", idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", idProducto=" + idProducto +
                ", marca='" + marca + '\'' +
                '}';
    }

    /// //////////////////////////////////////////////////////////////////////

    protected void mostarVentasCliente(ArrayList<Ventas> listaVentas, ArrayList<Clientes> listaClientes) {
        int idCliente = es.leerEntero("Introduce el DNI del cliente para mostar las lablets que ha comprado");
        boolean clienteValidado = validarRegistroClientes(listaClientes, idCliente);
        if (!clienteValidado) {
            es.mostrarMensaje("El cliente buscado no existe en el sistema, intentalo de nuevo");
        }else {
            for (Ventas venta : listaVentas) {
                if (venta.getIdCliente() == idCliente) {
                    System.out.println("El cliente ha comprado los siguientes dispositivos: " + venta);
                }
            }
        }
    }

    /// ///////////////////////////////////////////////////////////////////////

    protected void mostrarDispositivosStock(ArrayList<Tablets> listaTablets) {
        es.mostrarMensaje("Mostrando la lista de dispositivos en stock...");
       for (Tablets tablet : listaTablets) {
           if (tablet.isStock()){
               System.out.println(tablet);
           }
       }
    }

    /// ////////////////////////////////////////////////////////////////////////

    protected void realizarVentaTablet(ArrayList<Clientes> listaClientes, ArrayList<Tablets> listaTablets,
                                       ArrayList<Ventas> listaVentas) {
        int idCliente, idProducto;
        es.mostrarMensaje("Bienvenido al modulo para realizar ventas, sigue los que se muestran para realizar la" +
                " venta.");

        idProducto = es.leerEntero("Introduce el ID del producto que quieres vender: ");
        idCliente = es.leerEntero("Introduce el DNI sin la letra de la persona a la que quieres vender el " +
                " producto: ");

        if (!validarRegistroClientes(listaClientes, idCliente)) {
            es.mostrarMensaje("El cliente con DNI " + idCliente + " no está registrado.");
            return;

        }

        if (!validarRegistroTablets(listaTablets, idProducto)) {
            es.mostrarMensaje("La tablet con ID " + idCliente + " no está registrada.");
            return;
        }

        //Se busca él, id persona y producto en la lista de clientes y productos

        Clientes clienteSeleccionado = null;
        Tablets tabletSeleccionada = null;

        for (Clientes cliente : listaClientes) {
            if (cliente.getIdCliente() == idCliente) {
                clienteSeleccionado = cliente;
                break;
            }
        }

        for (Tablets tableta : listaTablets) {
            if (tableta.getIdTablet() == idProducto) {
                tabletSeleccionada = tableta;
                break;
            }
        }

        // Verificación final antes de usar los objetos
        if (clienteSeleccionado == null || tabletSeleccionada == null) {
            es.mostrarMensaje("Error inesperado al recuperar los datos.");
            return;
        }

        //De instancia el objeto venta con los datos obtenidos de la busqueda del ID persona y producto

        Ventas nuevaVenta = new Ventas(tabletSeleccionada.getModelo(), tabletSeleccionada.getMarca(), idProducto,
                clienteSeleccionado.getApellido(), clienteSeleccionado.getNombre(), idCliente);

        //La tableta se retira del stock

        tabletSeleccionada.setStock();

        listaVentas.add(nuevaVenta);

        System.out.println("Articulo vendido correctamente, a continuación se muestran los detalles de la venta:");
        System.out.println(nuevaVenta);


    }

    /// //////////////////////////////////////////////////////////////////////////////////////////////////

    protected boolean validarRegistroTablets(ArrayList<Tablets> listaTablets, int idTablet) {
        for (Tablets t : listaTablets) {
            if (t.getIdTablet() == idTablet) {
                return true;
            }
        }
        return false;
    }

    protected boolean validarRegistroClientes(ArrayList<Clientes> listaClientes, int idCliente) {
        for (Clientes c : listaClientes) {
            if (c.getIdCliente() == idCliente) {
                return true;
            }
        }
        return false;
    }
}
