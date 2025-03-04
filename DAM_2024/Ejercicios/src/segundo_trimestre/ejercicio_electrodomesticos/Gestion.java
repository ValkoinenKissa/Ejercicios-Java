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

    Menu menu = new Menu();

    protected void crearLavadora(ArrayList<Electrodomestico> listaElectrodomestico) {
        int opcion;
        double precio;
        int carga;
        int peso;

        if (listaElectrodomestico.size() < 10) {
            Lavadora lavadora;
            opcion = menu.mostrarMenuLavadora();
            switch (opcion) {
                case 1:
                    lavadora = new Lavadora();
                    listaElectrodomestico.add(lavadora);
                    System.out.println("Se ha creado correctamente la lavadora, mostrando detalles...");
                    System.out.println(lavadora);
                    break;

                case 2:
                    es.mostrarMensaje("Introduzca los datos de la Lavadora a continuación: ");
                    precio = es.leerDouble("Introduzca el precio de la Lavadora: ");
                    peso = es.leerEntero("Introduzca el peso de la Lavadora: ");
                    lavadora = new Lavadora(precio, peso);
                    listaElectrodomestico.add(lavadora);
                    System.out.println("Se ha creado correctamente la lavadora, mostrando detalles...");
                    System.out.println(lavadora);
                    break;
                case 3:
                    es.mostrarMensaje("Introduzca los datos de la Lavadora a continuación: ");
                    precio = es.leerDouble("Introduzca el precio de la Lavadora: ");
                    ColoresDisponibles color = Electrodomestico.validarColorElectrodomestico();
                    ConsumoEnergetico consumo = Electrodomestico.validarLetraElectrodomestico();
                    peso = es.leerEntero("Introduzca el peso de la Lavadora: ");
                    carga = es.leerEntero("Introduzca la capacidad de carga de la lavadora:");
                    lavadora = new Lavadora(peso, consumo, color, precio, carga);
                    listaElectrodomestico.add(lavadora);
                    System.out.println("Se ha creado correctamente la lavadora, mostrando detalles...");
                    System.out.println(lavadora);
                    break;
            }
        } else {
            System.out.println("No se pueden añadir mas de 10 electrodomesticos al sistema");

        }

    }

    protected void crearTelevisor(ArrayList<Electrodomestico> listaElectrodomestico) {
        int peso, opcion;
        double precio;
        int resolucionPulgadas;
        boolean incluyeSintonizador;

        //Controlar que solo se puedan añadir 10 electrodomesticos
        if (listaElectrodomestico.size() < 10) {
            Television televisor;
            opcion = menu.mostrarMenuTelevisor();
            switch (opcion) {
                case 1:
                    televisor = new Television();
                    System.out.println("Se ha creado correctamente el televisor, mostrando detalles...");
                    listaElectrodomestico.add(televisor);
                    break;
                case 2:
                    es.mostrarMensaje("Introduzca los datos del televisor a continuación: ");
                    precio = es.leerDouble("Introduzca el precio del televisor: ");
                    peso = es.leerEntero("Introduzca el peso del televisor: ");
                    televisor = new Television(precio, peso);
                    listaElectrodomestico.add(televisor);
                    System.out.println("Se ha creado correctamente el televisor, mostrando detalles...");
                    System.out.println(televisor);
                    break;

                case 3:
                    es.mostrarMensaje("Introduzca los datos del televisor a continuación: ");
                    peso = es.leerEntero("Introduzca el peso de la Television: ");
                    ConsumoEnergetico consumo = Electrodomestico.validarLetraElectrodomestico();
                    ColoresDisponibles color = Electrodomestico.validarColorElectrodomestico();
                    precio = es.leerDouble("Introduzca el precio del televisor: ");
                    resolucionPulgadas = es.leerEntero("Introduzca el resolucion en pulgadas del televisor: ");
                    incluyeSintonizador = es.leerBoolean("Incluye sintonizador? (Introduce solo true o false)");
                    televisor = new Television(peso, consumo, color, precio, resolucionPulgadas, incluyeSintonizador);
                    listaElectrodomestico.add(televisor);
                    System.out.println("Se ha creado correctamente el televisor, mostrando detalles...");
                    System.out.println(televisor);
                    break;
            }

        } else {
            System.out.println("No se pueden añadir mas de 10 electrodomesticos al sistema");
        }
    }

    protected void mostrarPreciosFinales(ArrayList<Electrodomestico> listaElectrodomestico) {
        ConsumoEnergetico consumo;
        double acumuladorLavadora = 0.0;
        double acumuladorTelevisor = 0.0;
        double totalElectrodomesticos;
        int peso;
        for (Electrodomestico e : listaElectrodomestico) {
            if (e instanceof Lavadora) {
                consumo = e.getConsumoEnergetico();
                peso = e.getPeso();
                acumuladorLavadora += e.precioFinal(consumo, peso);
            }

            if (e instanceof Television) {
                consumo = e.getConsumoEnergetico();
                peso = e.getPeso();
                acumuladorTelevisor += e.precioFinal(consumo, peso);
            }
        }

        es.mostrarMensaje("El precio total de todas las lavadoras es de: " + acumuladorLavadora);
        es.mostrarMensaje("El precio total de todos las televisores es de: " + acumuladorTelevisor);
        totalElectrodomesticos = (acumuladorLavadora + acumuladorTelevisor);
        es.mostrarMensaje("Y el precio total de todos los electrodomesticos es de: " + totalElectrodomesticos);
    }

}
