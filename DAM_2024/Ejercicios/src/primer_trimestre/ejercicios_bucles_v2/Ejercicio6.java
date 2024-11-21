package primer_trimestre.ejercicios_bucles_v2;

import java.util.Scanner;

/*
6.- Escribir un programa que solicite ingresar n notas de alumnos y
nos informe cuántos tienen notas mayores o iguales a 7 y
cuántos menores. El programa termina cuanto se ingrese un valor de 0.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int contadorMayorIgual = 0, nota, contadorMenor = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Dime la nota a comprobar: ");
            nota = sc.nextInt();
            if (nota != 0) {
                if (nota >= 7) {
                    contadorMayorIgual++;

                } else {
                    contadorMenor++;
                }
            }

        } while (nota != 0);

        System.out.println("Numero de notas mayores o iguales a 7: " + contadorMayorIgual);
        System.out.println("Numero de notas menores que 7: " + contadorMenor);


    }
}
