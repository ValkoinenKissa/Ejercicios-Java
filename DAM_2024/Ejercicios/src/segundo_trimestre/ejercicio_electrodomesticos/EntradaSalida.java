package segundo_trimestre.ejercicio_electrodomesticos;

import java.util.Scanner;

public class EntradaSalida {
    private final Scanner entrada;

    public EntradaSalida() {
        this.entrada = new Scanner(System.in);
    }

    //Metodo para leer un numero entero

    public int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!entrada.hasNextInt()) {
            System.out.println("Error: Ingresa un número entero válido.");
            entrada.next(); // Limpia la entrada incorrecta
            System.out.print(mensaje);
        }
        return entrada.nextInt();
    }

    //Metodo para leer un número decimal
    public double leerDouble(String mensaje) {
        System.out.print(mensaje);
        while (!entrada.hasNextDouble()) {
            System.out.println("Error: Ingresa un número decimal válido.");
            entrada.next();
            System.out.print(mensaje);
        }
        return entrada.nextDouble();
    }

    //Metodo para leer una cadena de texto
    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return entrada.next();
    }

    //Metodo para mostrar mensajes
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    //Metodo para leer booleanos

    public boolean leerBoolean(String mensaje) {
        System.out.print(mensaje);
        while (!entrada.hasNextBoolean()) {
            System.out.println("Error: Ingresa true o false");
            entrada.nextBoolean();
            System.out.print(mensaje);
        }

        return entrada.nextBoolean();
    }
}
