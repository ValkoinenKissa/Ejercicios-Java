package tercer_trimestre.ejercicios_ficheros.ejercicio_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrimosLeer {

    public PrimosLeer() {
    }

    private boolean comprobarFicheroExiste(Path path) {
        return Files.exists(path);
    }


    protected void escribirFichero(Path path) {
        if (comprobarFicheroExiste(path)) {

            //Try-with-resources autocierre de flujo reader
            try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
                String lectura;
                while ((lectura = reader.readLine()) != null) {
                    System.out.println(lectura);
                }

            } catch (IOException e) {
                System.err.println("No se puede escribir el fichero" + e.getMessage());
            }

        } else {
            System.out.println("No se puede acceder al fichero por que no existe");
        }
    }


}
