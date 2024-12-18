package primer_trimestre.ejercicios_basicos;

import java.util.Scanner;

public class NombreYNotas {
    /*
    1.- Pedir el nombre y tres notas por teclado al usuario para poder mostrar la media.
    Tenéis que hacer el ejercicio con números enteros y con decimales.
    Me entregáis la versión que queráis.
    El mensaje que debe mostrar tiene que ser: Bienvenido .......: tu nota es......
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre1, nombre2, nombre3;
        float nota1, nota2, nota3, notaMedia;
        System.out.println("Introduce el nombre del alumno y su nota para calcular su nota media: ");

        System.out.println("Alumno 1");
        System.out.println("Nombre: ");
        nombre1 = sc.next();
        System.out.println("Nota: ");
        nota1 = sc.nextFloat();
        System.out.println("Bienvenido: " + nombre1 + " Tu su nota es: " + nota1);

        System.out.println("Alumno 2");
        System.out.println("Nombre: ");
        nombre2 = sc.next();
        System.out.println("Nota: ");
        nota2 = sc.nextFloat();
        System.out.println("Bienvenido: " + nombre2 + " Tu su nota es: " + nota2);

        System.out.println("Alumno 3");
        System.out.println("Nombre: ");
        nombre3 = sc.next();
        System.out.println("Nota: ");
        nota3 = sc.nextFloat();
        System.out.println("Bienvenido: " + nombre3 + " Tu su nota es: " + nota3);

        notaMedia = (nota1 + nota2 + nota3) / 3;

        System.out.println("El media de los alumnos es: " + notaMedia);

        sc.close();

    }
}
