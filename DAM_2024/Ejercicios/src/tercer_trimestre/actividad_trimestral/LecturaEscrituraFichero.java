package tercer_trimestre.actividad_trimestral;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/*
 * Desarrollar una aplicación que permita administrar cuentas de usuario en una red social.

 * Requisitos:
 * 1. Clases y métodos abstractos:
 *    - Crear la clase abstracta CuentaUsuario, que contendrá:
 *      - Atributos: nombreUsuario, email, teléfono y edad.
 *      - Metodo abstracto: mostrarInformación.

 * 2. Interfaces:
 *    - Crear la interfaz OperacionesCuenta con los siguientes métodos:
 *      - actualizarPerfil: recibe el nuevo email y teléfono como parámetros.
 *      - publicarMensaje: recibe el mensaje como parámetro.

 * 3. Polimorfismo:
 *    - Generar dos clases: CuentaBasica y CuentaPremium.
 *    - Ambas deben heredar de CuentaUsuario e implementar los métodos con comportamientos diferentes.

 * 4. Control de excepciones:
 *    - Implementar dos excepciones personalizadas:
 *      - TelefonoInvalido: si el teléfono no tiene 10 dígitos.
 *      - EdadInvalida: si la edad es menor de 16 años.

 * 5. Ficheros:
 *    - Generar una clase para manejar archivos con las siguientes funciones:
 *      - Guardar información de los usuarios.
 *      - Leer y mostrar la información de los usuarios.
 */
public class LecturaEscrituraFichero {

    public LecturaEscrituraFichero() {
    }

    private void crearFichero(Path rutaFichero) throws IOException {
        //Se verifica la existencia del fichero
        if (!Files.exists(rutaFichero)) {
            Files.createFile(rutaFichero);
            System.out.println("El fichero " + rutaFichero + " ha sido creado correctamente.");
        }
    }


    protected void escribirFichero(Path rutaFichero, String mensaje) throws IOException {
        //Se invoca al metodo de creaccion de fichero si este mismo no existe
        if (!Files.exists(rutaFichero)) {
            crearFichero(rutaFichero);
        }
        //Try-with-resources no es necesario cerrar el fujo de datos explicitamente
        //parametro true para sobreescribir el fichero
        try (FileWriter fw = new FileWriter(rutaFichero.toFile(), true)) {
            //Retrono de carro y salto de línea dentro del fichero
            fw.write(mensaje + "\r\n");
        } catch (IOException e) {
            System.out.println("Error al almacenar los datos: " + e.getMessage());
        }
    }


    protected void leerFichero(Path rutaFichero) {
        if (Files.exists(rutaFichero)) {
            try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero.toFile()))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                System.out.println("Error al leer el fichero: " + e.getMessage());
            }
        }
    }

    protected boolean buscarEnFichero(Path rutaFichero, String nombreUsuario) {
        if (Files.exists(rutaFichero)) {
            try {
                String contenido = Files.readString(rutaFichero);
                for (String linea : contenido.split("\n")) {
                    if (linea.contains(nombreUsuario)) {
                        return true;
                    }
                }
            } catch (IOException e) {
                System.out.println("Error al leer el fichero: " + e.getMessage());
            }
        }

        return false;
    }

    protected void actualizarEntradaFichero(Path rutaFichero, String nomUsuario, String mailAntiguo, String mailActualizado
            , String numAntiguo, String numNuevo) throws IOException {
        if (buscarEnFichero(rutaFichero, nomUsuario)) {
            //Metodo de la clase file para leer el fichero entero y almacenarlo en una variable string
            String contenido = Files.readString(rutaFichero);
            //Aplicamos los metodos replace
            contenido = contenido.replace(mailAntiguo, mailActualizado).replace(numAntiguo, numNuevo);

            //Borramos el fichero
            Files.deleteIfExists(rutaFichero);

            //Lo creamos de nuevo

            Files.createFile(rutaFichero);

            //Y volvemos a escribir el archivo con el nuevo contenido
            Files.writeString(rutaFichero, contenido, StandardCharsets.UTF_8);


        }
    }

}
