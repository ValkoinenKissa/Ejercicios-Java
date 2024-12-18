package primer_trimestre.ejercicios_basicos;

/*
Dado nos números por teclado, que me muestre cuál es el mayor, menor y si son iguales.
 */

import java.util.Scanner;

public class ComparacionNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduce dos numeros por teclado para comprobar cual es el mayor el menor o " +
                " si son iguales");

        System.out.println("Introduce el numero 1");
        num1 = sc.nextInt();
        System.out.println("Introduce el numero 2");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
            System.out.println("El menor es: " + num2);
        } else if (num1 < num2) {
            System.out.println("El mayor es: " + num2);
            System.out.println("El menor es: " + num1);
        } else {

            System.out.println("Los numeros introducidos son iguales");
        }
    }
}
