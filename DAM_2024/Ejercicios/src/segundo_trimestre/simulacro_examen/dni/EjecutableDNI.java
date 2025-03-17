package segundo_trimestre.simulacro_examen.dni;

import java.util.Scanner;

/*
Supongamos que vamos a automatizar la forma de rellenar un formulario. 
Para ello vamos a crear una clase que llame Formulario que tendrá un metodo main. 
Dentro del metodo main se le mostrará al usuario un menú con las siguientes opciones:

1.- Rellenar nombre.

2.- Rellenar apellidos.

3.- Rellenar DNI.

4.- Rellenar e-mail.

5.- Salir.

Mientras que el usuario no elija la opción 5, se le seguirá mostrando el menú de opciones. 

Si el usuario elije la opción 5, SÓLO se le dejará salir del programa en caso de haya rellenado TODOS LOS DATOS, 
en caso contrario se mostrará un mensaje por pantalla indicando que faltan datos por rellenar. 

Se tiene que modularizar. No es necesario usar objetos. (3,5 puntos).
 */
public class EjecutableDNI {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        String nombre = null, apellido = null, email = null, dni = null;
        boolean condicionSalida;
        System.out.println("Hola usuario, estas son las opciones disponibles: ");
        do {
            mostrarMenuOpciones();
            opcion = comprobarOpciones();

            switch (opcion) {
                case 1:
                    nombre = ingresarNombre();
                    break;
                case 2:
                    apellido = ingresarApellidos();
                    break;
                case 3:
                    dni = ingresarDNI();
                    break;
                case 4:
                    email = ingresarEmail();
                    break;
                case 5:
                    condicionSalida = comprobarVariablesEnBlanco(email, nombre, apellido, dni);
                    if (!condicionSalida) {
                        System.out.println("Revisa los siguientes datos: ");
                        datosPorRellenar(email, nombre, apellido, dni);
                    } else {
                        System.out.println("Abandonando el programa.");
                    }
                    break;

            }

            condicionSalida = comprobarVariablesEnBlanco(email, nombre, apellido, dni);

        } while (opcion != 5 || !condicionSalida);


    }


    private static void mostrarMenuOpciones() {
        System.out.println("1.- Rellenar nombre.");
        System.out.println("2.- Rellenar apellidos.");
        System.out.println("3.- Rellenar DNI.");
        System.out.println("4.- Rellenar e-mail.");
        System.out.println("5.- Salir.");
    }


    private static int comprobarOpciones() {
        System.out.print("Introduce la opcion que desees realizar: ");
        int opcion;

        do {
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion < 1 || opcion > 5) {
                System.out.println("Opcion invalida. Prueba de nuevo");
                mostrarMenuOpciones();
            }

        } while (opcion < 1 || opcion > 5);

        return opcion;
    }

    private static String ingresarNombre() {
        System.out.print("Introduce el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Nombre registrado con exito: " + nombre);
        return nombre;
    }

    private static String ingresarApellidos() {
        System.out.print("Introduce el apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Apellido registrado con exito: " + apellido);
        return apellido;
    }

    private static String ingresarDNI() {
        System.out.print("Introduce el DNI: ");
        String dni = sc.nextLine();
        System.out.println("DNI registrado con exito: " + dni);
        return dni;
    }

    private static String ingresarEmail() {
        System.out.print("Introduce el email: ");
        String email = sc.nextLine();
        System.out.println("Email registrado con exito: " + email);
        return email;
    }

    private static boolean comprobarVariablesEnBlanco(String email, String nombre, String apellido, String dni) {
        return email != null && nombre != null && apellido != null && dni != null;
    }

    private static void datosPorRellenar(String email, String nombre, String apellido, String dni) {
        if (email == null) {
            System.out.println("El email no puede estar vacio");
        }
        if (nombre == null) {
            System.out.println("El nombre no puede estar vacio");
        }
        if (apellido == null) {
            System.out.println("El apellido no puede estar vacio");
        }
        if (dni == null) {
            System.out.println("El dni no puede estar vacio");
        }
    }

}
