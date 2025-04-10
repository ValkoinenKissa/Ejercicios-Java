package tercer_trimestre.actividad_trimestral;

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
public abstract class CuentaUsuario {
    private final String nombreUsuario;
    private String email;
    private String telefono;
    private final int edad;

    public CuentaUsuario(String nombreUsuario, String email, String telefono, int edad) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    //Metodos abstractos
    abstract void mostrarInformacion();
}
