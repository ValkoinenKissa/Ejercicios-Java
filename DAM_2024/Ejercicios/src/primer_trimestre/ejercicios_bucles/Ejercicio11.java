package primer_trimestre.ejercicios_bucles;

import java.util.Scanner;

//11.- Programa que muestre los múltiplos de un número desde 1 hasta N.
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero positivo N, se mostraran los numeros multiplos desde el numero 1" +
                " hasta el numero N que has introducido:");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("El numero no puede ser negativo");
            boolean stop = false;
            while (!stop) {
                System.out.println("Ingrese un numero positivo N, se mostraran los numeros multiplos desde el numero 1" +
                        " hasta el numero N que has introducido:");
                n = sc.nextInt();
                if (n > 0) {
                    stop = true;
                }
            }
        } else {
            System.out.println("Numero almacenado correctamente");
        }

        System.out.println("Los multiplos de  " + n + " desde 1 hasta " + n + " son:");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);

            }

        }

        sc.close();


    }
}
