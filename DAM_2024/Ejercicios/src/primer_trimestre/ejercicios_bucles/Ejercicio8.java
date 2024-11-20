package primer_trimestre.ejercicios_bucles;

import java.util.Scanner;

/*
8.- Programa que muestre los números desde N hasta 1 utilizando las tres
estructuras.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero positivo N, se mostraran los numeros consecutivos desde el numero N" +
                " hasta el numero 1:");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("El numero no puede ser negativo");
            boolean stop = false;
            while (!stop) {
                System.out.println("Ingrese un numero positivo N, se mostraran los numeros consecutivos desde el numero N" +
                        " hasta el numero 1:");
                n = sc.nextInt();
                if (n > 0) {
                    stop = true;
                }
            }
        } else {
            System.out.println("Numero almacenado correctamente");
        }
        int flagWhile = n, flagDoWhile = n, flagFor = n;

        System.out.println("Bucle indeterminado While");
        while (flagWhile >= 1) {
            System.out.println(flagWhile);
            flagWhile--;
        }

        System.out.println("Bucle indeterminado Do While");
        do {
            System.out.println(flagDoWhile);
            flagDoWhile--;
        } while (flagDoWhile >= 1);

        System.out.println("Bucle determinado for");
        for (int i = flagFor; i >= 1; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}
