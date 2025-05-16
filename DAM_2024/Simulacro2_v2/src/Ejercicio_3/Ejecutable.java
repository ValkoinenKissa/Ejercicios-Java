package Ejercicio_3;

import java.util.Scanner;

/*
Crea una aplicación que muestre por pantalla un menú con tres
opciones: (3.5 puntos)
 Añadir palabra:
El usuario introduce una palabra que se guarda en un fichero de
texto.
Si el fichero no existe, se debe crear en ese mismo momento.

Mostrar palabras:
Muestra en pantalla la palabra más corta y la palabra más larga
de todas las almacenadas en el fichero.
 Salir de la aplicación.
 */
public class Ejecutable {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la aplicacion");
        Scanner sc = new Scanner(System.in);
        Ficheros f = new Ficheros();
        int opcion;
        do {
            System.out.println("1.- Añadir palabra");
            System.out.println("2.- Mostrar palabras");
            System.out.println("3.- Abandonar la aplicacion");
            System.out.println("--------------------------------------");
            System.out.println("Ingrese la opcion que deseea ejecutar: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce la plabra que tu quieras: ");
                    String palabra = sc.next();
                    f.escribirFichero(palabra);
                    break;
                case 2:
                    f.mostrarPalabras();
                    break;
                case 3:
                    System.out.println("Hsta pronto!!!");
                    break;
                default:
                    System.out.println("La opcion que has introducido no es valida");
                    break;
            }

        } while (opcion != 3);
    }
}
