package segundo_trimestre.ejercicio_electrodomesticos;

import java.util.ArrayList;

public class Ejecutable {
    /*
        Ahora crea una clase ejecutable que realice lo siguiente:

        Crea un array de Electrodomesticos de 10 posiciones.
        Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
        Ahora, recorre este array y ejecuta el funcion precioFinal().
        Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras
        por otro y la suma de los Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda que Television y
        Lavadora también son electrodomésticos). Recuerda el uso operador instanceof.

        Por ejemplo, si tenemos un Electrodomestico con un precio final de 300, una lavadora de 200 y una televisión de 500,
        el resultado final sera de 1000 (300+200+500) para electrodomésticos, 200 para lavadora y 500 para televisión.
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> listaElectrodomestico = new ArrayList<>(10);
        Menu menu = new Menu();
        Gestion g = new Gestion();
        int opcion;
        do {
            opcion = menu.mostrarMenu();
            switch (opcion) {
                case 1:
                    g.crearLavadora(listaElectrodomestico);
                    break;
                case 2:
                    g.crearTelevisor(listaElectrodomestico);
                    break;
                case 3:
                    g.mostrarPreciosFinales(listaElectrodomestico);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (opcion != 4);


    }
}
