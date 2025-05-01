package tercer_trimestre.ejercicios_ficheros.ficheros_con_notas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/*
Crea un programa que permita al profesor las siguientes tareas:

1.- Ingresar al alumno y su nota del módulo, siempre y cuando no exista.

2.- Modificar la nota del alumno/a, si existe.

3.- Eliminar la nota de un alumno/a si existe.

4.- Salir.
 */
public class Ficheros {

    public Ficheros() {
    }

    protected boolean comprobarExixtenciaFichero(Path rutaFichero) {
        return Files.exists(rutaFichero);
    }

    protected void crearFichero(Path rutaFichero) {
        if (!comprobarExixtenciaFichero(rutaFichero)) {
            try {
                Files.createFile(rutaFichero);
                System.out.println("Fichero " + rutaFichero + " creado");
            } catch (IOException e) {
                System.out.println("No se puede crear el fichero: " + e.getMessage());
            }
        }
    }

    protected void eliminarFichero(Path rutaFichero) {
        if (comprobarExixtenciaFichero(rutaFichero)) {
            try {
                Files.deleteIfExists(rutaFichero);
                System.out.println("Fichero " + rutaFichero + " eliminado");
            } catch (IOException e) {
                System.out.println("No se puede eliminar el fichero: " + e.getMessage());
            }
        }
    }

    protected void escribirFichero(Path rutaFichero, Alumnos alumno) {
        if (comprobarExixtenciaFichero(rutaFichero)) {
            try (FileWriter fw = new FileWriter(rutaFichero.toFile(), true)) {
                fw.write(alumno.toString() + "\r\n");
            } catch (IOException e) {
                System.out.println("No se puede leer el fichero: " + e.getMessage());
            }
        } else {
            System.out.println("El fichero no existe");
        }
    }

    protected void leerFichero(Path rutaFichero) {
        if (comprobarExixtenciaFichero(rutaFichero)) {
            try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero.toFile()))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }

            } catch (IOException e) {
                System.out.println("No se puede leer el fichero: " + e.getMessage());
            }
        }
    }

    protected boolean buscarEnFichero(Path rutaFichero, String dni) {
        if (comprobarExixtenciaFichero(rutaFichero)) {
            String textoABuscar = " dni='" + dni + "'";
            try {
                String linea = Files.readString(rutaFichero);
                if (!linea.isBlank()) {
                    if (linea.split(",")[2].equals(textoABuscar)) {
                        return true;
                    }
                }

            } catch (IOException e) {
                System.out.println("No se puede leer el fichero: " + e.getMessage());
            }
        }

        return false;
    }

    protected void modificarNotaAlumno(Path rutaFichero, String dniAlumno, String nuevaNota, String notaAntigua) {
        if (buscarEnFichero(rutaFichero, dniAlumno)) {
            try {
                String contenidoFichero = Files.readString(rutaFichero);
                contenidoFichero = contenidoFichero.replace(notaAntigua, nuevaNota);

                //Borramos el fichero:

                eliminarFichero(rutaFichero);

                //Creamos de nuevo el fichero:

                crearFichero(rutaFichero);

                //Escribimos el fichero de vuelta:

                Files.writeString(rutaFichero, contenidoFichero, StandardCharsets.UTF_8);
                System.out.println("La nota se ha actualizada correctamente");

            } catch (IOException e) {
                System.out.println("No se ha podido modificar la nota del alumno: " + e.getMessage());
            }

        } else {
            System.out.println("El alumno que intentas buscar no existe en el sistema.");
        }
    }

    protected void eliminarAlumno(Path rutaFichero, String dniAlumno, String nota) {
        if (buscarEnFichero(rutaFichero, dniAlumno)) {
            try {
                String contenidoFichero = Files.readString(rutaFichero);
                contenidoFichero = contenidoFichero.replace(nota, "null");

                //Borramos el fichero:

                eliminarFichero(rutaFichero);

                //Creamos de nuevo el fichero:

                crearFichero(rutaFichero);

                //Escribimos el fichero de vuelta:

                Files.writeString(rutaFichero, contenidoFichero, StandardCharsets.UTF_8);
                System.out.println("La nota se ha borrado correctamente");
            } catch (IOException e) {
                System.out.println("No se puede eliminar el alumno: " + e.getMessage());
            }
        }
    }

}
