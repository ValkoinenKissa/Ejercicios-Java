package tercer_trimestre.repaso_examen.matrices;


import java.util.Random;
import java.util.Scanner;

/*
Llena una matriz 4x4 con números aleatorios entre 1 y 100. Pide al usuario un número y di si está presente o no
(y en qué posición).
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Scanner sc = new Scanner(System.in);
        rellenarMatriz(matrix);
        System.out.println("Introduce un numero para comprobar si se encuentra u no en la matiz");
        int numBuscado = sc.nextInt();
        buscarNumeroEnMatriz(matrix, numBuscado);
        printMatrix(matrix);


    }

    private static void rellenarMatriz(int[][] matrix) {
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               int numAleatorio = rand.nextInt(100) + 1;
               matrix[i][j] = numAleatorio;
           }
       }
    }

    private static void buscarNumeroEnMatriz(int[][] matrix, int numBuscado) {
        boolean encontrado = false;
        outer:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == numBuscado) {
                    System.out.println("El numero " + numBuscado + " ha sido localizado en la posicion: "
                            + i + " : " + j);
                    encontrado = true;
                    break outer;
                }
            }
        }

        if (!encontrado) {
            System.out.println("El numero: " + numBuscado + " no ha podido ser localizado");
            System.out.println("Mostrando la matriz");
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }
}
