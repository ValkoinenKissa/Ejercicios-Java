package primer_trimestre.ejercicios_bucles;

import java.util.Scanner;

/*
7.- Programa que muestre los números del 1 hasta N utilizando las tres
estructuras.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero N, se mostraran los numeros consecutivos desde el numero 1" +
                " hasta el N introducido:");
        int n = sc.nextInt();
        int flagWhile = 1, flagDoWhile = 1, flagFor = 1;

        System.out.println("Bucle indeterminado While");
        while (flagWhile <= n) {
            System.out.println(flagWhile);
            flagWhile++;
        }

        System.out.println("Bucle indeterminado Do While");
        do {
            System.out.println(flagDoWhile);
            flagDoWhile++;
        } while (flagDoWhile <= n);

        System.out.println("Bucle determinado for");
        for (int i = flagFor; i <= n; i++) {
            System.out.println(i);
        }

        sc.close();

    }
}
