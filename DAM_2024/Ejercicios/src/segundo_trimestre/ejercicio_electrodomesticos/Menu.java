package segundo_trimestre.ejercicio_electrodomesticos;

public class Menu {
    private final EntradaSalida es;

    public Menu() {
        this.es = new EntradaSalida();
    }


    //Se muestra menu
    public int mostrarMenu() {
        System.out.println("1.- Crear Lavadora.");
        System.out.println("2.- Crear Televisión.");
        System.out.println("3.- Mostrar Precios Finales.");
        System.out.println("4.- Salir.");
        return validarOpcion();

    }

    //Se valida la opcion introducida

    private int validarOpcion() {
        int opcionNumerica;
        do {
            opcionNumerica = es.leerEntero("Introduce la opción que deseas ejecutar: ");
            if (opcionNumerica <= 0 || opcionNumerica > 4) {
                System.out.println("Introduce una opcion entre 1 y 4.");
            }
        } while (opcionNumerica <= 0 || opcionNumerica > 4);

        return opcionNumerica;
    }
}
