package Ejercicio_3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Ficheros {

    protected static Path ruta = Paths.get("Ejercicio_3\\ficheroTexto.txt");
    private final ArrayList<String> listaPalabras = new ArrayList<>();


    private void comprobarFicheroExiste() {
        if (!Files.exists(ruta)) {
            try {
                Files.createFile(ruta);
            } catch (IOException e) {
                System.out.println("No se ha podido crear el archivo");
            }
        }
    }

    protected void anadirPalabra(String palabra) {

        comprobarFicheroExiste();
        //Try-with resources cierra el flujo de forma automatica

        //Muy importante el modo append para gurdar las palabras que vamos introduciendo
        //Sino se sobreescribe el fichero cada vez que llamemos al metodo
        try (FileWriter fw = new FileWriter(ruta.toFile(), true)) {
            fw.write(palabra + "\r\n");
            System.out.println("Palabra registrada con exito!!");
        } catch (IOException e) {
            System.out.println("Error al escribir el fichero" + e.getMessage());

        }

    }

    protected void mostrarPalabras() {
        String linea;
        try (BufferedReader br = new BufferedReader(new FileReader(ruta.toFile()))) {
            while ((linea = br.readLine()) != null) {
                listaPalabras.add(linea.trim());
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero" + e.getMessage());
        }


        String palabraCorta = listaPalabras.getFirst();
        String palabraLarga = listaPalabras.getFirst();

        for (String palabra : listaPalabras){
            if (palabra.length() > palabraLarga.length()) {
                palabraLarga = palabra;
            }

            if (palabra.length() < palabraCorta.length()) {
                palabraCorta = palabra;
            }

        }

        System.out.println("La palabra mas corta es: " + palabraCorta);
        System.out.println("La palabra mas larga es: " + palabraLarga);
    }
}
