package tercer_trimestre.ejercicios_ficheros.ejercicio_1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
1. Escribe un programa que guarde en un fichero con nombre primos.txt los números primos que hay entre 1 y 500. (PrimosEscribir.java)

2. Realiza un programa que lea el fichero creado en el ejercicio anterior y que muestre los números por pantalla. (PrimosLeer.java)
 */
public class Ejecutable {

    public static void main(String[] args) throws IOException {
        /*
        He cambiado el working directory a mi carpeta ejercicios_ficheros, ya que no trabajo con un nuevo proyecto para
        cada ejercicio, para ejecutar en un proyecto nativo borrar la carpeta ejercicio_1 del path.
         */
        Path path = Paths.get("ejercicio_1\\primos.txt");
        System.out.println("Generando el fichero de numeros primos" + path);
        PrimosEscribir es = new PrimosEscribir();
        es.escribirFichero(path);
        System.out.println("Leyendo el fichero de numeros primos que se acaba de generar: ");
        PrimosLeer pl = new PrimosLeer();
        pl.escribirFichero(path);
        System.out.println("Fin de la lectura");
    }
}
