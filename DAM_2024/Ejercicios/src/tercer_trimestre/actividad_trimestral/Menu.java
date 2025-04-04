package tercer_trimestre.actividad_trimestral;
/**
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
public class Menu {
    private final EntradaSalida es = new EntradaSalida();

    public Menu() {
    }

    protected void imprimirMenu() {
        System.out.println("1-. Crear una nueva cuenta");
        System.out.println("2-. Actualizar el perfil");
        System.out.println("3-. Elegir modalidad de la cuenta");
        System.out.println("4-. Publicar un mensaje");
        System.out.println("5-. Ver mensajes publicados");
        System.out.println("6-. Salir");

    }
}
