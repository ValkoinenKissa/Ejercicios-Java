package tercer_trimestre.ficheros_pruebas.clase_file;

import java.io.File;
import java.util.Scanner;

/*
Dado un fichero de texto, construye un programa Java que pida al usuario la ruta hacia un fichero y que muestre por
pantalla información básica sobre el mismo. Como mínimo, debería mostrarse el nombre del fichero,
el directorio donde se encuentra y su tamaño expresado en kilobytes.
También se pueden mostrar los permisos de lectura, escritura y ejecución.
 */
public class FicheroDetalles {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean existe = false;

        do {
            System.out.println("Ingrese el nombre del fichero que quiere consultar: (fichero1.txt o fichero2.txt)");
            String ruta = sc.nextLine();
            File fichero = new File(ruta);

            if (fichero.exists()) {
                System.out.println("El nombre del fichero es: " + fichero.getName());
                System.out.println("La ruta relativa del fichero es " + fichero.getPath());
                System.out.println("La ruta absoluta del fichero es: " + fichero.getAbsolutePath());
                System.out.println("El peso del fichero es " + fichero.length() / 1024.0 + " KB");
                System.out.println("Permisos de ejecucion del fichero");
                System.out.println("Lectura: " + fichero.canRead());
                System.out.println("Escritura: " + fichero.canWrite());
                System.out.println("Ejecucion: " + fichero.canExecute());
                System.out.println("Directorio de trabajo: " + System.getProperty("user.dir"));
                existe = true;
            } else {
                System.out.println("El nombre del fichero que has introducido no existe, prueba de nuevo");
            }

        } while (!existe);


    }
}
