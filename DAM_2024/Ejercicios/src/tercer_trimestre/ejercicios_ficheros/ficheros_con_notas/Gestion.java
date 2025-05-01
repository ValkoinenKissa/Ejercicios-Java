package tercer_trimestre.ejercicios_ficheros.ficheros_con_notas;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Gestion {
    private static final Path rutaFichero = Paths.get("ejercicios_ficheros\\ficheros_con_notas\\ficheros\\data.txt");
    private static final Scanner sc = new Scanner(System.in);
    private final Ficheros ficheros = new Ficheros();
    private final ArrayList<Alumnos> listaAlumnos = new ArrayList<>();

    public Gestion() {
        ficheros.eliminarFichero(rutaFichero);
        ficheros.crearFichero(rutaFichero);
    }


    protected void crearAlumno() {
        System.out.println("Ingrese el DNI del alumno: ");
        String dni = sc.nextLine();
        if (!ficheros.buscarEnFichero(rutaFichero, dni)) {
            System.out.println("Ingrese los siguientes datos del alumno: ");
            System.out.println("Ingrese el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el apellido: ");
            String apellido = sc.nextLine();
            System.out.println("Ingrese la nota del alumno: ");
            String nota = sc.nextLine();
            Alumnos alumno = new Alumnos(nombre, apellido, nota, dni);
            listaAlumnos.add(alumno);
            ficheros.escribirFichero(rutaFichero, alumno);
            System.out.println("El alumno se ha registrado con exito");

        } else {
            System.out.println("El alumno ya existe");
        }

    }

    protected void modificarNotaAlumno() {
        System.out.println("Ingrese el DNI del alumno: ");
        String dni = sc.nextLine();
        String nuevaNota, notaAnterior;
        if (ficheros.buscarEnFichero(rutaFichero, dni)) {
            for (Alumnos alumno : listaAlumnos) {
                if (alumno.getDni().equals(dni)) {
                    notaAnterior = alumno.getNota();
                    System.out.println("Ingresa la nueva nota del alumno: ");
                    nuevaNota = sc.nextLine();
                    ficheros.modificarNotaAlumno(rutaFichero, dni, nuevaNota, notaAnterior);
                    break;
                }
            }
        } else {
            System.out.println("El dni que has introducido no se ha localizado en el sistema");
        }
    }

    protected void eliminarAlumnoDelSistema() {
        System.out.println("Ingrese el DNI del alumno: ");
        String dni = sc.nextLine();
        if (ficheros.buscarEnFichero(rutaFichero, dni)) {
            for (Alumnos alumno : listaAlumnos) {
                if (alumno.getDni().equals(dni)) {
                    String nota = alumno.getNota();
                    ficheros.eliminarAlumno(rutaFichero, dni, nota);
                    alumno.setNota("null");
                    break;
                }
            }
        } else {
            System.out.println("El dni que has introducido no se ha localizado en el sistema");
        }
    }

    protected void mostarAlumnos() {
        ficheros.leerFichero(rutaFichero);
    }
}
