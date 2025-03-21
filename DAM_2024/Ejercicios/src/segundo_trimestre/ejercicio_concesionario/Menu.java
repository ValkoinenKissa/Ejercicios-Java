package segundo_trimestre.ejercicio_concesionario;

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
public class Menu {
    private final EntradaSalida es;

    public Menu() {
        this.es = new EntradaSalida();
    }

    protected void mostrarMenu() {
        System.out.println("1.- Dar de alta un coche nuevo");
        System.out.println("2.- Dar de alta un coche seminuevo");
        System.out.println("3.- Realizar una venta");
        System.out.println("4.- Mostar clientes del concesionario");
        System.out.println("5.- Dar de alta un mecanico");
        System.out.println("6.- Reparar un vehiculo");
        System.out.println("7.- Mostrar reparaciones");
        System.out.println("8.- Salir");
    }

    protected int menuValidado() {
        mostrarMenu();
        int opcion = es.leerEntero("Introduce la opcion que deseeas ejecutar: ");
        do {
            if (opcion < 1 || opcion > 8) {
                System.out.println("Opcion no valida, intentalo de nuevo");
            } else {
                break;
            }
        } while (true);

        return opcion;
    }

}
