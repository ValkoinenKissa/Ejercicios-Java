package segundo_trimestre.poo.ejercicio_banco;

import java.util.Scanner;

/*
Crea una clase llamada Cuenta que tendrá los siguientes atributos: DNI del titular y saldo (puede tener decimales).

El DNI será obligatorio y el saldo es opcional. Crea dos constructores que cumpla lo anterior.

Crea sus métodos get, set y toString (éste último lo veremos más adelante.).

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
        double saldoDisponible;
        int opcion;
        String dni;
        //Declaracion de clase
        Cuenta Cuenta;

        opcion = mostrarMenu(sc);

        switch (opcion) {
            case 1:
                System.out.println("1 - Abrir cuenta corriente");
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
                System.out.println("Hasta pronto, recuerde que tiene a disposicion " +
                        " la banca online las 24h del dia");
                break;
        }

    }

    public static int mostrarMenu(Scanner sc) {
        int opcion;
        boolean stop = false;

        do {
            System.out.println("Ingresa el numero de la operacion que quieres efectuar: ");
            opcion = sc.nextInt();
            System.out.println("1 - Abrir cuenta corriente");
            System.out.println("2 - Realizar un ingreso en cuenta");
            System.out.println("3 - Realizar un reintegro");
            System.out.println("4 - Realizar una transferencia bancaria");
            System.out.println("5 - Agregar una nueva cuenta bancaria a la lista de contactos");
            System.out.println("6 - Eliminar una cuenta bancaria exixtente de la lista de contactos");
            System.out.println("7 - Salir");

            if (opcion < 1 || opcion > 7) {
                System.out.println("La opcion que has introducido no es correcta, la opcion debe de estar entre" +
                        " 1 y 7");
                stop = true;
            }

        } while (!stop);

        return opcion;

    }
}
