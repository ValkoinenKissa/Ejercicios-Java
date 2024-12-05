package primer_trimestre.arrays.unidimensionales;

import java.util.Scanner;

/*
 Programa Java que guarda en un array 10 números enteros que se leen por teclado.
 A continuación se recorre el array y calcula cuántos números son positivos,
 cuántos negativos y cuántos ceros.
 */
public class Ejercicio_1 {
    public static void main(String[] args) {

        System.out.println("A continuacion, introduce 10 numeros, para saber cuántos números son positivos,\n" +
                " cuántos negativos y cuántos ceros");
        Scanner sc = new Scanner(System.in);
        int[] matrix = new int[10];

        int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("Introduce el numero: ");
            matrix[i] = sc.nextInt();
        }

        for (int i : matrix) {
            if (i > 0) {
                contadorPositivos++;
            } else if (i < 0) {
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        System.out.println("Los numeros positivos son: " + contadorPositivos);
        System.out.println("Los numeros negativos son: " + contadorNegativos);
        System.out.println("Los numeros ceros son: " + contadorCeros);
    }
}
