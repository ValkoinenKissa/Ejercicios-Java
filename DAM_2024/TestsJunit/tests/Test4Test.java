import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class Test4Test {
    private final Path filePath = Paths.get("src/fichero_tests.txt");

    @Before
    public void setUp() throws Exception {
        if (Files.exists(filePath)) {
            Files.delete(filePath);
        }
    }

    @After
    public void tearDown() throws Exception {
        // Limpiar el fichero después de cada prueba si fue creado
        if (Files.exists(filePath)) {
            Files.delete(filePath);
        }
    }

    @Test
    public void inicializarFichero() {
        Test4 test4 = new Test4();
        test4.inicializarFichero();
        // Comprobamos que el fichero fue creado
        assertTrue("El fichero debería haber sido creado", Files.exists(filePath));
    }
}