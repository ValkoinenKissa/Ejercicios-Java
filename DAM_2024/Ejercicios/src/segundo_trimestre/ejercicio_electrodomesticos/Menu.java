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

    public int mostrarMenuLavadora() {
        System.out.println("Selecciona como quieres crear la Lavadora: ");
        System.out.println("1.- Crear Lavadora sin parametros, con valores por defecto");
        System.out.println("2.- Crear lavadora solo con precio y peso");
        System.out.println("3.- Crear lavadora solo con todos los parametros disponibles");
        return validarOpcionObjetos();
    }

    public int mostrarMenuTelevisor() {
        System.out.println("Selecciona como quieres crear el Televisor: ");
        System.out.println("1.- Crear Televisor sin parametros, con valores por defecto");
        System.out.println("2.- Crear Televisor solo con precio y peso");
        System.out.println("3.- Crear Televisor solo con todos los parametros disponibles");
        return validarOpcionObjetos();
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

    private int validarOpcionObjetos() {
        int opcionNumerica;
        do {
            opcionNumerica = es.leerEntero("Introduce la opción que deseas ejecutar: ");
            if (opcionNumerica <= 0 || opcionNumerica > 3) {
                System.out.println("Introduce una opcion entre 1 y 3.");
            }
        } while (opcionNumerica <= 0 || opcionNumerica > 3);

        return opcionNumerica;
    }
}
