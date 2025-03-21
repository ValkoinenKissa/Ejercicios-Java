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
public class Ejecutable {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();
        Taller taller = new Taller(concesionario);
        Menu menu = new Menu();
        int opcion;
        do {
            opcion = menu.menuValidado();
            switch (opcion) {
                case 1:
                    concesionario.agregarVehiculoNuevo();
                    break;
                case 2:
                    concesionario.agregarVehiculoViejo();
                    break;
                case 3:
                    concesionario.realizarVenta();
                    break;
                case 4:
                    concesionario.mostarClientesConsecionario();
                    break;
                case 5:
                    taller.darDeAltaMecanicos();
                    break;
                case 6:
                    taller.realizarReparacion();
                    break;
                case 7:
                    taller.mostarReparaciones();
                    break;

                case 8:
                    System.out.println("Abandonando la aplicacion...");
                    break;
            }
        } while (opcion != 8);


    }
}
