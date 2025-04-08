package tercer_trimestre.actividad_trimestral;

import java.nio.file.Path;
import java.nio.file.Paths;

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
        System.out.println("3-. Elegir modalidad de la cuenta");
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

    private void crearCuentaPremium() {
        //String nombreUsuario, String email, int telefono, int edad, String biografia
        CuentaPremium cuentaPremium;
        String nombreUsuario, email, biografia;
        int telefono, edad;
        System.out.println("Has elegido crear una cuenta premium");
        System.out.println("A continuación introduce los siguientes datos: ");
        nombreUsuario = es.leerTexto("Ingrese el nombre de usuario que quieres usar: ");
    }

    private void crearCuentaFree() {
        System.out.println("Has elegido crear una cuenta free");

    }

    private void comprarCuentas(){
        menu.opcionesCuentaFree();
        System.out.println();
        menu.opcionesCuentaPremium();
    }

}
