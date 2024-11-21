package primer_trimestre.ejercicios_bucles_v2;

import java.util.Scanner;

//4.- Contar hacia atrás desde el número dado por el usuario.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Usuario introduce un numero para comenzar la cuenta atrás");
        n = sc.nextInt();

        for (int i = n; n >= 0; i--) {
            System.out.println(i);
            n--;
        }

    }
}
