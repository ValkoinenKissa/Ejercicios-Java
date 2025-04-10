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
        System.out.println("3-. Publicar un mensaje");
        System.out.println("4-. Ver mensajes publicados");
        System.out.println("5-. Salir");

    }

    protected void imprimirMenuTipoCuenta() {
        System.out.println("1-. Crear una cuenta estandar");
        System.out.println("2-. Crear una cuenta premium");
        System.out.println("3-. Comparar funciones de la cuenta estandar y la cuenta premium");
        System.out.println("4-. Salir del menu de creaccion de cuentas");
    }

    protected void opcionesCuentaPremium() {
        System.out.println("\uD83C\uDD93 Funcionalidades para Cuenta Básica:");
        System.out.println("1-. Publicar mensajes de texto simples.");
        System.out.println("2-. Actualizar perfil (email y teléfono).");
        System.out.println("3-. Límite de 5 publicaciones por día.");
        System.out.println("4-. Tamaño de 100 caracteres por mensaje");
        System.out.println("5-. Sin opción de personalizar el perfil más allá de datos básicos.");
    }

    protected void opcionesCuentaFree() {
        System.out.println("\uD83D\uDC8E Funcionalidades para Cuenta Premium");
        System.out.println("1-. Publicar sin límite de mensajes por día.");
        System.out.println("2-. Permite mensajes largos y enriquecidos");
        System.out.println("3-.Personalización avanzada del perfil");
        System.out.println("Tamaño de 500 caracteres por mensaje");

    }

    //String nombreUsuario, String email, int telefono, int edad

    protected void actualizarPerfil() {
        System.out.println("1.- Actualizar el email asocidado a la cuenta");
        System.out.println("2.- Actualizar el num de telefono asocidado a la cuenta");
        System.out.println("3.- Salir del menu");

    }
}
