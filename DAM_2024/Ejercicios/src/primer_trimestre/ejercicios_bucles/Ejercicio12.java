package primer_trimestre.ejercicios_bucles;

import java.util.Scanner;

//12.- Programa que lea números e indique si son positivos o negativos y pares o impares.
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        boolean stop = false;
        do {

            System.out.println("Ingrese un numero para conocer si es positivo, negativo par" +
                    " o impar: ");

            System.out.println("Si deseeas abandonar el programa introduce cualquier caracter o texto: ");


            if (!sc.hasNextInt()) {

                stop = true;

            } else {
                number = sc.nextInt();
                if (number < 0) {
                    System.out.println("El numero introducido es negativo \n");
                } else if (number > 0) {
                    System.out.println("El numero introducido es positivo \n");

                } else {
                    System.out.println("El numero introducido es 0 \n");
                }
                if (number % 2 == 0) {
                    System.out.println("El numero introducido es par \n");
                } else {
                    System.out.println("El numero introducido es impar \n");
                }
            }

        } while (!stop);


        sc.close();

    }
}
