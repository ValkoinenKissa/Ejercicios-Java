package Ejercicio_2;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidarDNI vd = new ValidarDNI();
        //Variable de control de bucle, el dni se solicitara hasta que sea valido gracias al bucle while
        boolean dniValido = false;
        while (!dniValido){
            System.out.println("Usuario, introduce tu DNI con la letra para validarlo: ");
            //Para el metodo que valida el DNI es imprescindible que la nota este en mayuscula, por eso utilizo toUpper
            String dni = sc.nextLine().toUpperCase();
            try {
                vd.ejecutarValidacion(dni);
                System.out.println("¡DNI validado con exito!");
                //Si no salta la excepcion, el dni habra sido validado con exito y la variable de control se establece a true
                dniValido = true;

                /*
                Metemos nuestra excepcion dentro del catch y al lado la variable e para almacenar el objeto
                que crea la clase Exception cuando se lanza una excepcion, este objeto contiene el mensaje que
                le pasamos a la excepcion cuando la creamos y nos es util para mostrar el error con e.getMessage
                y asi el usuario comprendera que es lo que esta sucediendo

                 */
            } catch (InvalidDNIException | IndexOutOfBoundsException e) {
                System.out.println("Error al validar el DNI: " + e.getMessage());

            }

        }
        //Se cierra el escaner
        sc.close();

    }
}
