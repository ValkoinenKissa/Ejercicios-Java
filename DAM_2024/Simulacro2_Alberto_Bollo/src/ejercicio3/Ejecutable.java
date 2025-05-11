package ejercicio3;

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
        Scanner sc = new Scanner(System.in);
        Gestion g = new Gestion();
        System.out.println("Bienvenido del programa, estas son sus opciones: ");
        int opcion;
        do {
            System.out.println("1.- Añadir palabra");
            System.out.println("2.- Mostrar palabras (Mustra la palabra mas corta y mas larga");
            System.out.println("3.- Salir del programa");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    g.aniadirPalabra();
                    break;
                case 2:
                    g.leerPalabra();
                    break;
                case 3:
                    System.out.println("Abandonando programa...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion !=3);

        sc.close();
    }
}
