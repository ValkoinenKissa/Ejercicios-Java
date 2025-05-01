package tercer_trimestre.ejercicios_ficheros.ficheros_con_notas;

import java.util.Scanner;

/*
Crea un programa que permita al profesor las siguientes tareas:

1.- Ingresar al alumno y su nota del módulo, siempre y cuando no exista.

2.- Modificar la nota del alumno/a, si existe.

3.- Eliminar la nota de un alumno/a si existe.

4.- Salir.
 */
public class Ejecutable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu m = new Menu();
        Gestion g = new Gestion();
        int opcion;
        do {
            m.mostrarMenu();
            System.out.println("Introduce la opcion:");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    g.crearAlumno();
                    break;
                case 2:
                    g.modificarNotaAlumno();
                    break;
                case 3:
                    g.eliminarAlumnoDelSistema();
                    break;
                case 4:
                    g.mostarAlumnos();
                    break;

                case 5:
                    System.out.println("Hasta pronto!!");
                    sc.close();
                    break;
                default:
                    System.out.println("Opcion no valida, la opcion debe de estar entre 1 y 4");
                    break;
            }
        } while (opcion != 5);
    }
}
