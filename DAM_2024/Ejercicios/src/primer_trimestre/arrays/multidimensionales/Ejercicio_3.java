package primer_trimestre.arrays.multidimensionales;

import java.util.Random;

/*
Crear dos matrices de n filas x n columnas y sumar sus valores, los resultados se deben almacenar en otra matriz.
 Los valores y el tamaño No, serán insertados por el usuario. Mostrar las matrices originales y el resultado.
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        Random rand = new Random();

        int n = rand.nextInt(10) + 1;

        int  [][] matriz1 = new int[n][n];
        int [][] matriz2 = new int[n][n];
        int [][] matrizResultado = new int[n][n];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = rand.nextInt(10) + 1;
                matriz2[i][j] = rand.nextInt(10) + 1;
            }
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz 1");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println("Matriz 2");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println("Matriz resultado");
        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado[i].length; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }

            System.out.println();
        }

    }
}
