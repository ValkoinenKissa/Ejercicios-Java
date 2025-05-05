package ejercicio2;

import java.util.Scanner;

/*
Crea tu propia excepción para que capture si el usuario introduce mal el
código postal. Recoge el código y comprueba si es correcto o no a través de
dicha excepción. Muestra un mensaje en caso de no ser correcto. (3.5
puntos).
 */
public class Ejecutable {
    public static void main(String[] args) {
        //Try with resources, automaticamente cierra el Scanner
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Usuario, introduce tu codigo postal, el sistema comprobara si es valido");
            int codigoPostal = sc.nextInt();
            comprobarCodigoPostal(codigoPostal);
            System.out.println("El codigo postal es: " + codigoPostal + " y ha sido almacenado con exito");
        } catch (InvalidZipCode e) {
            System.err.println("El codigo postal no es valido: " + e.getMessage());
        }
    }

    public static void comprobarCodigoPostal(int codigoPostal) throws InvalidZipCode {
        String codigoPostalString;
        codigoPostalString = Integer.toString(codigoPostal);
        if (codigoPostalString.length() != 5) {
            throw new InvalidZipCode("El codigo postal no puede tener mas de 5 caracteres o menos de 5 carcateres");
        }
    }
}
