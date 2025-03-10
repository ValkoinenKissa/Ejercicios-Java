package segundo_trimestre.inventario_hashmap;
/*
Agregar un producto al inventario.
Buscar un producto por su código y mostrar sus detalles.
Actualizar el stock de un producto.
Eliminar un producto del inventario.
Mostrar todos los productos almacenados
 */
public class Menu {
    private final EntradaSalida es;

    public Menu() {
        this.es = new EntradaSalida();
    }


    //Se muestra menu
    public int mostrarMenu() {
        System.out.println("1.- Agregar un producto al inventario.");
        System.out.println("2.- Buscar un producto por su código y mostrar sus detalles.");
        System.out.println("3.- Actualizar el stock de un producto.");
        System.out.println("4.- Eliminar un producto del inventario.");
        System.out.println("5.- Mostrar todos los productos almacenados.");
        System.out.println("6.- Salir.");
        return validarOpcion();

    }

    //Se valida la opcion introducida

    private int validarOpcion() {
        int opcionNumerica;
        do {
            opcionNumerica = es.leerEntero("Introduce la opción que deseas ejecutar: ");
            if (opcionNumerica <= 0 || opcionNumerica > 6) {
                System.out.println("Introduce una opcion entre (1 y 6).");
            }
        } while (opcionNumerica <= 0 || opcionNumerica > 6);

        return opcionNumerica;
    }
}
