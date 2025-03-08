package segundo_trimestre.pruebas.colecciones_de_datos;

import java.util.*;

public class EjmeploArrayList {
    public static void main(String[] args) {
        List<Integer>  listaArrayList = new ArrayList<>();
        long tiempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listaArrayList.add(i);
        }
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("Tiempo empleado por ArrayList: " + (tiempoFinal - tiempoInicial));

        List<Integer> listaLinked = new LinkedList<>();
        tiempoInicial= System.currentTimeMillis();
        for (int i= 0; i < 1_000_000; i++) {
            listaLinked.add(i);
        }
        tiempoFinal = System.currentTimeMillis();
        System.out.println("Tiempo empleado por Linkedlist: " + (tiempoFinal - tiempoInicial));

        List<Integer> listaVector = new Vector<>();
        tiempoInicial= System.currentTimeMillis();
        for (int i= 0; i < 1_000_000; i++) {
            listaVector.add(i);
        }
        tiempoFinal = System.currentTimeMillis();
        System.out.println("Tiempo empleado por Lista vector: " + (tiempoFinal - tiempoInicial));

    }
}
