import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test4 {
    public void inicializarFichero() {

        try {
            Path path = Paths.get("src\\fichero_tests.txt");
            if (!Files.exists(path)) {
                Files.createFile(path);
            } else {
                System.out.println("El fichero ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error al generar el fichero: " + e.getMessage());
        }

    }
}

class Ejecutable {
    public static void main(String[] args) {
        Test4 instancia = new Test4();
        instancia.inicializarFichero();

    }
}
