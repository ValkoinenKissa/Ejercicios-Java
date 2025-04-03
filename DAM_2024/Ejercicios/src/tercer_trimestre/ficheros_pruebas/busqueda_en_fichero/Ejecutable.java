package tercer_trimestre.ficheros_pruebas.busqueda_en_fichero;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
Construye un programa que permita buscar palabras en un fichero de texto. Se debe mostrar el número de línea y
su contenido para cada línea que contenga la palabra buscada.
 */
public class Ejecutable {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        Path paths = Paths.get("busqueda_en_fichero\\datos_busqueda.txt");
        String textoABuscar;
        int contadorNumLinea = 0, acumConcurrencias = 0;
        ArrayList<Integer> lineasCoincidencias = new ArrayList<>();
        ArrayList<String> contenidoLineaCoincidente = new ArrayList<>();

        if (Files.exists(paths)) {

            System.out.println("Introduce la palabra que quieras buscar: ");
            textoABuscar = sc.nextLine();

            try (BufferedReader reader = new BufferedReader(new FileReader(paths.toFile()))) {
                String linea;

                while ((linea = reader.readLine()) != null) {
                    contadorNumLinea++;
                    String[] partes = linea.split(" ");

                    for (String parte : partes) {
                        if (textoABuscar.equals(parte)) {
                            acumConcurrencias += 1;
                            lineasCoincidencias.add(contadorNumLinea);
                            contenidoLineaCoincidente.add(linea);
                            break;
                        }
                    }
                }

            } catch (FileNotFoundException e) {

                System.out.println("No se ha podido realizar la lectura del archivo");
            }

            if (acumConcurrencias > 0) {
                System.out.println("La palabra buscada: " + textoABuscar + " ha sido hallada en la / las lineas "
                        + lineasCoincidencias + " el siguiente numero de veces: " + acumConcurrencias);
                System.out.println("Mostrando contenido de las lineas:  " + lineasCoincidencias);
                System.out.println(contenidoLineaCoincidente);


            } else {
                System.out.println("No se ha encontrado ninguna coincidencia de la palabra: " + textoABuscar);
            }


        } else {
            System.out.println("No se puede ejecutar el archivo " + paths);
        }

    }
}
