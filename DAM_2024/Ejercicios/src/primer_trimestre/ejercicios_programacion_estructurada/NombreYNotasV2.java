package primer_trimestre.ejercicios_programacion_estructurada;

import java.util.Scanner;

public class NombreYNotasV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nombres = new String[4];
        float [] notas = new float[4];

        System.out.println("Introduce los nombres y notas de tus 3 alumnos: ");

        for(int i = 1; i < 4; i++){
            System.out.println("Alumno: " + i);
            System.out.print("Nombre: ");
            nombres[i] = sc.nextLine();
            System.out.print("Nota: ");
            notas[i] = sc.nextFloat();
            sc.nextLine();

            System.out.println("El nombre del alumno es: " + nombres[i] + " Y su nota es: " + notas[i]);
        }

        float notaMedia = (notas[1] + notas[2] + notas[3]) / 3;
        System.out.printf("La nota media es: %.2f", notaMedia);


    }
}
