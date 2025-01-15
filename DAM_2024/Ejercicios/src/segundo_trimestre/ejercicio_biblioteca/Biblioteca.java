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
        String[][] matrizBiblioteca = new String[5][3];
        System.out.println("Hola empleado. Bienvenido al software de gestión de " + " la biblioteca de la Universidad Europea, estas son las opciones disponibles: \n");
        String opcion;
        do {

            opcion = imprimirMenu(sc);


            switch (opcion) {
                case "1":
                    insertarArticulo(sc, matrizArticulos);
                    break;
                case "2":
                    eliminarDatos(sc, matrizArticulos);
                    break;

                case "3":
                    modificarDatosArticulos(sc, matrizArticulos);
                    break;
                case "4":
                    efectuarAlquiler(sc, matrizClientes, matrizArticulos, matrizBiblioteca);
                    break;
                case "5":
                    devolverArticulo(sc, matrizArticulos, matrizClientes, matrizBiblioteca);
                    break;
                case "6":
                    imprimirMatriz(matrizArticulos);
                    break;
                case "7":
                    imprimirMatriz(matrizBiblioteca);
                    break;
                case "8":
                    mostarArticulosClientes(sc, matrizClientes, matrizBiblioteca);
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
                    System.out.println("El articulo que estas intentando introducir ya existe en el sistema " + " intentalo de nuevo con otro articulo: ");

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

    public static void insertarCliente(Scanner sc, String[][] matrizClientes, String idArticulo) {
        String idCliente;
        int indiceCliente, indiceEspacio = comprobarEspacio(matrizClientes);

        if (indiceEspacio != -1) {
            do {
                System.out.println("Ingresa el DNI del cliente: ");
                idCliente = sc.nextLine();
                indiceCliente = busquedaIdentificador(matrizClientes, idCliente);
                if (indiceCliente == -1) {
                    matrizClientes[indiceEspacio][0] = idCliente;
                    System.out.println("Ingrese el nombre del cliente: ");
                    matrizClientes[indiceEspacio][1] = sc.nextLine();
                    matrizClientes[indiceEspacio][2] = idArticulo;
                    return;

                } else {
                    System.out.println("El DNI del cliente ya existe en el sistema, prueba de nuevo");
                }

            } while (true);
        } else {
            System.out.println("No queda suficiente espacio para añadir mas clientes, por favor " + " efectua una devolucion: ");
        }
    }

    /// /////////////////////////////////////////////////////////////////////

    public static void eliminarDatos(Scanner sc, String[][] matriz) {
        int indiceBusqueda;
        String identificador;

        do {
            System.out.println("Ingresa el identificador del atriculo que desees eliminar: ");
            identificador = sc.nextLine();

            indiceBusqueda = busquedaIdentificador(matriz, identificador);

            if (indiceBusqueda == -1) {
                System.out.println("El identificador no corresponde a ningun registrados o" + " es erroneo, por favor, introducelo de nuevo");
            } else {
                System.out.println("¿Estas seguro que quieres eliminar este articulo? (S/N): ");
                System.out.println(matriz[indiceBusqueda][0]);
                System.out.println(matriz[indiceBusqueda][1]);
                System.out.println(matriz[indiceBusqueda][2]);
                String opcion = sc.nextLine().toUpperCase();
                if (opcion.equals("S")) {
                    matriz[indiceBusqueda][0] = null;
                    matriz[indiceBusqueda][1] = null;
                    matriz[indiceBusqueda][2] = null;

                } else if (opcion.equals("N")) {
                    System.out.println("De acuerdo, el articulo no sera eliminado del sistema");
                } else {
                    System.out.println("Opcion no valida, por favor, introducelo de nuevo");
                }

                return;

            }

        } while (true);

    }

    /// //////////////////////////////////////////////////////////////////////

    public static void modificarDatosArticulos(Scanner sc, String[][] matriz) {
        int indiceBusqueda;
        String identificador;

        do {
            System.out.println("Ingresa el identificador del atriculo que desees modificar: ");
            identificador = sc.nextLine();
            indiceBusqueda = busquedaIdentificador(matriz, identificador);

            if (indiceBusqueda == -1) {
                System.out.println("El identificador no corresponde a ningun articulo" + " o es erroneo, por favor, introducelo de nuevo");
            } else {

                System.out.println("Ingrese el tipo del articulo: ");
                matriz[indiceBusqueda][1] = sc.nextLine();
                System.out.println("Ingrese el nombre del articulo: ");
                matriz[indiceBusqueda][2] = sc.nextLine();
                System.out.println();
                System.out.println("Articulo actualizado correctamente. \n");
                System.out.println("Mostrando datos actualizados en el sistema...");
                imprimirMatriz(matriz);
                return;

            }


        } while (true);
    }

    /// //////////////////////////////////////////////////////////////////////

    public static void efectuarAlquiler(Scanner sc, String[][] matrizClientes, String[][] matrizArticulos, String[][] matrizBiblioteca) {
        String identificadorArticulo;
        int indiceArticulo, indiceBiblioteca;

        do {
            System.out.println("Introduce el identificador del articulo que deseeas alquilar");
            identificadorArticulo = sc.nextLine();
            indiceArticulo = busquedaIdentificador(matrizArticulos, identificadorArticulo);

            if (indiceArticulo == -1) {
                System.out.println("El identificador no corresponde a ningun articulo" + " o es erroneo, por favor, introducelo de nuevo");
            } else {
                System.out.println("Se va a alquilar el siguiente articulo: ");
                System.out.println(matrizArticulos[indiceArticulo][0]);
                System.out.println(matrizArticulos[indiceArticulo][1]);
                System.out.println(matrizArticulos[indiceArticulo][2]);
                System.out.println("Introduce los datos del cliente al que se le va a prestar el articulo: ");
                insertarCliente(sc, matrizClientes, identificadorArticulo);
                indiceBiblioteca = comprobarEspacio(matrizBiblioteca);
                if (indiceBiblioteca == -1) {
                    System.out.println("No se puede realizar el alquiler");
                } else {
                    asociarDatos(matrizArticulos, matrizBiblioteca, indiceArticulo, indiceBiblioteca);

                    System.out.println("¡Alquiler realizado con exito!");

                }
                return;
            }

        } while (true);

    }

    /// ////////////////////////////////////////////////////////////////////////

    public static void asociarDatos(String[][] matrizArticulos, String[][] matrizBiblioteca, int indiceArticulo, int indiceBiblioteca) {
        matrizBiblioteca[indiceBiblioteca][0] = matrizArticulos[indiceArticulo][0];
        matrizBiblioteca[indiceBiblioteca][1] = matrizArticulos[indiceArticulo][1];
        matrizBiblioteca[indiceBiblioteca][2] = matrizArticulos[indiceArticulo][2];
        matrizArticulos[indiceArticulo][0] = null;
        matrizArticulos[indiceArticulo][1] = null;
        matrizArticulos[indiceArticulo][2] = null;
    }

    /// ////////////////////////////////////////////////////////////////////

    public static void devolverArticulo(Scanner sc, String[][] matrizArticulos, String[][] matrizClientes, String[][] matrizBiblioteca) {
        String identificadorArticulo, decision;
        int indiceArticulo, indiceCliente, indiceBiblioteca;

        do {
            System.out.println("Introduce el identificador del articulo que deseeas devolver");
            identificadorArticulo = sc.nextLine();
            indiceCliente = busquedaIdentificadorDevolucion(matrizClientes, identificadorArticulo);
            if (indiceCliente == -1) {
                System.out.println("El identificador no corresponde a ningun articulo" + " o es erroneo, por favor, introducelo de nuevo");
            } else {
                indiceBiblioteca = busquedaIdentificador(matrizBiblioteca, identificadorArticulo);
                System.out.println("Se va a devolver el articulo: ");
                System.out.println(matrizBiblioteca[indiceBiblioteca][0]);
                System.out.println(matrizBiblioteca[indiceBiblioteca][1]);
                System.out.println(matrizBiblioteca[indiceBiblioteca][2]);

                System.out.println("El articulo esta asociado al cliente:");
                System.out.println(matrizClientes[indiceCliente][0]);
                System.out.println(matrizClientes[indiceCliente][1]);

                System.out.println("Quieres continuar con la devolucion? (S/N)");
                decision = sc.nextLine().toUpperCase();
                if (decision.equals("S")) {
                    indiceArticulo = comprobarEspacio(matrizArticulos);
                    asociarDatos(matrizBiblioteca, matrizArticulos, indiceBiblioteca, indiceArticulo);

                    matrizClientes[indiceCliente][0] = null;
                    matrizBiblioteca[indiceCliente][1] = null;
                    matrizArticulos[indiceCliente][2] = null;

                    System.out.println("El articulo ha sido devuelto correctamente");
                } else if (decision.equals("N")) {
                    System.out.println("De acuerdo, no se efectuara la devolucion");

                } else {
                    System.out.println("Opcion no valida, introducela de nuevo");
                }

                return;


            }


        } while (true);
    }

    /// ///////////////////////////////////////////////////////////////////

    public static void mostarArticulosClientes(Scanner sc, String[][] matrizClientes, String[][] matrizBiblioteca) {
        String identificadorArticulo, identificadorCliente, decision;
        int indiceArticulo, indiceCliente;

        do {
            System.out.println("Introduce el DNI del usuario para mostar todos sus prestamos");
            identificadorCliente = sc.nextLine();
            indiceCliente = busquedaIdentificador(matrizClientes, identificadorCliente);
            if (indiceCliente == -1) {
                System.out.println("El cliente no existe, has introducido mal su identificador o no tiene prestamos" + " a su nombre");
                System.out.println("Quieres intentar introducir el DNI de nuevo? (S/N)");
                decision = sc.nextLine().toUpperCase();
                if (decision.equals("N")) {
                    break;
                } else if (decision.equals("S")) {
                    System.out.println("Saliendo al menu principal");
                } else {
                    System.out.println("Opcion no valida, introducela de nuevo");
                }
            } else {

                identificadorArticulo = matrizClientes[indiceCliente][2];
                indiceArticulo = busquedaIdentificador(matrizBiblioteca, identificadorArticulo);

                if (indiceArticulo != -1) {
                    System.out.println("Los articulos alquilados por el cliente con DNI: " + matrizClientes[indiceCliente][0] + " y nombre " + matrizClientes[indiceCliente][1] + " son: ");


                    System.out.println(matrizBiblioteca[indiceArticulo][1]);
                    System.out.println(matrizBiblioteca[indiceArticulo][2]);
                } else {
                    System.out.println("El cliente seleccionado, no tiene articulos prestados en este momento");
                }

                return;
            }
        } while (true);

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

    public static int busquedaIdentificadorDevolucion(String[][] matriz, String identificador) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][2] != null && matriz[i][2].equals(identificador)) {
                return i;
            }
        }

        return -1;
    }
}
