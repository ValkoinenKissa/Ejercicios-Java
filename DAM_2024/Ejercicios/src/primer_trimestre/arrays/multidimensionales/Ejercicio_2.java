package primer_trimestre.arrays.multidimensionales;

import java.util.Random;
import java.util.Scanner;

/*
2. Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números aleatorios entre 0 y 10.
 */

public class Ejercicio_2 {
    public static void main(String[] args) {

        System.out.println("Usuario, introduce cuantas columnas deseas que tenga la tabla: ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n;
        n = sc.nextInt();

        int[][] matriz = new int[5][n];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                int numeroAleatorio = rand.nextInt(11);

                matriz[i][j] = numeroAleatorio;
            }

        }


        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }

            System.out.println();
        }


        sc.close();

    }
}
