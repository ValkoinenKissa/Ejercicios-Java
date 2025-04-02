package tercer_trimestre.ficheros_pruebas.clase_writer_reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lectura {
    public static void main(String[] args) throws FileNotFoundException {
        Path path = Paths.get("clase_writer_reader\\datos.txt");

        if (Files.exists(path)) {
            System.out.println("Leyendo el archivo: " + path);

            try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    System.out.println(linea);
                }

            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e);
            }
        } else {
            System.out.println("El archivo no existe: " + path);
        }
    }
}
