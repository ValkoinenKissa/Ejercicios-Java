package Ejercicio_2;

import java.util.Scanner;

/*
Crea tu propia excepción para que capture si el usuario introduce mal el
código postal. Recoge el código y comprueba si es correcto o no a través de
dicha excepción. Muestra un mensaje en caso de no ser correcto. (3.5
puntos).
 */
public class Ejecutable {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        //Se instancia la clase validarZip para llamar al metodo de validacion
        ValidarZip vz = new ValidarZip();
        System.out.println("Usuario, introduce tu codigo postal, debe de ser Madrileño");
        //Declaracion de variables zip y control del bucle
        String codigoPostal;
        boolean zipValido = false;
        while (!zipValido){
            try {
                System.out.println("Introduce aqui el CP: ");
                codigoPostal = sc.nextLine();
                vz.validarCodigoPostal(codigoPostal);
                System.out.println("✅ Codigo postal correcto");
                //Si no salta la excepcion, el CP ha quedado validado y se detiene el bucle con la variable de control
                zipValido = true;
            }catch (InvalidZipException e){
                //Si el cp es incorrecto se imprime un mensaje de error y se vuelve a pedir el zip hasta que el mismo sea valido
                System.out.println("❌ El codigo postal que has introducido no es valido: " + e.getMessage());
                System.out.println("Prueba de nuevo");
            }
        }
    }
}
