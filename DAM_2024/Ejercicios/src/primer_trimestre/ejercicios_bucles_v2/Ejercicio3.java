package primer_trimestre.ejercicios_bucles_v2;

import java.util.Scanner;

//3.- Imprimir por pantalla la tabla de multiplicar del número dado por el usuario.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean stop = true;
        do {
            System.out.println("Ingresa un numero del 1 al 10 para generar la tabla de multiplicar: ");
            int n = sc.nextInt();
            if (n <= 10 && n >= 1) {

                for (int i = 0; i <= 10; i++) {
                    System.out.println(n + " * " + i + " = " + (n * i));
                }
                stop = false;
            } else {
                System.out.println("El numero ingresado no es valido");
            }

        } while (stop);

    }
}
