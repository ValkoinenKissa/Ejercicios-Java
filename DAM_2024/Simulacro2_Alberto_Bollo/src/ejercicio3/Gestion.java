package ejercicio3;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Gestion {
    protected EntradaSalida es = new EntradaSalida();
    protected Scanner sc = new Scanner(System.in);
    Path path = Paths.get("ejercicio3\\ficheros\\archivo.txt");


    public Gestion() {
    }

    protected void aniadirPalabra() {
        do {
            String palabra;
            System.out.print("Ingresesa la palabra: ");
            palabra = sc.nextLine();

            if (palabra.isEmpty()) {
                System.out.println("No has ingresado la palabra");
            } else {
                System.out.println("Palabra registrada correctamente: " + palabra);
                es.escribirFichero(path, palabra);
                break;
            }
        } while (true);
    }

    protected void leerPalabra() {
        es.CalcularLongitud(path);
    }
}
