package Ejercicio_1;

import java.util.ArrayList;

/*
1.- Crea un sistema que permita gestionar diferentes tipos de vehículos
marítimos.
El sistema debe permitir registrar barcos, mostrar su información y
calcular su capacidad total de carga o pasajeros según el tipo de barco.
Debe haber una clase principal que permita realizar dichas operaciones.
Requisitos: (3.5 puntos)


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
lance si se intenta crear un barco con valores negativos o inválidos.
 */
public class Ejecutable {
    public static void main(String[] args) {
        /*
        Utilizamos el upcasting para almacenar clases hijas que heredan de barco, por eso no necesitamos crear diferentes
        ArrayList para cada clase de barco
         */
        ArrayList<Barco> list = new ArrayList<>();

        try {
            //Instanciamos los objetos y los añadimos al ArrayList
            BarcoCarga bc = new BarcoCarga("Maresk", "BGG4", 35, 500, 25);
            BarcoPasajeros bp = new BarcoPasajeros("MSC", "H5568", 55, 800, 4);
            list.add(bc);
            list.add(bp);

            //Gracias al polimorfismo y al tener los mismos metodos en las clases hijas podemos abstenernos de utilizar el instanceof
            for (Barco barco : list) {
                barco.mostrarInformacion();
            }

            //Capturamos la excepcion

        } catch (BarcoInvalidoException e) {
            System.out.println("No se han podido isntanciar los barcos: " + e.getMessage());
        }


    }
}
