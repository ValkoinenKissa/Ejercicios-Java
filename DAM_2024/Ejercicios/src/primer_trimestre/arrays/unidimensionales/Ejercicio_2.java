package primer_trimestre.arrays.unidimensionales;

import java.util.Scanner;

/*
Programa Java para leer la altura de N personas y calcular la altura media.
Calcular cuántas personas tienen una altura superior a la media y cuántas tienen una altura inferior a la media.
El valor de N se pide por teclado y debe ser entero positivo.
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contadorSuperiorMedia = 0, contadorInferiorMedia = 0;
        double alturaMedia = 0;
        boolean stop = false;

        do {
            System.out.print("Introduce el numero de personas del cual quieres recojer su altura: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("El numero de personas debe ser mayor que 0, intentalo de nuevo");
            } else {
                stop = true;
            }


        } while (!stop);

        int[] alturas = new int[n];

        for (int i = 0; i < alturas.length; i++) {
            System.out.print("Introduce la altura de la persona " + (i + 1) + " (en cms): ");
            alturas[i] = sc.nextInt();
            alturaMedia += alturas[i];
        }

        alturaMedia /= n;

        for (int altura : alturas) {

            if (altura > alturaMedia) {
                contadorSuperiorMedia++;
            } else {
                if (altura < alturaMedia) {
                    contadorInferiorMedia++;
                }
            }

        }

        System.out.printf("La media de altura es: %.2f cm%n", alturaMedia);
        System.out.println();
        System.out.println("El numero de personas con una altura superior a la media es: " + contadorSuperiorMedia);
        System.out.println("El numero de personas con una altura inferior a la media es: " + contadorInferiorMedia);


    }
}
