package tercer_trimestre.ficheros_pruebas.creaccion_directorios;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejecutable {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("creaccion_directorios\\directorio_padre");
        Path subPath = Paths.get("creaccion_directorios\\directorio_padre\\directorio1\\directorio2\\directorio3");
        Path fichero1 = Paths.get("creaccion_directorios\\directorio_padre\\directorio1\\fichero1.txt");
        Path fichero2 = Paths.get("creaccion_directorios\\directorio_padre\\directorio1\\directorio2\\fichero2.txt");
        Path fichero3 = Paths.get("creaccion_directorios\\directorio_padre\\directorio1\\directorio2\\directorio3\\fichero3.txt");


        // Crear el directorio padre
        if (new File(path.toString()).mkdir()) {
            System.out.println("El directorio: " + path + " se ha generado exitosamente");
        } else {
            System.out.println("El directorio ya existía o no se pudo crear");
        }

        // Crear los subdirectorios antes de listarlos
        if (new File(subPath.toString()).mkdirs()) {
            System.out.println("Los directorios: " + subPath + " se han generado exitosamente");
        } else {
            System.out.println("Los subdirectorios ya existían o no se pudieron crear");
        }

        // Ahora listar los subdirectorios correctamente
        File directorioPadre = new File(path.toString());
        File[] directorios = directorioPadre.listFiles(File::isDirectory);

        // Crear ficheros dentro de cada subdirectorio
        if (directorios != null) {
            try {
                Files.createFile(fichero1);
                Files.createFile(fichero2);
                Files.createFile(fichero3);
                System.out.println("Se han generado los ficheros correctamente");
            } catch (IOException e) {
                System.err.println("No se pudo crear el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("No se encontraron directorios en " + path);
        }
    }
}