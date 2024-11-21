package primer_trimestre.ejercicios_bucles_v2;

import java.util.Scanner;

//2.- Sumar y multiplicar números hasta que el usuario introduzca un 0 por teclado.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean stop = true;
        int num, suma = 0, multiplicacion = 1;

        System.out.println("Introduce un numero por teclado, este se multiplicara y sumara por si mismo hasta que" +
                " introduzcas un 0");

        do {

            System.out.print("Introduce un numero: ");

            num = sc.nextInt();
            System.out.println("Numero almacenado correctamente");

            if (num != 0) {
                suma += num;
                multiplicacion *= num;

            } else {

                stop = false;
                System.out.println("Abandonando el programa... \n");
                System.out.println("El acumulador de la suma es: " + suma);
                System.out.println("El acumulador de la multiplicacion es: " + multiplicacion);

            }

        } while (stop);

        sc.close();

    }
}
