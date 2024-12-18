package primer_trimestre.ejercicios_basicos;

import java.util.Scanner;

/*
6.- Dada una nota por teclado, me debe mostrar su nota en letras. Posibilidades:

De 0 a 4 INSUFICIENTE

5 SUFICIENTE

6 BIEN

De 7 a 8 NOTABLE

9 SOBRESALIENTE

10 MATRICULA DE HONOR

Es decir, si me da un 7 mostrará el mensaje de NOTABLE. Hay que controlar que el usuario introduce un número de 0 a 10.
 */
public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Introduce tu nota, para mostrar la nota en letras: ");
        nota = sc.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("La nota no es valida");

        } else if (nota <= 4) {
            System.out.println("INSUFICIENTE");

        } else if (nota >= 5 && nota < 6) {
            System.out.println("SUFICIENTE");

        } else if (nota >= 6 && nota < 7) {
            System.out.println("BIEN");

        } else if (nota > 6 && nota <= 8) {
            System.out.println("NOTABLE");

        } else if (nota > 8 && nota <= 9) {
            System.out.println("SOBRESALIENTE");
        } else if (nota > 9) {
            System.out.println("MATRICULA DE HONOR");
        }

    }
}
