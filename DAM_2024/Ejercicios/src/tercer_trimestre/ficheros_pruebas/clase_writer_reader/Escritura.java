package tercer_trimestre.ficheros_pruebas.clase_writer_reader;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Crea un fichero de texto con una única línea que refleje tu nombre completo. Guarda el fichero con el nombre «datos.txt».
Realiza un programa en Java que lea la información de la línea del fichero de texto y la muestre en la consola.
 */

/*
 * Paths.get() es un metodo estático de la clase Paths
 * (que forma parte del paquete java.nio.file) y sirve para
 * crear una instancia de la clase Path, que representa la
 * ruta de un archivo o directorio en el sistema de archivos.
 *
 * Es decir, en vez de pasar directamente una String al
 * FileReader, FileWriter, etc., puedes usar Paths.get()
 * para construir una ruta de forma más robusta y portable.
 */
public class Escritura {

    public static void main(String[] args) throws IOException {

        //Esto funciona en base al working directory
        Path path = Paths.get("clase_writer_reader\\datos.txt");

        try {

            if (!Files.exists(path)) {
                System.out.println("Archivo creado correctamente " + path);
            } else {
                System.out.println("Archivo existente " + path);
            }


            FileWriter fw = new FileWriter(path.toFile());

            fw.write("Me llamo Alberto jijijijijijiji");

            fw.close();

        } catch (IOException e) {
            System.out.println("Error al crear el fichero del archivo " + e.getMessage());
            String currentDirectory = System.getProperty("user.dir");
            System.out.println("Directorio actual: " + currentDirectory);
        }


    }
}
