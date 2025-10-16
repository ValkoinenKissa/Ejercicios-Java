package tercer_trimestre.actividad_trimestral;

import java.util.ArrayList;

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
public class Ejecutable {
    public static void main() {
        ArrayList<CuentaUsuario> listaCuentas = new ArrayList<>();
        Menu menu = new Menu();
        EntradaSalida es = new EntradaSalida();
        Gestion g = new Gestion();
        int opcion;
        System.out.println("Bienvenido a la red social, ¿Que deseeas hacer?");
        System.out.println();
        do {
            menu.imprimirMenu();
            System.out.println();
            opcion = es.leerEntero("Elije la opcion: ");
            switch (opcion) {
                case 1:
                    g.crearCuenta(listaCuentas);
                    break;
                case 2:
                    g.actualizarPerfil(listaCuentas);
                    break;
                case 3:
                    g.publicarMensaje(listaCuentas);
                    break;
                case 4:
                    g.verMensajesPublicados();
                    break;
                case 5:
                    g.verDatosUsuarios();
                    break;
                case 6:
                    System.out.println("Abandonando la aplicacion");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 6);


    }
}
