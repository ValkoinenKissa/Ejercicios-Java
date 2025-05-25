package Ejercicio_3;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        Ficheros f = new Ficheros();
        System.out.println("Bienvenido a la aplicacion, estas son las opciones: ");
        boolean salir = false;
        while(!salir){
            System.out.println("1.- Añadir palabra");
            System.out.println("2.- Mostrar palabra");
            System.out.println("3.- Salir de la aplicacion");
            System.out.println("---------------------------");
            System.out.println("Introduce tu opcion: ");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    sc.nextLine();
                    System.out.println("Introduce la plabra que quieras: ");
                    String palabra = sc.next();
                    f.anadirPalabra(palabra);
                    break;
                case 2:
                    f.mostrarPalabras();
                    break;
                case 3:
                    System.out.println("Abandonando el programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }


    }
}

