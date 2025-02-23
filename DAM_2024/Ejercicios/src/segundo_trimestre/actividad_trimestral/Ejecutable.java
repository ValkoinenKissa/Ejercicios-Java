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
public class Ejecutable {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Tablets t = new Tablets();
        Clientes c = new Clientes();
        Ventas v = new Ventas();
        ArrayList<Tablets> listaTabletas = new ArrayList<>();
        ArrayList<Clientes> listaClientes = new ArrayList<>();
        ArrayList<Ventas> listaVentas = new ArrayList<>();
        int opcion;
        do {
            opcion = menu.mostarMenu();
            switch (opcion) {
                case 1:
                    t.tramitarAltaTablet(listaTabletas);
                    break;
                case 2:
                    c.tramitarAltaCliente(listaClientes);
                    break;
                case 3:
                    v.realizarVentaTablet(listaClientes, listaTabletas, listaVentas);
                    break;
                case 4:
                    v.mostrarDispositivosStock(listaTabletas);
                    break;
                case 5:
                    v.mostarVentasCliente(listaVentas, listaClientes);
            }
        } while (opcion != 6);

    }
}
