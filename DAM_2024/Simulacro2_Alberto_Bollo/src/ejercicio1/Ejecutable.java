package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/*
1.- Crea un sistema que permita gestionar diferentes tipos de vehículos
marítimos.
El sistema debe permitir registrar barcos, mostrar su información y
calcular su capacidad total de carga o pasajeros según el tipo de barco.
Debe haber una clase principal que permita realizar dichas operaciones.

a.- Clase abstracta Barco:
a) Atributos: id, nombre, velocidadMaxima
b) Metodo abstracto: mostrarInformacion()
b.- Interfaz Capacidad:
a) Metodo calcularCapacidad()
c.- Clases Hijas:
b) BarcoPasajeros:
i) Atributos: numCamarotes, pasajerosPorCamarote
ii) Metodo: calcularCapacidad() devuelve el número total de pasajeros.
c) BarcoCarga:
i) Atributos: capacidadPorBodega, numBodegas
ii) Metodo: calcularCapacidad() devuelve la carga total.
d.- Polimorfismo:
d) Usar un ArrayList de Barco para guardar los barcos y recorrerlo para
mostrarlos.
e.- Control de excepciones:
e) Crear una excepción personalizada llamada BarcoInvalidoException que se
lance si se intenta crear un barco con valores negativos o inválidos
 */
public class Ejecutable {
    //utilizo la instancia de scanner como final para acceder en toda la clase y no declararla tódo el rato
    public final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Declaracion arrayList
        ArrayList<Barco> listaBarcos = new ArrayList<>();
        //Datos barcos
        for (int i = 0; i < 2; i++) {
            System.out.println("Introduce el tipo de barco que quieres crear: ");
            System.out.println("1.- barco carga: ");
            System.out.println("2.- barco pasajeros: ");
            //Array para ir pidiendo los barcos
            int opcion;
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    crearBarcoCarga(listaBarcos);
                    break;
                case 2:
                    crearBarcoPasajeros(listaBarcos);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }

        System.out.println("Mostrando los barcos y su informacion: ");

        for (Barco barco : listaBarcos) {
            String info;
            double capacidadCarga;
            if (barco instanceof BarcoCarga) {
                info = barco.mostrarInformacion();
                capacidadCarga = barco.calcularCapacidad();
                System.out.println(info);
                System.out.println("La capacidad de carga es: " + capacidadCarga);
            }

            if (barco instanceof BarcoPasajeros) {
                info = barco.mostrarInformacion();
                capacidadCarga = barco.calcularCapacidad();
                System.out.println(info);
                System.out.println("La capacidad de pasajeros es: " + capacidadCarga);
            }
        }

    }


    protected static void comprobarDatosBarcoPasajeros(String id, String nombre, String velocidadMaxima, String numCamarotes, String
            pasajerosPorCamarote) throws BarcoInvalidoException {

        if (Double.parseDouble(velocidadMaxima) < 0 || Double.parseDouble(id) < 0 ||
                Double.parseDouble(numCamarotes) < 0 || Double.parseDouble(pasajerosPorCamarote) < 0 || nombre.isEmpty()) {

            throw new BarcoInvalidoException("Los atributos del barco no pueden estar vacios o contener datos invalidos");
        }

    }

    protected static void comprobarDatosBarcoCarga(String id, String nombre, String velocidadMaxima, String capacidadBodega, String numBodegas) throws BarcoInvalidoException {

        if (Double.parseDouble(id) < 0 ||
                Double.parseDouble(numBodegas) < 0 || Double.parseDouble(velocidadMaxima) < 0 ||
                Double.parseDouble(capacidadBodega) < 0 || nombre.isEmpty()) {

            throw new BarcoInvalidoException("Los atributos del barco no pueden estar vacios o contener datos invalidos");
        }

    }

    protected static void crearBarcoCarga(ArrayList<Barco> listaBarcos) {
        String id, nombre, velocidadMaxima, capacidadBodega, numBodegas;
        try {
            System.out.println("Introduce el id del barco: ");
            id = sc.next();
            System.out.println("Introduce el nombre del barco: ");
            nombre = sc.next();
            System.out.println("Introduce la velocidad maxima: ");
            velocidadMaxima = sc.next();
            System.out.println("Introduce el capacidad de bodega: ");
            capacidadBodega = sc.next();
            System.out.println("Introduce el num de bodegas: ");
            numBodegas = sc.next();
            comprobarDatosBarcoCarga(id, nombre, velocidadMaxima, capacidadBodega, numBodegas);
            Barco b = new BarcoCarga(id, nombre, velocidadMaxima, capacidadBodega, numBodegas);
            listaBarcos.add(b);
            System.out.println("Barco creado exitosamente");
        } catch (BarcoInvalidoException e) {
            System.out.println(e.getMessage());
        }

    }

    protected static void crearBarcoPasajeros(ArrayList<Barco> listaBarcos)  {
        String id, nombre, velocidadMaxima, numCamarotes, pasajerosPorCamarote;
        try {
            System.out.println("Introduce el id del barco: ");
            id = sc.next();
            System.out.println("Introduce el nombre del barco: ");
            nombre = sc.next();
            System.out.println("Introduce la velocidad maxima: ");
            velocidadMaxima = sc.next();
            System.out.println("Introduce el numero de camarotes: ");
            numCamarotes = sc.next();
            System.out.println("Introduce los pasajeros por camarote: ");
            pasajerosPorCamarote = sc.next();

            comprobarDatosBarcoPasajeros(id, nombre, velocidadMaxima, numCamarotes, pasajerosPorCamarote);
            Barco bp = new BarcoPasajeros(id, nombre, velocidadMaxima, numCamarotes, pasajerosPorCamarote);
            listaBarcos.add(bp);
            System.out.println("Barco creado exitosamente");
        } catch (BarcoInvalidoException e) {
            System.out.println(e.getMessage());
        }


    }


}
