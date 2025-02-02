package primer_trimestre.arrays.multidimensionales;

public class Ejercicio_4 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("=== CONTENIDO DE LA MATRIZ ===");
        System.out.print("\t  "); // el espacio antes de los nombres de las columnas

        for (int columna = 0; columna < matriz[0].length; columna++) {

            System.out.printf(" C%1d ", columna); // títulos de las columnas
        }
        System.out.println(); // salto de línea, vamos a empezar con las filas

        for (int fila = 0; fila < matriz.length; fila++) {

            System.out.printf("\tF%1d ", fila); // muestra el título de la fila

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                System.out.printf("[%02d]", matriz[fila][columna]); // muestra el contenido

            }
            System.out.println(); // salto de línea entre fila y fila

        }


    }
}
