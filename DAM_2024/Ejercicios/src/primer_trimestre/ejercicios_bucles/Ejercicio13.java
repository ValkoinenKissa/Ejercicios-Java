package primer_trimestre.ejercicios_bucles;

import java.util.Scanner;

//Programa que pase de millas a kilómetros.
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double millas, conversion;
        final double KM_EQUIVALENTE = 1.609;
        boolean stop = false;

        do {
            System.out.println("Ingresa las millas para convertirlas en Kilometros:");
            millas = sc.nextDouble();

            conversion = millas * KM_EQUIVALENTE;

            System.out.println("Las millas introducidas " + millas + " son " + conversion + " kilometros");

            System.out.println("Quieres seguir convirtiendo millas a Km? (¿S o N?)");

            String opcion = sc.next().toUpperCase().trim();

            if (opcion.equals("N")) {
                stop = true;
                System.out.println("Gracias por utilizar el convertidor \uD83D\uDE0A");
            }

        } while (!stop);

        sc.close();

    }
}
