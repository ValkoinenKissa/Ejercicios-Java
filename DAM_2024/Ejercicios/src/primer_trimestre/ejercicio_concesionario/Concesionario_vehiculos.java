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
                    System.out.println("Gracias por utilizar el programa");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while (!opcion.equals("5"));

        sc.close();

    }

    public static void mostrarVehiculos(String[][] matrizVehiculos) {
        System.out.println("Estos son los vehiculos de la tabla: ");

        for (String[] matrizVehiculo : matrizVehiculos) {
            for (String coches : matrizVehiculo) {
                System.out.print(coches + " ");
            }

            System.out.println();
        }

    }


    /// /////////////////////////////////////////////////////////////////////////////////////////


    public static void modificarVehiculo(String[][] matrizVehiculos, Scanner sc) {
        String matricula;
        boolean matriculaErronea;
        do {

            System.out.println("Ingrese la matricula del vehiculo que quieres modificar: ");
            matriculaErronea = false;
            matricula = sc.nextLine();
            for (String[] matrizVehiculo : matrizVehiculos) {
                if (matrizVehiculo[0] != null && matrizVehiculo[0].equals(matricula)) {
                    matrizVehiculo[0] = matricula;

                    System.out.println("Actualiza la marca: ");
                    matrizVehiculo[1] = sc.nextLine();

                    System.out.println("Actualiza el modelo: ");
                    matrizVehiculo[2] = sc.nextLine();

                    System.out.println("Vehiculo actualizado correctamente");
                    matriculaErronea = true;


                }
            }

            if (!matriculaErronea) {
                System.out.println("La matricula introducida no es correcta, intentalo de nuevo");
            }


        } while (!matriculaErronea);


    }


    /// ///////////////////////////////////////////////////////////////////////////////////////

    public static void eliminarVehiculo(String[][] matrizVehiculos, Scanner sc) {
        String matricula;
        boolean matriculaErronea = false;
        do {
            System.out.print("Ingresa la matricula del vehiculo que quieres eliminar: ");
            matricula = sc.nextLine();
            for (int i = 0; i < matrizVehiculos.length; i++) {
                if (matrizVehiculos[i][0] != null && matrizVehiculos[i][0].equals(matricula)) {
                    matrizVehiculos[i][0] = null;
                    matrizVehiculos[i][1] = null;
                    matrizVehiculos[i][2] = null;
                    matriculaErronea = false;
                    System.out.println("Borrado finalizado");
                    break;

                } else {
                    matriculaErronea = true;
                }
            }

            if (matriculaErronea) {
                System.out.println("La matricula del vehiculo no existe, prueba de nuevo");
            }

        } while (matriculaErronea);
    }

    /// ////////////////////////////////////////////////////////////////////////////////////////////
    public static void ingresarVehiculo(String[][] matrizVehiculos, Scanner sc) {
        boolean espacioDisponible = false;

        for (String[] vehiculo : matrizVehiculos) {
            if (vehiculo[0] == null) {
                espacioDisponible = true;
                break;
            }
        }

        if (!espacioDisponible) {
            System.out.println("No hay mas espacio para ingresar mas vehiculos");
            return;
        }


        boolean matriculaExiste;
        System.out.println("Ingrese la matricula del vehiculo que desee introducir: ");
        String matriculaVehiculo;

        do {

            matriculaExiste = false;
            matriculaVehiculo = sc.nextLine();


            for (String[] matrizVehiculo : matrizVehiculos) {
                if (matrizVehiculo[0] != null && matrizVehiculo[0].equals(matriculaVehiculo)) {
                    matriculaExiste = true;
                    System.out.println("La matricula que has introducido, se encuentra en el sistema, " +
                            "introduce otra matricula");
                    break;
                }
            }


        } while (matriculaExiste);


        System.out.println("Ahora introduce la marca y el modelo del vehiculo " + matriculaVehiculo);

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

    /// /////////////////////////////////////////////////////////////////////////////////////////////////

    public static String menuAplicacion(Scanner sc) {
        String opcion;

        System.out.println("Hola usuario, bienvenido al software de gestión de vehiculos, estas son las opciones" +
                " disponibles: ");

        System.out.println("1. Ingresar vehiculo");
        System.out.println("2. Modificar vehiculo");
        System.out.println("3. Eliminar vehiculo");
        System.out.println("4. Mostrar tabla de vehiculos");
        System.out.println("5. Salir");

        opcion = sc.nextLine().toUpperCase();


        return opcion;

    }


}
