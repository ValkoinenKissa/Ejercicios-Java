package tercer_trimestre.ficheros_pruebas.serializacion;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejecutable {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("serializacion\\amigos_instancia.dat");

        Amigo amigo1 = new Amigo("Alberto", 18, "Bollo", "21/03/1990");
        Amigo amigo2 = new Amigo("Fulanito", 31, "gil", "21/03/1990");
        Amigo amigo3 = new Amigo("Perro", 31, "Sanchez", "21/03/1990");

        Amigo[] amigos = {amigo1, amigo2, amigo3};

        try {

            System.out.println("Almacenamiento de archivo");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path.toFile()));
            oos.writeObject(amigos);
            System.out.println("El archivo se escrito con exito");
            oos.close();

            System.out.println("Procediendo a la lectura del archivo: " + path);
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path.toFile()));
            //Array para almacenar datos lectura, debe de ser del tipo Amigo
            Amigo[] listaAmigosRecuperados = (Amigo[]) ois.readObject();

            for (Amigo amigo : listaAmigosRecuperados) {
                System.out.println(amigo);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado" + path);
        } catch (IOException e) {
            System.out.println("No se pudo serializar el archivo" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
