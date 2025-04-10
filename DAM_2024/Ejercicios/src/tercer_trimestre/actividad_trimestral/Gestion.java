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

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Gestion {
    //Atributos de clase definidos como final, ya que carecen de metodos getter and setter y ademas se evita el cambio accidental de los mismos
    private final EntradaSalida es = new EntradaSalida();
    private final LecturaEscrituraFichero lecturaEscritura = new LecturaEscrituraFichero();
    private final Path rutaFicheroMensajes = Paths.get("actividad_trimestral\\ficheros\\mensajes_usuarios.txt");
    private final Path rutaFicheroDatos = Paths.get("actividad_trimestral\\ficheros\\datos_usuarios.txt");
    private final Menu menu = new Menu();

    //Atributo de clase y no de instacia las constantes son siempre static
    protected static final short LIMITE_PUBLICACIONES_FREE = 5;
    protected static final short LIMITE_CARACTERES_MENSAJE_FREE = 100;
    protected static final short LIMITE_CARACTERES_MENSAJE_MENSAJE_PREMIUM = 500;

    public Gestion() {
    }

    protected void crearCuenta(ArrayList<CuentaUsuario> listaCuentas) {
        int opcion;
        do {
            System.out.println();
            menu.imprimirMenuTipoCuenta();
            opcion = es.leerEntero("Elije la opcion que desees ejecutar: \n");

            switch (opcion) {
                case 1:
                    crearCuentaFree(listaCuentas);
                    break;
                case 2:
                    crearCuentaPremium(listaCuentas);
                    break;
                case 3:
                    compararCuentas();
                    break;
                case 4:
                    System.out.println("Abandonando el menu...");
            }

        } while (opcion != 4);

    }

    protected void actualizarPerfil(ArrayList<CuentaUsuario> cuentas) {
        String nombreUsuario;
        String email, telefono;
        nombreUsuario = es.leerTexto("Introduce tu nombre de usuario para localizar tu cuenta: ");
        //Utilizacion de polimorfismo, la variable de tipo CuentaUsuario almacena la instancia, sea de cuentaBasica o premium
        CuentaUsuario cuentaLocalizada = buscarCuenta(cuentas, nombreUsuario);
        if (cuentaLocalizada == null) {
            System.out.println("No existe ninguna cuenta asociada al nombre de usuario: " + nombreUsuario);
            return;
        }
        try {
            email = es.leerTexto("Introduce el nuevo email de tu cuenta: ");
            telefono = es.leerTexto("Introduce el nuevo telefono de tu cuenta: ");
            if (comprobarTelefono(telefono)) {
                System.out.println("El telefono es correcto.");
            }
            /*Si la instancia localizada implementa la interfaz operacionesCuenta, se utiliza una pattern variable
             * para asi evitar el casting manual y llamar al metodo desde esta nueva variable cuentaOperable */
            if (cuentaLocalizada instanceof OperacionesCuenta cuentaOperable) {
                cuentaOperable.actualizarPerfil(email, telefono);
                System.out.println("El usuario se ha actualizado correctamente.");
            }

        } catch (TelefonoInvalido e) {
            System.err.println("El telefono no es correcto: " + e.getMessage());
        }

    }

    protected void publicarMensaje(ArrayList<CuentaUsuario> cuentas) {
        String nombreUsuario, mensaje, mensajeTimeStampUsuario, publicacionFinal;
        nombreUsuario = es.leerTexto("Introduce tu nombre de usuario para publicar el mensaje: ");
        CuentaUsuario cuentaLocalizada = buscarCuenta(cuentas, nombreUsuario);

        if (cuentaLocalizada == null) {
            System.out.println("No existe ninguna cuenta asociada al nombre de usuario: " + nombreUsuario);
            return;
        }

        if (cuentaLocalizada instanceof CuentaBasica cuentaOperable) {
            es.limpiarEntrada();
            mensaje = es.leerCadenaTexto("Introduce el mensaje que quieres publicar:");
            if (mensaje.length() > LIMITE_CARACTERES_MENSAJE_FREE) {
                System.out.println("El mensaje contiene mas de los 100 carcateres permitidos para las cuentas free.");
                return;
            } else {
                try {
                    mensajeTimeStampUsuario = cuentaOperable.publicarMensaje(mensaje);
                    if (cuentaOperable.getContadorPublicaciones() < LIMITE_PUBLICACIONES_FREE) {
                        publicacionFinal = "Usuario --> " + nombreUsuario + " Fecha del mensaje --> " + mensajeTimeStampUsuario;
                        es.mostrarMensaje("Se ha publicado el mensaje: " + publicacionFinal);
                        lecturaEscritura.escribirFichero(rutaFicheroMensajes, publicacionFinal);
                    } else {
                        System.out.println("Has alcanzado el limite de publicaciones para tu cuenta gratuita.");
                    }
                } catch (IOException e) {
                    System.err.println("Error al crear el fichero de mensajes: " + e.getMessage());
                }

            }

        }

        if (cuentaLocalizada instanceof CuentaPremium cuentaOperable) {
            es.limpiarEntrada();
            mensaje = es.leerCadenaTexto("Introduce el mensaje que quieres publicar:");
            if (mensaje.length() > LIMITE_CARACTERES_MENSAJE_MENSAJE_PREMIUM) {
                System.out.println("El mensaje contiene mas de los 500 carcateres permitidos para las cuentas premium.");
            } else {
                try {
                    mensajeTimeStampUsuario = cuentaOperable.publicarMensaje(mensaje);
                    publicacionFinal = "Usuario --> " + nombreUsuario + " Fecha del mensaje --> " + mensajeTimeStampUsuario;
                    es.mostrarMensaje("Se ha publicado el mensaje: " + publicacionFinal);
                    lecturaEscritura.escribirFichero(rutaFicheroMensajes, publicacionFinal);
                } catch (IOException e) {
                    System.out.println("Error al crear el fichero: " + e.getMessage());
                }

            }

        }

    }

    protected void verMensajesPublicados() {
        System.out.println("Mostrando todos los mensajes publicados: ");
        lecturaEscritura.leerFichero(rutaFicheroMensajes);
    }

    private void crearCuentaPremium(ArrayList<CuentaUsuario> cuentas) {
        CuentaPremium cuentaPremium;
        String nombreUsuario, email, biografia, telefono;
        int edad;
        System.out.println("Has elegido crear una cuenta premium");
        try {
            System.out.println("A continuación introduce los siguientes datos");
            nombreUsuario = es.leerTexto("Ingrese el nombre de usuario que quieres usar: ");
            if (buscarCoincidencias(cuentas, nombreUsuario)) {
                System.out.println("El usuario que has introducido, ya se encuentra registrado en el sistema.");

            } else {
                email = es.leerTexto("Introduce el email: ");
                biografia = es.leerTexto("Introduce la biografia de tu perfil: ");
                telefono = es.leerTexto("Ingresa tu numero de telefono: ");
                if (comprobarTelefono(telefono)) {
                    System.out.println("El numero de telefono es correcto.");
                }
                edad = es.leerEntero("Ingresa el edad: ");
                if (comprobarEdad(edad)) {
                    System.out.println("La edad es correcta.");
                }

                cuentaPremium = new CuentaPremium(nombreUsuario, email, telefono, edad, biografia);
                cuentas.add(cuentaPremium);
                System.out.println("Cuenta creada correctamente");
            }


        } catch (TelefonoInvalido e) {
            System.err.println("Telefono invalido " + e.getMessage());
        } catch (EdadInvalida e) {
            System.err.println("Edad invalida " + e.getMessage());
        }
    }

    private void crearCuentaFree(ArrayList<CuentaUsuario> cuentas) {
        CuentaBasica cuentaFree;
        String nombreUsuario, email, telefono;
        int edad;
        System.out.println("Has elegido crear una cuenta free");
        try {
            System.out.println("A continuación introduce los siguientes datos");
            nombreUsuario = es.leerTexto("Ingrese el nombre de usuario que quieres usar: ");
            if (buscarCoincidencias(cuentas, nombreUsuario)) {
                System.out.println("El usuario que has introducido, ya se encuentra registrado en el sistema.");
            } else {
                email = es.leerTexto("Introduce el email: ");
                telefono = es.leerTexto("Ingresa tu numero de telefono: ");
                if (comprobarTelefono(telefono)) {
                    System.out.println("El numero de telefono es correcto.");
                }
                edad = es.leerEntero("Ingresa la edad: ");
                if (comprobarEdad(edad)) {
                    System.out.println("La edad es correcta.");
                }

                cuentaFree = new CuentaBasica(nombreUsuario, email, telefono, edad);
                cuentas.add(cuentaFree);
                System.out.println("Cuenta creada correctamente");
            }


        } catch (TelefonoInvalido e) {
            System.err.println("Telefono invalido " + e.getMessage());
        } catch (EdadInvalida e) {
            System.err.println("Edad invalida " + e.getMessage());
        }


    }

    private void compararCuentas() {
        menu.opcionesCuentaFree();
        System.out.println();
        menu.opcionesCuentaPremium();
    }

    private boolean comprobarTelefono(String telefono) throws TelefonoInvalido {
        if (telefono.length() < 10) {
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

    //Metodo para verificar si esxiste una cuenta
    private boolean buscarCoincidencias(ArrayList<CuentaUsuario> cuentas, String nombreUsuario) {
        for (CuentaUsuario cuenta : cuentas) {
            if (cuenta instanceof CuentaBasica) {
                if (cuenta.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                    return true;
                }
            }

            if (cuenta instanceof CuentaPremium) {
                if (cuenta.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                    return true;
                }
            }
        }
        return false;
    }

    //Metodo para buscar una cuenta y retornarla para aplicarle metodos
    private CuentaUsuario buscarCuenta(ArrayList<CuentaUsuario> cuentas, String nombreUsuario) {
        for (CuentaUsuario cuenta : cuentas) {
            if (cuenta.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                return cuenta;
            }
        }

        return null;
    }

}
