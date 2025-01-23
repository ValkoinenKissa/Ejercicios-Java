package segundo_trimestre.poo.ejercicio_banco;

import java.util.Scanner;

/*
Crea una clase llamada Cuenta que tendrá los siguientes atributos: DNI del titular y saldo (puede tener decimales).

El DNI será obligatorio y el saldo es opcional. Crea dos constructores que cumpla lo anterior.

Crea sus métodos get, set y toString (este último lo veremos más adelante.).

Tendrá dos métodos especiales:

ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa,
no se hará nada.
retirar(double cantidad): se retira una cantidad a la cuenta,
si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
Tarea extra:

Como tenemos dos cuentas, comprobar primero el titular para poder ingresar, retirar o ver saldo.
Añadir la opción de transferencia bancaria.
Añadir la opción de ingresar o eliminar cuentas bancarias.
 */
public class Ejecutable {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int opcion;
        Cuenta[] listadoCuentas = new Cuenta[5];


        do {

            opcion = mostrarMenu(sc);


            switch (opcion) {
                case 1:
                    abrirCuenta(sc, listadoCuentas);
                    break;
                case 2:
                    eliminarCuenta(sc, listadoCuentas);
                    break;
                case 3:
                    mostarCuentas(listadoCuentas);
                    break;
                case 4:
                    ingreso(sc, listadoCuentas);
                    break;
                case 5:
                    reintegro(sc, listadoCuentas);
                    break;
                case 6:
                    transferencia(sc, listadoCuentas);
                    break;
                case 7:
                    System.out.println("¡Hasta pronto! Gracias por utilizar el sistema");
                    break;
            }

        } while (opcion != 7);

    }

    /// ///////////////////////////////////////////////////////////////////////

    public static int comprobarEspacio(Cuenta[] listadoCuentas) {
        for (int i = 0; i < listadoCuentas.length; i++) {
            if (listadoCuentas[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /// ///////////////////////////////////////////////////////////////////////
    public static int comprobarDniCliente(Cuenta[] listadoCuentas, String dniCliente) {
        for (int i = 0; i < listadoCuentas.length; i++) {
            if (listadoCuentas[i] != null && dniCliente.equals(listadoCuentas[i].getDni())) {
                return i; //El dni existe, devuelve su indice en el array
            }
        }
        return -1; //El dni no existe en ninguna de las cuentas actuales
    }

    /// ///////////////////////////////////////////////////////////////////////

    public static String errorBusquedaDni(Scanner sc, Cuenta[] listadoCuentas, String dniCliente) {
        String decisionContinuar;
        String dniCorregido = "";
        int dniEncontrado = comprobarDniCliente(listadoCuentas, dniCliente);
        do {
            System.out.println("El dni que has introducido esta asociado a un cliente ¿Quieres introducir otro DNI?" +
                    " (Introduce 'S' para si y 'N' para No)");
            decisionContinuar = sc.next().toUpperCase().trim();
            if (decisionContinuar.equals("N")) {
                System.out.println("Volviendo al menu principal");
                break;
            } else if (decisionContinuar.equals("S")) {
                dniCorregido = introducirDNI(sc);
                dniEncontrado = comprobarDniCliente(listadoCuentas, dniCorregido);
            } else {
                System.out.println("La opcion introducida es incorrecta (Introduce S o N)");
            }
        } while (dniEncontrado != -1);

        return dniCorregido;
    }

    /// ////////////////////////////////////////////////////////////////////////////////////

    public static void mostarCuentas(Cuenta[] listadoCuentas) {
        if (listadoCuentas == null) {
            System.out.println("El listado de cuentas es null.");
            return;
        }

        for (Cuenta listadoCuenta : listadoCuentas) {
            if (listadoCuenta == null) {
                System.out.println("Cuenta no inicializada (null).");
            } else {
                System.out.println(listadoCuenta);
            }
        }
    }

    /// ///////////////////////////////////////////////////////////////////////////////////

    public static void abrirCuenta(Scanner sc, Cuenta[] listadoCuentas) {
        String dni;
        int indice;
        int dniEncontrado;
        indice = comprobarEspacio(listadoCuentas);
        if (indice != -1) {
            dni = introducirDNI(sc);
            dniEncontrado = comprobarDniCliente(listadoCuentas, dni);
            while (dniEncontrado != -1) {
                dni = errorBusquedaDni(sc, listadoCuentas, dni);
                dniEncontrado = comprobarDniCliente(listadoCuentas, dni);
            }

            if (!dni.isBlank()) {
                instanciarCuenta(sc, listadoCuentas, indice, dni);
            } else {
                System.out.println("No se ha podido crear la cuenta");
            }

        } else {
            System.out.println("No hay suficiente espacio en el sistema para procesar una nueva cuenta");
        }

    }

    /// //////////////////////////////////////////////////////////////////////////

    public static void eliminarCuenta(Scanner sc, Cuenta[] listadoCuentas) {
        int dniEncontrado = getDniEncontrado(sc, listadoCuentas);

        listadoCuentas[dniEncontrado] = null;
        System.out.println("La cuenta ha sido eliminada correctamente");

    }

    /// ///////////////////////////////////////////////////////////////////////////

    private static int getDniEncontrado(Scanner sc, Cuenta[] listadoCuentas) {
        String dniCliente;
        int dniEncontrado;
        dniCliente = introducirDNI(sc);
        dniEncontrado = comprobarDniCliente(listadoCuentas, dniCliente);
        while (dniEncontrado == -1) {
            dniCliente = errorBusquedaDni(sc, listadoCuentas, dniCliente);
            dniEncontrado = comprobarDniCliente(listadoCuentas, dniCliente);
        }
        return dniEncontrado;
    }

    /// //////////////////////////////////////////////////////////////////////////

    public static void ingreso(Scanner sc, Cuenta[] listadoCuentas) {
        double saldoIngreso;
        int dniEncontrado = getDniEncontrado(sc, listadoCuentas);
        System.out.println("Introduce el saldo que deseeas ingresar: ");
        saldoIngreso = sc.nextDouble();
        listadoCuentas[dniEncontrado].ingresar(saldoIngreso);
    }


    /// //////////////////////////////////////////////////////////////////////////

    public static void reintegro(Scanner sc, Cuenta[] listadoCuentas) {
        double saldoReintegro;
        int dniEncontrado = getDniEncontrado(sc, listadoCuentas);
        System.out.println("Introduce el saldo que deseeas retirar: ");
        saldoReintegro = sc.nextDouble();
        listadoCuentas[dniEncontrado].retirar(saldoReintegro);
    }

    /// //////////////////////////////////////////////////////////////////////////

    public static void instanciarCuenta(Scanner sc, Cuenta[] listadoCuentas, int indice, String dniCliente) {
        double saldo = saldoInicial(sc);
        if (saldo < 0){
            listadoCuentas[indice] = new Cuenta(dniCliente);
        }else {
            listadoCuentas[indice] = new Cuenta(dniCliente, saldo);
        }
        System.out.println("Cuenta creada correctamente, mostrando detalles a continuación: ");
        System.out.println(listadoCuentas[indice].toString());
    }

    /// ////////////////////////////////////////////////////////////////////////

    public static void transferencia(Scanner sc, Cuenta[] listadoCuentas) {
        int cuentaOrigen = obtenerCuenta(sc,listadoCuentas, "emitir la transferencia");
        double cantidadATrasnferir = obtenerCantidad(sc);
        int cuentaDestino = obtenerCuenta(sc,listadoCuentas, "recibir la transferencia");

        if (validarTransferencia(listadoCuentas[cuentaOrigen], cantidadATrasnferir)){
            procesarTransferencia(listadoCuentas[cuentaOrigen], listadoCuentas[cuentaDestino], cantidadATrasnferir);
            System.out.println("Transferencia enviada con exito, nuevo saldo de la cuenta destino: ");
            System.out.println(listadoCuentas[cuentaDestino].toString());
        }else {
            System.out.println("No se ha podido realizar la transferencia, compruebe los datos");
        }
    }

    public static int obtenerCuenta(Scanner sc, Cuenta[] listadoCuentas, String mensaje) {
        System.out.println("Introduce el DNI del titular de la cuenta para " + mensaje);
        return getDniEncontrado(sc, listadoCuentas);
    }

    public static double obtenerCantidad(Scanner sc) {
        System.out.println("Introduce la cantidad que quieres transferir: ");
        return sc.nextDouble();
    }

    public static boolean validarTransferencia(Cuenta cuentaOrigen, double cantidad) {
        return cuentaOrigen.getSaldoDisponible() >= cantidad && cantidad > 0;
    }

    public static void procesarTransferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, double cantidad) {
        cuentaOrigen.retirar(cantidad);
        cuentaDestino.ingresar(cantidad);
    }


    /// /////////////////////////////////////////////////////////////////////////

    public static double saldoInicial(Scanner sc) {
        double saldo = 0;
        boolean stop = true;
        do {

            System.out.println("Introduzca el saldo inicial que tendra la cuenta, si quieres abir la cuenta con " +
                    " 0 euros, introduce un 0 ");
            if (sc.hasNextDouble()) {
                saldo = sc.nextDouble();

                if (saldo < 0) {
                    System.out.println("El saldo no puede ser negativo, introduce un saldo positivo: ");
                    stop = false;
                } else {
                    System.out.println("Saldo registrado correctamente: " + saldo);
                    stop = true;
                }
            } else {
                System.out.println("Entrada no válida. Por favor, introduce un número válido.");
            }

        } while (!stop);

        return saldo;
    }


    ///  //////////////////////////////////////////////////////////////////////////////////

    public static String introducirDNI(Scanner sc) {
        String dni;
        sc.nextLine();
        do {
            System.out.println("Introduzca su DNI (Obligatorio): ");
            dni = sc.nextLine();

            if (dni.isEmpty()) {
                System.out.println("Es campo del DNI esta en blanco, introducelo de nuevo: ");
            } else {
                System.out.println("El DNI es valido " + dni);
                break;
            }

        } while (true);

        return dni;
    }

    /// //////////////////////////////////////////////////////////

    public static int mostrarMenu(Scanner sc) {
        int opcion;
        mostarOpciones();
        opcion = solicitarOpcion(sc);
        return opcion;
    }

    /// /////////////////////////////////////////////////////////

    public static void mostarOpciones() {
        System.out.println("1 - Abrir cuenta corriente");
        System.out.println("2 - Eliminar una cuenta corriente");
        System.out.println("3 - Mostar todas las cuentas bancarias del sistema");
        System.out.println("4 - Realizar un ingreso en cuenta");
        System.out.println("5 - Realizar un reintegro");
        System.out.println("6 - Realizar una transferencia");
        System.out.println("7 - Salir");
    }

    /// /////////////////////////////////////////////////////////

    public static int solicitarOpcion(Scanner sc) {
        int opcion;
        do {

            System.out.println("Ingresa el numero de la operacion que quieres efectuar: ");
            opcion = sc.nextInt();
            if (opcion < 1 || opcion > 7) {
                System.out.println("La opcion no es coreecta. Debe estar entre 1 y 7, intentalo de nuevo.");
            }

        } while (opcion < 1 || opcion > 7);

        return opcion;
    }
}
