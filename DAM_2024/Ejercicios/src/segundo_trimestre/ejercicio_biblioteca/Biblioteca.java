package segundo_trimestre.ejercicio_biblioteca;

import java.util.Scanner;

/*
Realiza una aplicación para la gestión de la biblioteca de la Universidad Europea.

En la biblioteca se tienen libros, revistas y películas que se pueden
alquilar durante un determinado tiempo por parte de los clientes.

La aplicación debe ofrecer un menú al empleado para poder realizar las siguientes tareas:

1.- Insertar artículo.

2.- Eliminar artículo.

3.- Modificar artículo.

4.- Alquilar artículo.

5.- Devolución del artículo

6.- Salir.

Todos aquellos datos que no facilita el enunciado, debéis decidirlos vosotras/os.

Mucha suerte
 */
public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }

    public static int ImprimirMenu(Scanner sc) {
        System.out.println("Hola empleado. Bienvenido al software de gestión de " +
                " la biblioteca de la Universidad Europea, estas son las opciones" +
                " disponibles: ");

        System.out.println("1. Insertar articulo");
        System.out.println("2. Eliminar articulo");
        System.out.println("3. Modificar articulo");
        System.out.println("4. Alquilar articulo");
        System.out.println("5. Devolución del articulo");
        System.out.println("6. Salir");

        int opcion = sc.nextInt();

        if (opcion == 1) {}

        return opcion;
    }
}
