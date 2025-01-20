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
        Cuenta [] listadoCuentas = new Cuenta[2];
        //Declaracion de clase
        Cuenta cuenta;


        do {

            opcion = mostrarMenu(sc);


            switch (opcion) {
                case 1:
                    System.out.println("Abrir cuenta");
                    break;
                case 2:
                    System.out.println("2 - Realizar un ingreso en cuenta");
                    break;
                case 3:
                    System.out.println("3 - Realizar un reintegro");
                    break;
                case 4:
                    System.out.println("4 - Realizar una transferencia bancaria");
                    break;
                case 5:
                    System.out.println("5 - Agregar una nueva cuenta bancaria a la lista de contactos");
                    break;
                case 6:
                    System.out.println("6 - Eliminar una cuenta bancaria exixtente de la lista de contactos");
                    break;
                case 7:
                    System.out.println("Hasta pronto, recuerde que tiene a disposicion " + " la banca online las 24h del dia");
                    break;
            }

        }while (opcion != 7);

    }

    /// ///////////////////////////////////////////////////////////////////////////////////

    public static void abrirCuenta(Scanner sc, Cuenta [] listadoCuentas) {
        String dni;
        double saldo;
        dni = introducirDNI(sc);
        saldo = saldoInicial(sc);

        for (int i = 0; i < listadoCuentas.length; i++ ) {
            Cuenta cuenta = new Cuenta(dni, saldo);
        }

    }

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
            }else {
                System.out.println("Entrada no válida. Por favor, introduce un número válido.");
            }

        } while (!stop);

        return saldo;
    }



    ///  //////////////////////////////////////////////////////////////////////////////////

    public static String introducirDNI(Scanner sc) {
        String dni;
        boolean stop;
        sc.nextLine();
        do {
            System.out.println("Introduzca su DNI (Obligatorio): ");
            dni = sc.nextLine();

            if (dni.isEmpty()) {
                System.out.println("Es campo del DNI esta en blanco, introducelo de nuevo: ");
                stop = false;
            } else {
                System.out.println("DNI resgistrado correctamente " + dni);
                stop = true;
            }

        } while (!stop);

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
        System.out.println("2 - Realizar un ingreso en cuenta");
        System.out.println("3 - Realizar un reintegro");
        System.out.println("4 - Realizar una transferencia bancaria");
        System.out.println("5 - Agregar una nueva cuenta bancaria a la lista de contactos");
        System.out.println("6 - Eliminar una cuenta bancaria exixtente de la lista de contactos");
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
