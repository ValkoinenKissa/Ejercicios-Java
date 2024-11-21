package primer_trimestre.ejercicios_bucles;

import java.util.Scanner;

/*
Programa que lea dos números y muestre los números pares entre ellos.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        do {
            System.out.println("Usuario, introduce dos numeros diferentes, se mostrarán los numeros pares desde el menor" +
                    " hasta el mayor: ");

            System.out.print("Usuario introduce el primer numero: ");
            num1 = sc.nextInt();
            System.out.print("Usuario introduce el segundo numero: ");
            num2 = sc.nextInt();

            if (num1 == num2) {
                System.out.println("Los numeros introducidos no pueden ser iguales, intentalo de nuevo.");
            } else {
                System.out.println("Numeros almacenados correctamente");
            }
        } while (num1 == num2);

        int min, max, current;

        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            min = num1;
            max = num2;
        }

        current = min;


        while (current <= max) {
            if (current % 2 == 0) {
                System.out.println(current);
            }
            current++;

        }

    }
}
