package segundo_trimestre.ejercicio_concesionario;

import java.util.Scanner;

public class EntradaSalida {
    private final Scanner entrada;

    public EntradaSalida() {
        this.entrada = new Scanner(System.in);
    }

    public int leerEntero(String mensaje) {
        System.out.println(mensaje);
        while (!entrada.hasNextInt()) {
            System.out.println("El numero que desea ingresar no valido, introduce un numero entero");
            entrada.next(); // Limpia la entrada incorrecta
            System.out.print(mensaje);
        }
        return entrada.nextInt();
    }

    public String leerTexto(String mensaje) {
        System.out.println(mensaje);
        return entrada.nextLine();
    }

    public double leerDouble(String mensaje) {
        System.out.println(mensaje);
        while (!entrada.hasNextDouble()) {
            System.out.println("El numero que desea ingresar no valido, introduce un numero decimal");
            entrada.next(); //Limpia la entrada incorrecta
            System.out.print(mensaje);
        }
        return entrada.nextDouble();
    }


}
