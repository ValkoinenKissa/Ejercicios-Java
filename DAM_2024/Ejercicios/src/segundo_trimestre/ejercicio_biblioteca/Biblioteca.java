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

6.- Mostrar articulos para el prestamo disponibles

7.- Mostrar los articulos prestados

8.- Mostrar los préstamos de un cliente en concreto

9.- Salir.

Todos aquellos datos que no facilita el enunciado, debéis decidirlos vosotras/os.

Por ejemplo realizar el prestamo de un artículo a un cliente con su DNI, mostrar articulos para el prestamo disponibles,
mostrar los articulos prestados, mostrar los préstamos de un cliente en concreto.
 */
public class Biblioteca {
    public static void main(String[] args) {
        //Declaration de clase Scanner
        Scanner sc = new Scanner(System.in);
        //Declaracion de arrays
        String[][] matrizClientes = new String[5][3];
        String[][] matrizArticulos = new String[5][3];
        System.out.println("Hola empleado. Bienvenido al software de gestión de " +
                " la biblioteca de la Universidad Europea, estas son las opciones disponibles: \n");
        String opcion;
        do {

            opcion = imprimirMenu(sc);


            switch (opcion) {
                case "1":
                    insertarArticulo(sc, matrizArticulos);
                    break;
                case "2":
                    System.out.println("Metodo para eliminar articulo");
                    break;

                case "3":
                    System.out.println("Metodo para modificar el artículo");
                    break;
                case "4":
                    System.out.println("Metodo para efectuar el alquiler");
                    break;
                case "5":
                    System.out.println("Metodo para devolver el artículo");
                    break;
                case "6":
                    System.out.println("Mostrar articulos para el prestamo disponibles");
                    break;
                case "7":
                    System.out.println("Mostrar los articulos prestados");
                    break;
                case "8":
                    System.out.println("Mostrar los préstamos de un cliente en concreto");
                    break;
                case "9":
                    System.out.println("Programa finalizado correctamente.");
                    break;

                default:
                    System.out.println("Option no valida, por favor inserta un valor numerico entre 1 y 9.");
                    break;
            }


        } while (!opcion.equals("9"));

    }

    /// /////////////////////////////////////////////////////////////////////

    public static void insertarArticulo(Scanner sc, String[][] matrizArticulos) {
        int indiceBusqueda, indiceEspacio = comprobarEspacio(matrizArticulos);
        String idArticulo;

        System.out.println("Ingresa los detalles del articulo que quieres introducir: \n");

        if (indiceEspacio != -1) {
            do {
                System.out.println("Ingresa el id del articulo: ");
                idArticulo = sc.nextLine();
                indiceBusqueda = busquedaIdentificador(matrizArticulos, idArticulo);

                if (indiceBusqueda != -1) {
                    System.out.println("El articulo que estas intentando introducir ya existe en el sistema " +
                            " intentalo de nuevo con otro articulo: ");

                } else {

                    matrizArticulos[indiceEspacio][0] = idArticulo;
                    System.out.println("Ingrese el tipo del articulo: ");
                    matrizArticulos[indiceEspacio][1] = sc.nextLine();
                    System.out.println("Ingrese el nombre del articulo: ");
                    matrizArticulos[indiceEspacio][2] = sc.nextLine();
                    System.out.println();
                    System.out.println("Articulo insertado correctamente. \n");
                    System.out.println("¿Quieres ver la tabla de articulos que lleva registrado el sistema? (S/N): ");
                    String opcion = sc.nextLine().toUpperCase();
                    if (opcion.equals("S")) {
                        imprimirMatriz(matrizArticulos);
                    } else if (opcion.equals("N")) {
                        System.out.println("De acuerdo");
                    } else {
                        System.out.println("Opcion no valida");
                    }

                    return;
                }
            } while (true);

        } else {
            System.out.println("No queda espacio para ingresar mas articulos, elimine un item para dejar espacio: ");
        }

    }

    /// //////////////////////////////////////////////////////////////////////

    public static String imprimirMenu(Scanner sc) {
        String opcion;

        System.out.println("1. Insertar articulo");
        System.out.println("2. Eliminar articulo");
        System.out.println("3. Modificar articulo");
        System.out.println("4. Alquilar articulo");
        System.out.println("5. Devolución del articulo");
        System.out.println("6. Mostrar articulos para prestamo disponibles");
        System.out.println("7. Mostrar los articulos prestados");
        System.out.println("8. Mostrar los préstamos de un cliente en concreto");
        System.out.println("9. Salir");
        opcion = sc.nextLine();

        return opcion;
    }

    public static void imprimirMatriz(String[][] matriz) {
        for (String[] strings : matriz) {
            for (String string : strings) {
                System.out.print(string + " ");
            }

            System.out.println();
        }
    }

    /// ////////////////////////////////////////////////////////////////////

    public static int comprobarEspacio(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == null) {
                return i;
            }
        }
        return -1;
    }

    /// //////////////////////////////////////////////////////////////////

    public static int busquedaIdentificador(String[][] matriz, String identificador) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] != null && matriz[i][0].equals(identificador)) {
                return i;
            }
        }

        return -1;
    }
}
