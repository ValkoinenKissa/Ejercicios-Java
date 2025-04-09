package tercer_trimestre.actividad_trimestral;
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

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Gestion {
    private final EntradaSalida es = new EntradaSalida();
    private final LecturaEscrituraFichero lecturaEscritura = new LecturaEscrituraFichero();
    private final Path rutaFicheroDatos = Paths.get("actividad_trimestral\\ficheros\\datos_usuarios.txt");
    private final Menu menu = new Menu();

    //Atributo de clase y no de instacia las constantes son siempre static
    protected static final short LIMITE_PUBLICACIONES_FREE = 5;
    protected static final short LIMITE_CARACTERES_MENSAJE_FREE = 100;
    protected static final short LIMITE_CARACTERES_MENSAJE_MENSAJE_PREMIUM = 500;


    /*
        System.out.println("1-. Crear una nueva cuenta");
        System.out.println("2-. Actualizar el perfil");
        System.out.println("4-. Publicar un mensaje");
        System.out.println("5-. Ver mensajes publicados");
        System.out.println("6-. Salir");
     */


    protected void crearCuenta() {
        int opcion;
        System.out.println("Bienvenido a la red social.");
        menu.imprimirMenuTipoCuenta();

        do {
            opcion = es.leerEntero("Elije el tipo de cuenta que deseas crear: ");

            switch (opcion) {
                case 1:
                    System.out.println("1-. Crear una cuenta estandar");
                    break;
                case 2:
                    System.out.println("2-. Crear una cuenta premium");
                    break;
                case 3:
                    comprarCuentas();
                    break;
                case 4:
                    System.out.println("Abandonando el menu...");
            }

        } while (opcion != 4);

    }

    private void crearCuentaPremium(ArrayList<CuentaUsuario> cuentas) {
        CuentaPremium cuentaPremium;
        String nombreUsuario, email, biografia;
        int telefono, edad;
        System.out.println("Has elegido crear una cuenta premium");
        try {
            System.out.println("A continuación introduce los siguientes datos: ");
            nombreUsuario = es.leerTexto("Ingrese el nombre de usuario que quieres usar: ");
            if (buscarCoincidencias(cuentas, nombreUsuario)) {
                System.out.println("El usuario que has introducido, ya se encuentra registrado en el sistema.");

            } else {
                email = es.leerTexto("Introduce el email");
                biografia = es.leerTexto("Introduce la biografia de tu perfil");
                telefono = es.leerEntero("Ingresa tu numero de telefono: ");
                if (comprobarTelefono(telefono)) {
                    System.out.println("El numero de telefono es correcto.");
                }
                edad = es.leerEntero("Ingresa el edad: ");
                if (comprobarEdad(edad)) {
                    System.out.println("La edad es correcta.");
                }

                cuentaPremium = new CuentaPremium(nombreUsuario, email, telefono, edad, biografia);
                cuentas.add(cuentaPremium);
            }


        } catch (TelefonoInvalido e) {
            System.err.println("Telefono invalido " + e.getMessage());
        } catch (EdadInvalida e) {
            System.err.println("Edad invalida " + e.getMessage());
        }
    }

    private void crearCuentaFree(ArrayList<CuentaUsuario> cuentas) {
        CuentaBasica cuentaFree;
        String nombreUsuario, email;
        int telefono, edad;
        System.out.println("Has elegido crear una cuenta free");
        try {
            System.out.println("A continuación introduce los siguientes datos: ");
            nombreUsuario = es.leerTexto("Ingrese el nombre de usuario que quieres usar: ");
            if (buscarCoincidencias(cuentas, nombreUsuario)) {
                System.out.println("El usuario que has introducido, ya se encuentra registrado en el sistema.");
            } else {
                email = es.leerTexto("Introduce el email");
                telefono = es.leerEntero("Ingresa tu numero de telefono: ");
                if (comprobarTelefono(telefono)) {
                    System.out.println("El numero de telefono es correcto.");
                }
                edad = es.leerEntero("Ingresa el edad: ");
                if (comprobarEdad(edad)) {
                    System.out.println("La edad es correcta.");
                }

                cuentaFree = new CuentaBasica(nombreUsuario, email, telefono, edad);
                cuentas.add(cuentaFree);
            }


        } catch (TelefonoInvalido e) {
            System.err.println("Telefono invalido " + e.getMessage());
        } catch (EdadInvalida e) {
            System.err.println("Edad invalida " + e.getMessage());
        }


    }

    private void comprarCuentas() {
        menu.opcionesCuentaFree();
        System.out.println();
        menu.opcionesCuentaPremium();
    }

    private boolean comprobarTelefono(int telefono) throws TelefonoInvalido {
        if (Integer.toString(telefono).length() < 10) {
            throw new TelefonoInvalido("El telefono debe de tener al menos 10 digitos.");
        }

        return true;
    }

    private boolean comprobarEdad(int edad) throws EdadInvalida {
        if (edad < 16) {
            throw new EdadInvalida("No puedes utilizar nuestro servicio si eres menor de 16 años");
        }
        return true;
    }

    private boolean buscarCoincidencias(ArrayList<CuentaUsuario> cuentas, String nombreUsuario) {
        for (CuentaUsuario cuenta : cuentas) {
            if (cuenta instanceof CuentaBasica) {
                if (cuenta.getNombreUsuario().equals(nombreUsuario)) {
                    return true;
                }
            }

            if (cuenta instanceof CuentaPremium) {
                if (cuenta.getNombreUsuario().equals(nombreUsuario)) {
                    return true;
                }
            }
        }
        return false;
    }

}
