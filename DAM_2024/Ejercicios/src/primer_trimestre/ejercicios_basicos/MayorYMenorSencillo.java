package primer_trimestre.ejercicios_basicos;

import java.util.Scanner;

/*
4.- Dado tres números por teclado, que me muestre cuál es el mayor y el menor. Mostrarlos en orden descendiente.

 */
public class MayorYMenorSencillo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, numMenor, numMedio, numMayor;
        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num3 = sc.nextInt();

        //Estructura para determinar el numero mayor y el menor

        if (num1 > num2 && num1 > num3) {
            numMayor = num1;
        } else if (num2 > num1 && num2 > num3) {
            numMayor = num2;

        } else {
            numMayor = num3;
        }

        if (num1 < num2 && num1 < num3) {
            numMenor = num1;
        } else if (num2 < num1 && num2 < num3) {
            numMenor = num2;

        } else {
            numMenor = num3;
        }

        System.out.println("Mayor: " + numMayor);
        System.out.println("Menor: " + numMenor);

        //Estructura para imprimir los numeros en orden descendiente

        if (num1 != numMayor && num1 != numMenor) {
            numMedio = num1;
        } else if (num2 != numMayor && num2 != numMenor) {
            numMedio = num2;

        } else {
            numMedio = num3;
        }

        System.out.println("Numeros ordenados en orden descendente: ");
        System.out.println(numMayor);
        System.out.println(numMedio);
        System.out.println(numMenor);

    }
}
