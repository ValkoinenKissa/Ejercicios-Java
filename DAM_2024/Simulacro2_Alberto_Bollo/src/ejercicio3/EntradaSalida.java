package ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
Crea una aplicación que muestre por pantalla un menú con tres
opciones: (3.5 puntos)
 Añadir palabra:
El usuario introduce una palabra que se guarda en un fichero de
texto.
Si el fichero no existe, se debe crear en ese mismo momento.
Mostrar palabras:
Muestra en pantalla la palabra más corta y la palabra más larga
de todas las almacenadas en el fichero.
 Salir de la aplicación.
 */
public class EntradaSalida {

    public EntradaSalida() {
    }

    protected void escribirFichero(Path ruta, String palabra) {
        try {
            if (!Files.exists(ruta)) {
                Files.createFile(ruta);
            }

            //Try with-resources, no es necesario cerrar el flujo de datos
            try (FileWriter fw = new FileWriter(ruta.toFile(), true)) {
                fw.write(palabra + "\r\n");
            } catch (IOException e) {
                System.out.println("No se puede escribir el fichero: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }

    }

    protected void CalcularLongitud(Path ruta) {
        if (!Files.exists(ruta)) {
            System.out.println("El fichero no se puede leer por que no existe");
        } else {
            String linea;
            String palabraCorta, palabraLarga;
            try (BufferedReader br = new BufferedReader(new FileReader(ruta.toFile()))) {
                linea = br.readLine();
                if (linea == null) {
                    System.out.println("El fichero esta vacio");
                    return;
                }

                palabraLarga = linea;
                palabraCorta = linea;

                while ((linea = br.readLine()) != null) {

                    if (linea.length() < palabraCorta.length()) {
                        palabraLarga = linea;
                    }

                    if (linea.length() > palabraLarga.length()) {
                        palabraCorta = linea;
                    }
                }

                System.out.println("La palabra larga es: " + palabraLarga);
                System.out.println("La palabra corta es: " + palabraCorta);


            } catch (IOException e) {
                System.out.println("No se puede leer el fichero: " + e.getMessage());
            }
        }
    }

}
