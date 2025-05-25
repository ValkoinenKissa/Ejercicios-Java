package Ejercicio_1;


import java.util.ArrayList;

public class Ejecutable {
    public static void main(String[] args) {
        //Creamos un ArrayList de tipo barco para aprovechar el upcasting y almacenar clases hijas
        //Aunque la clase Barco sea abstracta
        ArrayList<Barco> lisaBarcos = new ArrayList<>();

        //Instanciamos dos barmos diferentes

        //Controlamos la posible excepcion que pueda lanzar el constructor, por si los parametros
        //Contienen datos invalidos

        try {
            BarcoCarga bc = new BarcoCarga(1, "Maresk Line", 30, 25, 10000);
            BarcoPasajeros bp = new BarcoPasajeros(2, "MSC", 50, 500, 4);
            //Añadimos los barcos a la lista

            lisaBarcos.add(bc);
            lisaBarcos.add(bp);

        }catch (BarcoInvalidoException e){
            System.out.println("Error al instanciar el barco: ");
        }

        //Recorremos la lista de barcos para ejecutar el metodo mostrar datos sobre ellos

        for (Barco barco : lisaBarcos){
            barco.mostrarInformacion();
        }

    }
}
