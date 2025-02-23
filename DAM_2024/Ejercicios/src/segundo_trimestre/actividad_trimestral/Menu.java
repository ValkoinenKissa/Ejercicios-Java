package segundo_trimestre.actividad_trimestral;

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
public class Menu {
    private final EntradaSalida es;

    public Menu() {
        this.es = new EntradaSalida();
    }


    //Se muestra menu
    public int mostrarMenu() {
        System.out.println("1.- Dar de alta una tablet.");
        System.out.println("2.- Dar de alta un cliente");
        System.out.println("3.- Vender una tablet a un cliente.");
        System.out.println("4.- Mostrar tablets disponibles para la venta.");
        System.out.println("5.- Mostrar tablets compradas por un cliente en concreto.");
        System.out.println("6.- Salir.");
        return validarOpcion();

    }

    //Se valida la opcion introducida

    private int validarOpcion() {
        int opcionNumerica;
        do {
            opcionNumerica = es.leerEntero("Introduce la opción que deseas ejecutar: ");
            if (opcionNumerica <= 0 || opcionNumerica > 6) {
                System.out.println("Introduce una opcion entre 1 y 6.");
            }
        } while (opcionNumerica <= 0 || opcionNumerica > 6);

        return opcionNumerica;
    }
}
