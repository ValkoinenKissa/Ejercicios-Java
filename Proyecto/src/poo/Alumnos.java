package poo;

import java.util.Scanner;

public class Alumnos {

    private String nombre;
    private int edad;
    private int asignaturasMatriculadas;

    public Alumnos() {
        nombre = "Nombre por defecto";
        edad = 0;
        asignaturasMatriculadas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAsignaturasMatriculadas() {
        return asignaturasMatriculadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAsignaturasMatriculadas(int asignaturasMatriculadas) {
        this.asignaturasMatriculadas = asignaturasMatriculadas;
    }

    public String verDatos() {
        return "El alumno se llama " + nombre + " y tiene " + edad + " años. Está matriculado en " +
                asignaturasMatriculadas + " asignaturas.";
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenido al gestor de alumnos del IES Francisco de Goya.");
        do {
            System.out.println("\nSelecciona una opción:");
            System.out.println("1 - Crear un alumno");
            System.out.println("2 - Ver la información sobre los alumnos");
            System.out.println("3 - Salir del programa");
            System.out.print("Introduce tu opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    Alumnos nuevoAlumno = creaAlumno();
                    verDatos(nuevoAlumno);
                    break;
                case 2:
                    Alumnos alumnos = new Alumnos();
                    verDatos(alumnos);
                    break;
                case 3:
                    System.out.println("Has salido del programa correctamente.");
                    break;
                default:
                    System.out.println("Opción incorrecta. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 3);
    }

    public static Alumnos creaAlumno() {
        Scanner entrada = new Scanner(System.in);
        Alumnos nuevoAlumno = new Alumnos();

        System.out.print("Introduce el nombre del nuevo alumno: ");
        nuevoAlumno.setNombre(entrada.nextLine());

        System.out.print("Introduce la edad del nuevo alumno: ");
        nuevoAlumno.setEdad(entrada.nextInt());

        System.out.print("Introduce el número de asignaturas matriculadas: ");
        nuevoAlumno.setAsignaturasMatriculadas(entrada.nextInt());

        return nuevoAlumno;
    }

    public static void verDatos(Alumnos alumno) {
        System.out.println("\nInformación del alumno:");
        System.out.println(alumno.verDatos());
        System.out.println("---------------------------------");
    }
}
