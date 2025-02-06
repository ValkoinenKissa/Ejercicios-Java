package segundo_trimestre.recursividad;

import java.util.Random;
import java.util.Scanner;

/*
Diseña un programa que consista en adivinar un número que la aplicación habrá generado aleatoriamente,
por ejemplo entre 1 y 100. Debe empezar con un mensaje indicando entre qué valores está el número que hay que adivinar
(en nuestro caso, entre el 1 y el 100) y pidiendo un número al usuario. Si el número se adivina, se muestra un mensaje
de felicitación y acaba el juego. Si no se ha adivinado el número, se indica al usuario si el valor buscado es mayor o
menor que el introducido, se actualizan los límites inferiores y superiores de la búsqueda y sigue el juego.

Por ejemplo, supongamos que el número que se debe adivinar es el 55.
La salida del programa debería ser como ves en el lateral.
Utiliza una función recursiva para implementar los sucesivos intentos de adivinar el número.
 */
public class Ejemplo3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = rand.nextInt(100) + 1;
        System.out.println("El número a adivinar está entre 1 y 100");
        adivinaNumero(sc, numeroAleatorio, 1, 100);
        sc.close();
    }

    public static void adivinaNumero(Scanner sc, int numeroAleatorio, int min, int max) {
        System.out.println("Introduce un numero entre " + min + " y " + max);
        System.out.println("¿Cual es el numero?");
        int numeroInto = sc.nextInt();
        if (numeroInto == numeroAleatorio) {
            System.out.println("¡Has adivinado el numero " + numeroInto + "!");
        } else if (numeroInto > numeroAleatorio) {
            System.out.println("El numero por adivinar es menor que el numero " + numeroInto);
            adivinaNumero(sc, numeroAleatorio, min, numeroInto - 1);
        } else {
            System.out.println("El numero por adivinar es mayor que el numero " + numeroInto);
            adivinaNumero(sc, numeroAleatorio, numeroInto + 1, max);
        }

    }


}
