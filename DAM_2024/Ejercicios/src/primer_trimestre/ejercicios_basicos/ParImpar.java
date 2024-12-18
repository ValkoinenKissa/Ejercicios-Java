package primer_trimestre.ejercicios_basicos;

import java.util.Scanner;
/*
5.- Dado un número por teclado que me diga si es par o impar.
 */
public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero para saber si es par o impar: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        sc.close();
    }
}
