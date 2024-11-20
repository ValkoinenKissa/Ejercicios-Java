package primer_trimestre.ejercicios_bucles;

import java.util.Scanner;

/*
9.- Programa que lea dos números y muestre los números desde el menor
hasta el mayor.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        do {
            System.out.println("Usuario, introduce dos numeros defirentes, se mostrarán los numeros desde el menor" +
                    " hasta el mayor: ");

            System.out.print("Introduce el primer numero: ");
            num1 = sc.nextInt();
            System.out.print("Introduce el segundo numero: ");
            num2 = sc.nextInt();

            if (num1 == num2) {
                System.out.println("Los numeros introducidos no pueden ser iguales, intentalo de nuevo.");
            } else {
                System.out.println("Numeros almacenados correctamente");
            }
        } while (num1 == num2);

        int copyMin, copyMax, variableSoporte;

        if (num1 > num2) {
            copyMax = num1;
            copyMin = num2;
        } else {
            copyMin = num1;
            copyMax = num2;
        }

        variableSoporte = copyMin;


        while (variableSoporte <= copyMax) {
            System.out.println(variableSoporte);
            variableSoporte++;

        }

    }

}
