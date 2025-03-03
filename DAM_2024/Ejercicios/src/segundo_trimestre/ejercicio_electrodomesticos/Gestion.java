package segundo_trimestre.ejercicio_electrodomesticos;

import java.util.ArrayList;

/*
1. Crear Lavadora
   - Solicitar: Precio base, Color, Consumo energético, Peso

2. Crear Televisión
   - Solicitar: Precio base, Color, Consumo energético, Peso
   - Adicional: Resolución, Sintonizador TDT (sí/no)

3. Mostrar Precios Finales
   - Recorrer el array de 10 objetos (Lavadora y Televisión)
   - Ejecutar la funcion precioFinal() para cada objeto
   - Mostrar:
     • Suma total de Lavadoras (usando instanceof)
     • Suma total de Televisiones (usando instanceof)
     • Suma total de todos los Electrodomésticos
 */

public class Gestion {
    private final EntradaSalida es;

    public Gestion() {
        this.es = new EntradaSalida();
    }

    protected void crearLavadora(ArrayList<Electrodomestico> listaElectrodomestico) {
        Electrodomestico lavadora;
        es.mostrarMensaje("Introduzca los datos de la Lavadora a continuación: ");
        double precio = es.leerDouble("Introduzca el precio de la Lavadora");
        ColoresDisponibles color = Electrodomestico.validarColorElectrodomestico();
        ConsumoEnergetico consumo = Electrodomestico.validarLetraElectrodomestico();
        int peso = es.leerEntero("Introduzca el peso de la Lavadora");
        int carga = es.leerEntero("Introduzca la capacidad de carga de la lavadora:");

        lavadora = new Lavadora(peso, consumo, color, precio, carga);

        listaElectrodomestico.add(lavadora);
    }

    protected void crearTelevisor(ArrayList<Electrodomestico> listaElectrodomestico) {
        Electrodomestico televisor;
        es.mostrarMensaje("Introduzca los datos del televisor a continuación: ");

        int peso = es.leerEntero("Introduzca el peso de la Television");


        /*
         televisor = new Television(int peso, ConsumoEnergetico consumoEnergetico, ColoresDisponibles coloresDisponibles, double precioBase, int resolucionEnPulgadas
            , boolean incluyeSintonizador);
         */
    }

}
