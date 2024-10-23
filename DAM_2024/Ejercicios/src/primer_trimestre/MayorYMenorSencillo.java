package primer_trimestre;

import java.util.Scanner;

/*
4.- Dado tres números por teclado, que me muestre cuál es el mayor y el menor. Mostrarlos en orden descendiente.

 */
public class MayorYMenorSencillo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;
        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num3 = sc.nextInt();


        int numMayor, numMenor, numMedio;


        if (num1 >= num2 && num1 >= num3) {
            numMayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            numMayor = num2;
        } else {
            numMayor = num3;
        }

        if (num1 <= num2 && num1 <= num3) {
            numMenor = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            numMenor = num2;
        } else {
            numMenor = num3;
        }

        // Determinar el número intermedio
        if ((num1 != numMayor && num1 != numMenor)) {
            numMedio = num1;
        } else if ((num2 != numMayor && num2 != numMenor)) {
            numMedio = num2;
        } else {
            numMedio = num3;
        }

        System.out.println("El numero mayor es: " + numMayor);
        System.out.println("El numero menor es: " + numMenor);


        System.out.println("Los numeros mostrados en orden descendente: " + numMayor + " " + numMedio + " " + numMenor);


    }
}
