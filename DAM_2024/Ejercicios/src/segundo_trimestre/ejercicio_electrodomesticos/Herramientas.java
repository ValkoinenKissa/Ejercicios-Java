package segundo_trimestre.ejercicio_electrodomesticos;

import java.util.Scanner;

public class Herramientas {
    static Scanner teclado = new Scanner(System.in);

    public static String introducirDatoTecladoStr() {
        System.out.println("Introduce el color del electrodomestico (blanco, negro, rojo, azul, gris): ");
        return teclado.nextLine();
    }

    public static char introducirDatoTecladoChar() {
        System.out.println("Introduce la letra asociada al consumo energético (letras entre A y F): ");
        return teclado.next().charAt(0);
    }
}
