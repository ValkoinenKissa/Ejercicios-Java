package tercer_trimestre.actividad_trimestral;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Desarrollar una aplicación que permita administrar cuentas de usuario en una red social.

 * Requisitos:
 * 1. Clases y métodos abstractos:
 * - Crear la clase abstracta CuentaUsuario, que contendrá:
 * - Atributos: nombreUsuario, email, teléfono y edad.
 * - Metodo abstracto: mostrarInformación.

 * 2. Interfaces:
 * - Crear la interfaz OperacionesCuenta con los siguientes métodos:
 * - actualizarPerfil: recibe el nuevo email y teléfono como parámetros.
 * - publicarMensaje: recibe el mensaje como parámetro.

 * 3. Polimorfismo:
 * - Generar dos clases: CuentaBasica y CuentaPremium.
 * - Ambas deben heredar de CuentaUsuario e implementar los métodos con comportamientos diferentes.

 * 4. Control de excepciones:
 * - Implementar dos excepciones personalizadas:
 * - TelefonoInvalido: si el teléfono no tiene 10 dígitos.
 * - EdadInvalida: si la edad es menor de 16 años.

 * 5. Ficheros:
 * - Generar una clase para manejar archivos con las siguientes funciones:
 * - Guardar información de los usuarios.
 * - Leer y mostrar la información de los usuarios.
 */
public class CuentaBasica extends CuentaUsuario implements OperacionesCuenta {
    //Atributos de clase definidos como final, ya que carecen de metodos getter and setter y ademas se evita el cambio accidental de los mismos
    private final LecturaEscrituraFichero lecturaEscritura = new LecturaEscrituraFichero();
    private final Path rutaFicheroDatos = Paths.get("actividad_trimestral\\ficheros\\datos_usuarios.txt");
    private final Path rutaFicheroMensajes = Paths.get("actividad_trimestral\\ficheros\\mensajes_usuarios.txt");

    public CuentaBasica() {
    }

    public CuentaBasica(String nombreUsuario, String email, int telefono, int edad) {
        super(nombreUsuario, email, telefono, edad);
    }

    //String nombreUsuario, String email, int telefono, int edad
    @Override
    void mostrarInformacion() {
        System.out.println("Usuario: " + super.getNombreUsuario() + " | Email: " + super.getEmail() + " | Telefono: "
                + super.getTelefono() + " | Edad: " + super.getEdad());
    }

    @Override
    public void actualizarPerfil(String email, int numTelefono) {
      super.setEmail(email);
      super.setTelefono(numTelefono);
      System.out.println("Perfil actualizado exitosamente: ");
      mostrarInformacion();
    }


    @Override
    public void publicarMensaje(String mensaje) {
        //Se obtiene la fecha y hora a traves del metodo LocalDateTime.now
        LocalDateTime fechaYHora = LocalDateTime.now();
        //Se configura el formato que tiene que tener la fecha
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss ");
        //Se aplica el formato
        String fechaFormateada = fechaYHora.format(formato);
        //Se imprime junto al mensaje
        String fechaYmensaje = fechaFormateada + " " + mensaje;
        lecturaEscritura.escribirFichero(rutaFicheroDatos, fechaYmensaje);

    }
}
