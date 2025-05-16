package Ejercicio_2;

import java.util.Scanner;

/*
Crea tu propia excepción para que capture si el usuario introduce mal el
código postal. Recoge el código y comprueba si es correcto o no a través de
dicha excepción. Muestra un mensaje en caso de no ser correcto. (3.5
puntos).
 */
public class Ejecutable {
    public static void main(String[] args) {
        //Variable de control para el bucle
        boolean zipValido = false;
        Scanner sc = new Scanner(System.in);
        while (!zipValido) {

            System.out.println("Bienvenido al programa, a continuación introduce tu codigo postal Madrileño");
            try {
                System.out.println("Introduce el codigo del postal: ");
                String codPostal = sc.nextLine();
                //Se pide el codigo posta y se valida con el metodo validacion
                validacionCodigoPostal(codPostal);
                //Si el metodo no lanza la excepcion, se muestra el codigo postal y la variable de control se pone a true
                System.out.println("✔ Código postal válido: " + codPostal);
                zipValido = true;

                //Si se lanza la excepcion, se recoje aqui y se muestra el error junyo a un mensaje para reintentarlo
            } catch (InvalidZipCodeException e) {
                System.out.println("✖ Error: " + e.getMessage());
                System.out.println("Por favor, inténtalo de nuevo.\n");
            }
        }

        //Cierro el flujo del scanner
        sc.close();

    }


    protected static void validacionCodigoPostal(String codigoPostal) throws InvalidZipCodeException {
        /*
        El if comprueba que el codigo postal no sea nulo y que este en el rango de codigos postales madrileños
        Ademas con matches y la correspondiente expresion regular, verificamos que el codigo postal siempre debe de
        tener 5 digitos, no puede tener ni de mas ni de menos.
         */
        if (codigoPostal == null || !codigoPostal.matches("\\d{5}")) {

            throw new InvalidZipCodeException("El codigo postal debe de tener exactamente 5 digitos");

        }

        if (Integer.parseInt(codigoPostal) < 28001 || Integer.parseInt(codigoPostal) > 28999) {
            throw new InvalidZipCodeException("El codigo postal debe de pertenecer a Madrid");
        }
    }
}
