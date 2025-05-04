package tercer_trimestre.repaso_examen.matrices;


import java.util.Scanner;

/*
Suma de dos matrices
Pide al usuario dos matrices de 2x2 y muestra su suma
 */
public class Ejercicio2 {
    public final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] resultado = new int[2][2];
        System.out.println("Matriz nº 1: ");
        getSuma(matrix1);
        getSuma(matrix2);
        sumaMatrices(matrix1, matrix2, resultado);
        imprimirResultados(resultado);

    }

    public static void getSuma(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Ingrese un numero: " + i + " | " + j + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void sumaMatrices(int[][] matrixA, int[][] matrixB, int[][] resultado) {
      for (int i = 0; i < resultado.length; i++) {
          for (int j = 0; j < resultado[i].length; j++) {
              resultado[i][j] = matrixA[i][j] + matrixB[i][j];
          }
      }
    }

    public static void imprimirResultados(int[][] resultado) {
        for (int[] ints : resultado) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }
}
