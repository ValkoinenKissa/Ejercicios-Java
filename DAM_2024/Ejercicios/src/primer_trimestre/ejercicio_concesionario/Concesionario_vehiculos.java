package primer_trimestre.ejercicio_concesionario;

import java.util.Scanner;

/*
La aplicación debe ofrecer un menú al usuario para poder realizar las siguientes tareas:

1.- Insertar vehículo.

2.- Eliminar el vehículo y dejar dicho hueco vacío.

3.- Modificar vehículo.

4.- Salir.

El ejercicio debe de controlar que no se repiten matrículas dentro del array.

Una vez terminado el ejercicio podemos añadir funcionalidades.
Por ejemplo realizar la venta de un  vehículo a un cliente con su DNI, mostrar vehículos para la venta disponibles,
mostrar los vehículos vendidos, mostrar los vehículos de un cliente en concreto.
 */
public class Concesionario_vehiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matrizVehiculos = new String[3][3];
        String[][] matrizClientes = new String[3][3];
        String[][] matrizVentasVehiculos = new String[3][4];
        String opcion;

        do {

            opcion = menuAplicacion(sc);

            switch (opcion) {
                case "1":
                    ingresarVehiculo(matrizVehiculos, sc);
                    break;

                case "2":
                    modificarVehiculo(matrizVehiculos, sc);
                    break;

                case "3":
                    eliminarVehiculo(matrizVehiculos, sc);
                    break;

                case "4":
                    mostrarVehiculos(matrizVehiculos);
                    break;

                case "5":
                    venderVehiculo(matrizVehiculos, matrizClientes, matrizVentasVehiculos, sc);
                    break;

                case "6":
                    mostrarVehiculos(matrizVentasVehiculos);
                    break;

                case "7":
                    mostrarVehiculosCliente(matrizVentasVehiculos, sc);
                    break;

                case "8":
                    System.out.println("Gracias por utilizar el programa");
                    break;


                default:
                    System.out.println("Opcion no valida");
            }

        } while (!opcion.equals("8"));

        sc.close();

    }

    /// //////////////////////////////////////////////////////////////////////////////////

    public static void mostrarVehiculosCliente(String[][] matrizVentasVehiculos, Scanner sc) {
        boolean clienteEncontrado = false;

        System.out.print("Ingresa el DNI del cliente para mostrar todos sus vehículos: ");
        String dniCliente = sc.nextLine();

        System.out.println("Vehículos del cliente con DNI " + dniCliente + ":");
        for (String[] venta : matrizVentasVehiculos) {
            if (venta[0] != null && venta[0].equals(dniCliente)) {
                clienteEncontrado = true;
                System.out.println("Matrícula: " + venta[1] + ", Marca: " + venta[2] + ", Modelo: " + venta[3]);
            }
        }

        if (!clienteEncontrado) {
            System.out.println("El cliente no existe o no tiene vehiculos registrados");
        }


    }


    /// ///////////////////////////////////////////////////////////////////////////////////////


    public static void venderVehiculo(String[][] matrizVehiculos, String[][] matrizClientes, String[][] matrizVentasVehiculos, Scanner sc) {
        boolean matriculaEncontrada = false;

        do {
            System.out.println("Ingrese la matrícula del vehículo que deseas vender: ");
            String matricula = sc.nextLine();

            int indiceVehiculo = buscarVehiculoUCliente(matrizVehiculos, matricula);

            if (indiceVehiculo == -1) {
                System.out.println("El vehículo que quieres vender no existe, prueba de nuevo.");
            } else {
                matriculaEncontrada = true;

                System.out.println("Introduce los datos del cliente al que venderás el vehículo:");
                System.out.println("Introduce el DNI:");
                String dniCliente = sc.nextLine();

                int indiceCliente = comprobarEspacio(matrizClientes);

                if (indiceCliente == -1) {
                    System.out.println("No hay espacio disponible para registrar más clientes.");
                    return;
                }

                matrizClientes[indiceCliente][0] = dniCliente;
                System.out.println("Introduce el nombre del cliente:");
                matrizClientes[indiceCliente][1] = sc.nextLine();
                System.out.println("Introduce los apellidos del cliente:");
                matrizClientes[indiceCliente][2] = sc.nextLine();

                int indiceVenta = comprobarEspacio(matrizVentasVehiculos);

                if (indiceVenta == -1) {
                    System.out.println("No hay espacio disponible para registrar más ventas.");
                    return;
                }

                // Registrar la venta
                matrizVentasVehiculos[indiceVenta][0] = dniCliente; // DNI del cliente
                matrizVentasVehiculos[indiceVenta][1] = matrizVehiculos[indiceVehiculo][0]; // Matrícula
                matrizVentasVehiculos[indiceVenta][2] = matrizVehiculos[indiceVehiculo][1]; // Marca
                matrizVentasVehiculos[indiceVenta][3] = matrizVehiculos[indiceVehiculo][2]; // Modelo

                //Eliminar el vehículo vendido de la matriz de vehículos
                matrizVehiculos[indiceVehiculo][0] = null;
                matrizVehiculos[indiceVehiculo][1] = null;
                matrizVehiculos[indiceVehiculo][2] = null;

                // Confirmar la venta
                System.out.println("El vehículo con matrícula " + matricula + " se ha vendido al cliente con DNI " + dniCliente + ".");
            }

        } while (!matriculaEncontrada);
    }

    /// ////////////////////////////////////////////////////////////////////////////////

    public static int comprobarEspacio(String[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == null) {
                return i;
            }
        }
        return -1;
    }

    /// /////////////////////////////////////////////////////////////////////////////////////

    public static int buscarVehiculoUCliente(String[][] matrizVehiculos, String matricula) {
        for (int i = 0; i < matrizVehiculos.length; i++) {
            if (matrizVehiculos[i][0] != null && matrizVehiculos[i][0].equals(matricula)) {
                return i; // Devuelve el índice si encuentra la matrícula.
            }
        }
        return -1; // Devuelve -1 si no existe.
    }

    /// ////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void mostrarVehiculos(String[][] matrizVehiculos) {
        System.out.println("Estos son los vehiculos que has solicitado: ");

        for (String[] matrizVehiculo : matrizVehiculos) {
            for (String coches : matrizVehiculo) {
                System.out.print(coches + " ");
            }

            System.out.println();
        }

    }


    /// /////////////////////////////////////////////////////////////////////////////////////////


    public static void modificarVehiculo(String[][] matrizVehiculos, Scanner sc) {
        boolean matriculaErronea;

        do {
            System.out.println("Ingresa la matricula del vehiculo que quieres modificar: ");
            String matricula = sc.nextLine();

            int indice = buscarVehiculoUCliente(matrizVehiculos, matricula);

            if (indice != -1) {
                System.out.println("Vehiculo encontrado. Ingrese la nueva marca");
                matrizVehiculos[indice][1] = sc.nextLine();

                System.out.println("Ingresa el nuevo modelo:");
                matrizVehiculos[indice][2] = sc.nextLine();

                System.out.println("Vehiculo modificado exitosamente");
                matriculaErronea = false;
            } else {
                System.out.println("La matricula ingresada no existe, intentalo de nuevo");
                matriculaErronea = true;
            }

        } while (matriculaErronea);


    }


    /// //////////////////////////////////////////////////////////////////////////////////////

    public static void eliminarVehiculo(String[][] matrizVehiculos, Scanner sc) {
        String matricula;
        boolean matriculaErronea;
        do {
            System.out.print("Ingresa la matricula del vehiculo que quieres eliminar: ");
            matricula = sc.nextLine();
            int indice = buscarVehiculoUCliente(matrizVehiculos, matricula);
            if (indice != -1) {
                matrizVehiculos[indice][0] = null;
                matrizVehiculos[indice][1] = null;
                matrizVehiculos[indice][2] = null;
                System.out.println("Borrado finalizado");
                matriculaErronea = true;

            } else {
                System.out.println("La matricula del vehiculo no existe, prueba de nuevo");
                matriculaErronea = false;
            }
        } while (!matriculaErronea);
    }

    /// ///////////////////////////////////////////////////////////////////////////////////////////
    public static void ingresarVehiculo(String[][] matrizVehiculos, Scanner sc) {
        int espacio = comprobarEspacio(matrizVehiculos);

        if (espacio != -1) {
            System.out.println("Ingrese la matricula del vehiculo que quieres introducir: ");

            while (true) {

                String matriculaVehiculo = sc.nextLine();

                int indice = buscarVehiculoUCliente(matrizVehiculos, matriculaVehiculo);
                if (indice != -1) {

                    System.out.println("La matricula que has introducido, se encuentra registrada, prueba de nuevo");

                } else {

                    for (int i = 0; i < matrizVehiculos.length; i++) {
                        if (matrizVehiculos[i][0] == null) {
                            matrizVehiculos[i][0] = matriculaVehiculo;

                            System.out.println("Introduce la marca: ");
                            matrizVehiculos[i][1] = sc.nextLine();

                            System.out.println("Introduce el modelo: ");
                            matrizVehiculos[i][2] = sc.nextLine();

                            System.out.println("Vehiculo registrado correctamente");
                            return;
                        }
                    }

                }

            }

        } else {
            System.out.println("No queda espacio para ingresar mas vehiculos, elimina alguno");
        }


    }

    /// ///////////////////////////////////////////////////////////////////////////////////////////////

    public static String menuAplicacion(Scanner sc) {
        String opcion;

        System.out.println("Hola usuario, bienvenido al software de gestión de vehiculos, estas son las opciones" +
                " disponibles: ");

        System.out.println("1. Ingresar vehiculo");
        System.out.println("2. Modificar vehiculo");
        System.out.println("3. Eliminar vehiculo");
        System.out.println("4. Mostrar vehiculos disponibles");
        System.out.println("5. Vender vehiculo");
        System.out.println("6. Mostrar vehiculos vendidos");
        System.out.println("7. Mostar los vehiculos de un cliente");
        System.out.println("8. Salir");

        opcion = sc.nextLine();


        return opcion;

    }


}
