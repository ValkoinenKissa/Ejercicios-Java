package Ejercicio_1;

import java.util.ArrayList;

public class Ejecutable {
    public static void main(String[] args) {
        /*
        Establecemos un arrayList de Trenes, ya que se utilizara el upcasting para almacenar
        clases hijas de la superclase Tren, esto es posible gracias al polimorfismo
         */
        ArrayList<Tren> listaTrenes = new ArrayList<>();

        /*
        Se declara un try-cath para controlar la excepcion, ya que la excepcion se puede lanzar
        cuando el constructor recibe parametros con datos invalidos, es por ello que
        instanciaremos los objetos dentro de la clausula try
         */

        try {
            //Se utiliza polimorfismo para guardar los objetos hijos de la superclase Tren en una clase Tren
            Tren tp = new TrenPasajeros("99HJ", "Iryo", 300, 10, 50);
            Tren tc = new TrenCarga("99CD", "Maresk pacific", 70, 5000, 60);
            listaTrenes.add(tp);
            listaTrenes.add(tc);
        }catch (TrenInvalidoException e){
            System.out.println("Error al crear el tren: " + e.getMessage());

        }

        /*
        Recorremos la lista de trenes y gracias al polimorfismo dinamico, java sabra identificar el objeto correcto
        y asi se aplicara el metodo correcto sobre sus atributos
         */

        //Utilizamos un for-each y volvemos a hacer uso del polimorfismo
        for (Tren tren : listaTrenes){
            tren.mostrarInformacion();
        }

    }
}
