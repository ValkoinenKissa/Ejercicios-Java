package tercer_trimestre.actividad_trimestral;
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
public class CuentaPremium extends CuentaUsuario implements OperacionesCuenta {
    private final String biografia;

    public CuentaPremium(String nombreUsuario, String email, String telefono, int edad, String biografia) {
        super(nombreUsuario, email, telefono, edad);
        this.biografia = biografia;
    }

    //String nombreUsuario, String email, int telefono, int edad
    @Override
    protected String mostrarInformacion() {
        return "Usuario: " + super.getNombreUsuario() + " | Email: " + super.getEmail() + " | Telefono: "
                + super.getTelefono() + " | Edad: " + super.getEdad() + " | Biografia: " + biografia;
    }

    @Override
    public void actualizarPerfil(String email, String numTelefono) {
        super.setEmail(email);
        super.setTelefono(numTelefono);
        System.out.println("Perfil actualizado exitosamente: ");
        mostrarInformacion();
    }

    @Override
    public String publicarMensaje(String mensaje) {
        //Se obtiene la fecha y hora a traves del metodo LocalDateTime.now
        LocalDateTime fechaYHora = LocalDateTime.now();
        //Se configura el formato que tiene que tener la fecha
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss ");
        //Se aplica el formato
        String fechaFormateada = fechaYHora.format(formato);
        //Se imprime junto al mensaje
        return fechaFormateada + " | Mensaje --> " + mensaje;
    }
}
