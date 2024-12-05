package primer_trimestre.arrays.multidimensionales;
/*
Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla en forma de matriz.
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        int contador =1;
        int [][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = contador;
                contador++;

                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }
}
