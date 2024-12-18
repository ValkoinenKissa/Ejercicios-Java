package primer_trimestre.ejercicios_programacion_estructurada;

import java.util.Scanner;

/*
 *Dado nos números por teclado, que me muestre cuál es el mayor, menor y si son iguales.
 */
public class MayorYMenor_2_Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El num1: " + num1 + " es mayor que el num2: " + num2);
        } else if (num2 > num1) {
            System.out.println("El num2: " + num2 + " es mayor que el num1: " + num1);

        } else {
            System.out.println("num1 y num2 son iguales!!");
        }
        sc.close();
    }
}
