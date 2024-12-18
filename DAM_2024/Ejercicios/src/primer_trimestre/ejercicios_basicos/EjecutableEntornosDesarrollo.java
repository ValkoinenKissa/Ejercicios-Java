package primer_trimestre.ejercicios_basicos;

import java.util.Scanner;

/*
Realiza un diagrama de flujo que represente la siguiente aplicación.
Debes de rellenar una lista de una longitud que fija el usuario por teclado.
El usuario introduce por teclado los valores que van en cada posición de la lista
A continuación, mostrarás en pantalla, el valor total de la suma de todos los números de la lista.
 */
public class EjecutableEntornosDesarrollo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumulador = 0;
        int longitudLista = 0;
        boolean stop = false;

        while (!stop) {

            System.out.println("Usuario, introduce la longitud de la lista: ");
            longitudLista = sc.nextInt();
            if (longitudLista <= 0) {
                System.out.println("El longitud debe ser mayor que 0");
            } else {
                stop = true;
            }

        }

        int[] listaValores = new int[longitudLista];

        for (int i = 0; i < longitudLista; i++) {
            System.out.println("Introduce el valor numerico en la posición: " + i);
            listaValores[i] = sc.nextInt();
            acumulador += listaValores[i];
        }


        System.out.println("La suma de todos los valores del array es: " + acumulador);

        sc.close();

    }
}
