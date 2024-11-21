package primer_trimestre.ejercicios_bucles_v2;

import java.util.Random;
import java.util.Scanner;

//5.- Adivinar el número. El usuario introduce un número y mostramos si lo ha adivinado o no.
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n, secretNumber = rand.nextInt(49) + 1;
        boolean stop = false;

        do {

            System.out.println("Usuario, intenta adivinar el numero secreto, introduce un numero entre el" +
                    " 1 y el 49");
            n = sc.nextInt();
            while (n < 1 || n > 49) {
                System.out.println("Error. Introduce un numero entre 1 y 49");
                System.out.println("Ingresa el numero: ");
                n = sc.nextInt();
            }
            if (n == secretNumber) {
                System.out.println("Has acertado!!");
                stop = true;
            }else{
                System.out.println("No has acertado, sigue intentandolo... \n");
                System.out.println("¿Quieres rendirte y ver el numero secreto? (S o N)?");

                String decision = sc.next().toUpperCase();

                if (decision.equals("S")) {
                    System.out.println("El numero secreto era: " + secretNumber);
                    System.out.println("El numero que has introducido es: " + n);
                    break;
                }

            }

        }while (!stop);
    }
}
