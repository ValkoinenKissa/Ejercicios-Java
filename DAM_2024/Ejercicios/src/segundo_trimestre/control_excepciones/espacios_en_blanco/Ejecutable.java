package segundo_trimestre.control_excepciones.espacios_en_blanco;

import java.util.Scanner;

/*
Crear un programa que le pida al usuario que ingrese un texto,
pero que valide que el texto no sea vacío ni contenga sólo espacios en blanco. Paso a tener en cuenta:

El programa debe pedir al usuario que ingrese un texto.
La entrada debe ser procesada para asegurarse de que no sea únicamente espacios en blanco.
Si el usuario ingresa solo espacios en blanco o una cadena vacía, el programa debe mostrar un mensaje de error
indicando que no se permiten solo espacios en blanco y debe volver a pedir la entrada.
El programa debe seguir solicitando la entrada del usuario hasta que se ingrese un texto válido
(es decir, un texto que no sea vacío ni contenga solo espacios).
Una vez que el usuario ingrese un texto válido, el programa debe mostrar el texto ingresado.
 */
public class Ejecutable {
    static Scanner es = new Scanner(System.in);

    public static void main(String[] args) {
        String mensaje, mensajeValidado;
        while (true) {


            try {
                System.out.println("Usuario, introduce un texto: ");
                mensaje = es.nextLine();
                mensajeValidado = comprobarEspaciosEnBlanco(mensaje);
                System.out.println("El texto es: " + mensajeValidado);
                break;

            } catch (ViolacionEspaciosEnBlanco e) {
                System.err.println("Error " + e.getMessage());
            }

        }

    }

    public static String comprobarEspaciosEnBlanco(String mensaje) {
        if (mensaje.isBlank()) {
            throw new ViolacionEspaciosEnBlanco("El texto no puede contener espacios en blanco, intentalo de nuevo");
        }

        return mensaje;
    }
}
