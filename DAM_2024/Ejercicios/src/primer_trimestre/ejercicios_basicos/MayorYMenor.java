package primer_trimestre.ejercicios_basicos;

import java.util.Arrays;
import java.util.Scanner;

/*
4.- Dado tres números por teclado, que me muestre cuál es el mayor y el menor. Mostrarlos en orden descendiente.
 */
public class MayorYMenor {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tres numeros por teclado: ");

        for (int i = 0; i < numeros.length; i++) {
            int contador = i + 1;
            System.out.println("Introduce el numero: " + contador);
            numeros[i] = sc.nextInt();
        }


        int numMenor = numeros[0];
        int numMayor = numeros[0];

        for (int numero : numeros) {
            if (numMenor > numero) {
                numMenor = numero;
            }
            if (numMayor < numero) {
                numMayor = numero;
            }
        }

        System.out.println("El numero menor es: ");
        System.out.println(numMenor);

        System.out.println("El numero mayor es: ");
        System.out.println(numMayor);

        Arrays.sort(numeros);
        System.out.println("Números en orden descendente:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
