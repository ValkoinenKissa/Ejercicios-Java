package tercer_trimestre.repaso_examen.simulacro_2.ejercicio1;

import java.util.Scanner;

/*
Supongamos que vamos a automatizar la forma de rellenar un formulario. Para ello vamos a crear
una clase que llame Formulario que tendrá un metodo main.
Dentro del metodo main se le mostrará al usuario un menú con las siguientes opciones:

1.- Rellenar nombre.

2.- Rellenar apellidos.

3.- Rellenar DNI.

4.- Rellenar e-mail.

5.- Salir.

Mientras que el usuario no elija la opción 5, se le seguirá mostrando el menú de opciones.

Si el usuario elije la opción 5,
SÓLO se le dejará salir del programa en caso de haya rellenado
TODOS LOS DATOS, en caso contrario se mostrará un mensaje por pantalla indicando que faltan datos por rellenar.

Se tiene que modularizar. No es necesario usar objetos. (3,5 puntos).
 */
public class Formulario {
    public final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        System.out.println("Usuario bienvenido al validador");
        String nombre = "", apellidos = "", dni = "", correo = "";
        boolean valido = false;
        do {
            mostrarMenu();
            System.out.print("Elige una opción : ");
            opcion = sc.nextInt();
            //limpiar escaner
            sc.nextLine();
            switch (opcion) {
                case 1:
                    nombre = pedirNombre();
                    System.out.println("Se ha registrado el dato correctamente");
                    break;
                case 2:
                    apellidos = pedirApellidos();
                    System.out.println("Se ha registrado el dato correctamente");
                    break;
                case 3:
                    dni = pedirDni();
                    System.out.println("Se ha registrado el dato correctamente");
                    break;
                case 4:
                    correo = pedirEmail();
                    System.out.println("Se ha registrado el dato correctamente");
                    break;
                case 5:
                    if (nombre.isEmpty() || apellidos.isEmpty() || dni.isEmpty() || correo.isEmpty()) {
                        System.out.println("No se puede abandonar la aplicación, hay espacios en blanco: ");
                        mostarCambosEnBlanco(nombre, apellidos, dni, correo);
                        System.out.println();

                    } else {
                        System.out.println("Hasta pronto!!");
                        valido = true;
                    }
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (!valido);
    }

    protected static String pedirNombre() {
        System.out.println("Ingrese el nombre: ");
        return sc.nextLine();
    }


    protected static String pedirApellidos() {
        System.out.println("Ingrese los apellidos: ");
        return sc.nextLine();
    }


    protected static String pedirDni() {
        System.out.println("Ingrese el DNI: ");
        return sc.nextLine();
    }

    protected static String pedirEmail() {
        System.out.println("Ingrese el email: ");
        return sc.nextLine();
    }

    protected static void mostarCambosEnBlanco(String nombre, String apellidos, String dni, String correo) {

        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacio o solo contener espacios en blanco");
        }

        if (apellidos.isEmpty()) {
            System.out.println("Los apellidos no pueden estar vacios o solo contener espacios en blanco");
        }

        if (dni.isEmpty()) {
            System.out.println("El dni no puede estar vacio o contener solo espacios en blanco");
        }

        if (correo.isEmpty()) {
            System.out.println("El correo no puede contener solo espacios en blanco o estar vacio");
        }

    }

    protected static void mostrarMenu() {
        System.out.println("1. Ingresar el nombre");
        System.out.println("2. Ingresar la apellidos");
        System.out.println("3. Ingresar el dni del usuario");
        System.out.println("4. Ingresar el correo");
        System.out.println("5. Salir");
    }


}
