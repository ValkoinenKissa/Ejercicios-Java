package tercer_trimestre.ejercicios_ficheros.ejercicio_1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

/*
1. Escribe un programa que guarde en un fichero con nombre primos.txt los números primos que hay entre 1 y 500. (PrimosEscribir.java)

2. Realiza un programa que lea el fichero creado en el ejercicio anterior y que muestre los números por pantalla. (PrimosLeer.java)
 */
public class PrimosEscribir {

    public PrimosEscribir() {
    }


    private boolean comprobarFicheroExiste(Path path) {
        return Files.exists(path);
    }

    private void crearFichero(Path path) throws IOException {
        if (!comprobarFicheroExiste(path)) {
            Files.createFile(path);
            System.out.println("Fichero escrito con exito " + path);
        } else {
            System.out.println("El archivo ya existe");
        }

    }

    protected void escribirFichero(Path path) throws IOException {
        crearFichero(path);
        //Try-with-resources, java cierra automaticamente el flujo de datos con esta estructura
        try (FileWriter writer = new FileWriter(path.toFile())) {
            ArrayList<String> listaPrimos = generarPrimos();
            for (String primo : listaPrimos) {
                writer.write(primo + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al escribir fichero " + e.getMessage());
        }
    }


    private ArrayList<String> generarPrimos() {
        ArrayList<String> listaPrimos = new ArrayList<>();
        for (int i = 1; i <= 500; i++) {
            if (esPrimo(i)) {
                listaPrimos.add(String.valueOf(i));
            }
        }

        return listaPrimos;
    }

    private boolean esPrimo(int n) {
        if (n < 2) return false; // Los números menores que 2 no son primos
        if (n == 2) return true; // 2 es el único número primo par
        if (n % 2 == 0) return false; // Los números pares mayores que 2 no son primos

        for (int i = 3; i * i <= n; i += 2) { // Solo revisamos los impares
            if (n % i == 0)
                return false;
        }
        return true;
    }


}
