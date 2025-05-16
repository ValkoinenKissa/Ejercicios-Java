package Ejercicio_3;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
public class Ficheros {
    //Variable statica para acceder en cualquier momento a la ruta del fichero
    private static final Path RUTA_FICHERO = Paths.get("Ejercicio_3\\ficheroPalabras.txt");

    public Ficheros() {
    }

    //Metodo privado para comprobar si el fichero ya existe, si no existe lo crea
    private void comprobarFicheroExiste() {
        if (!Files.exists(RUTA_FICHERO)) {
            try {
                Files.createFile(RUTA_FICHERO);
            } catch (IOException e) {
                System.out.println("No se puede crear el fichero: " + e.getMessage());
            }
        }
    }

    protected void escribirFichero(String palabra) {
        comprobarFicheroExiste();
        /*Se utiliza try-with-resources el cual cierra automaticamente el flujo de datos, la escritura del fichero
          utiliza el modo append, el cual se utiliza para sobreescribir el mismo fichero en vez de crear uno nuevo
         */
        try (FileWriter fw = new FileWriter(RUTA_FICHERO.toString(), true)) {
            //Se escribe la palabra junto a una coma para facilitar el posterior procesamiento del fichero
            fw.write(palabra + "\r\n");

        } catch (IOException e) {
            System.out.println("No se puede escribir el fichero: " + e.getMessage());
        }
    }

    protected void mostrarPalabras() {
        ArrayList<String> listaPalabras = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(RUTA_FICHERO)) {
            String linea;
            //Se comprueba que la linea leida del fichero no sea null, si lo es se detiene la lectura
            while ((linea = br.readLine()) != null) {
                //Se añade la palabra a la lista de palabras
                //Se utiliza el metodo .split para separar las diferentes frases utilizando la coma
                listaPalabras.add(linea.trim());
            }

        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }

        //Se plantea que tanto la palabra mas corta como la mas larga es la primera de la lista

        String palabraCorta = listaPalabras.getFirst();
        String palabraLarga = listaPalabras.getFirst();

        //Se recorre la lista y mediante un bloque condicional se van clasificando las plabras mas largas y mas cortas

        for (String palabra : listaPalabras) {
            if (palabra.length() > palabraLarga.length()) {
                palabraLarga = palabra;
            }

            if (palabra.length() < palabraCorta.length()) {
                palabraCorta = palabra;
            }
        }

        System.out.println("La palabra mas corta del fichero es: " + palabraCorta);
        System.out.println("La palabra mas larga del fichero es: " + palabraLarga);
    }

}
