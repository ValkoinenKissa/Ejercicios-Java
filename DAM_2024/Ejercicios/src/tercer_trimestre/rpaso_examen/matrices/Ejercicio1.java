package tercer_trimestre.rpaso_examen.matrices;
/*
Crear e imprimir una matriz
Crea una matriz de 3x3 con números introducidos por el usuario y muéstrala por pantalla.
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int [][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Usuario, introduce un numero para la posicion " + i + " | " + j + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }

    }
}
