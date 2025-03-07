package segundo_trimestre.ejercicio_electrodomesticos;

/*
Crearemos una clase llamada Electrodomestico con las siguientes características:

Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso.
Por defecto, el color sera blanco, el consumo energético sera F, el precioBase es de 100 € y el peso de 5 kg.
Usa constantes para ello.

Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre esta en mayúsculas o en minúsculas.
Los constructores que se implementaran serán
Un constructor por defecto.

Un constructor con el precio y peso. El resto por defecto.
Un constructor con todos los atributos.

Los métodos que implementara serán:
Métodos get de todos los atributos.

comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra por defecto.
Se invocara al crear el objeto y no sera visible.
comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por defecto.
Se invocara al crear el objeto y no sera visible.
precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista de precios:
Letra	Precio
A	100 €
B	80 €
C	60 €
D	50 €
E	30 €
F	10 €
Tamaño	Precio
Entre 0 y 19 kg	10 €
Entre 20 y 49 kg	50 €
Entre 50 y 79 kg	80 €
Mayor que 80 kg	100 €
 */
public abstract class Electrodomestico {
    //Constantes para valores por defecto
    protected static final int PESO_DEFAULT = 5;
    protected static final ConsumoEnergetico CONSUMO_ENERGETICO_DEFAULT = ConsumoEnergetico.F;
    protected static final ColoresDisponibles COLOR_DEFAULT = ColoresDisponibles.BLANCO;
    protected static final double PRECIO_BASE_DEFAULT = 100.0;

    //Atributos
    protected int peso;
    protected ConsumoEnergetico consumoEnergetico;
    protected ColoresDisponibles coloresDisponibles;
    protected double precioBase;
    /*
    Una vez asignado el objeto Scanner en el constructor, la referencia no puede cambiar.
    Por ello se utiliza final para garantizar que la variable «es» apunte siempre al mismo objeto
    durante la vida del objeto EntradaSalida, evitando que se re-asigne accidentalmente y
    asegurando una mayor consistencia y seguridad en la lectura de datos.
     */
    private static final EntradaSalida es = new EntradaSalida();

    //Declaracion constructores
    protected Electrodomestico() {
        this(PESO_DEFAULT, CONSUMO_ENERGETICO_DEFAULT, COLOR_DEFAULT, PRECIO_BASE_DEFAULT);


    }

    protected Electrodomestico(double precioBase, int peso) {
        this(peso, CONSUMO_ENERGETICO_DEFAULT, COLOR_DEFAULT, precioBase);
    }

    protected Electrodomestico(int peso, ConsumoEnergetico consumoEnergetico, ColoresDisponibles coloresDisponibles, double precioBase) {
        this.peso = peso;
        this.consumoEnergetico = comprobarLetraConsumo(consumoEnergetico);
        //Metodo para comprobar color se convierte de enum a String para interactuar con el metodo comprobar color
        String colorIntroducido = coloresDisponibles.toString();
        this.coloresDisponibles = comprobarColor(colorIntroducido);
        this.precioBase = precioBase;

        precioFinal(this.consumoEnergetico, peso);

    }

    //Getters & setters

    protected int getPeso() {
        return peso;
    }

    protected ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    //Metodo toString

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", coloresDisponibles=" + coloresDisponibles +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso ;
    }

    //Metodos propios de la clase:


    //Metodo comprobar consumo, recibe enum consumo y comprueba que el mismo este listado en el enum
    private ConsumoEnergetico comprobarLetraConsumo(ConsumoEnergetico letraConsumo) {
        for (ConsumoEnergetico letrasConsumo : ConsumoEnergetico.values()) {
            if (letrasConsumo == letraConsumo) {
                return letrasConsumo;
            }
        }

        System.out.println("Letra de consumo no válida. Se asigna el valor por defecto: " + CONSUMO_ENERGETICO_DEFAULT);


        return CONSUMO_ENERGETICO_DEFAULT;

    }

    //Metodo comprobar color, funciona de forma similar al metodo comprobar letra consumo
    private ColoresDisponibles comprobarColor(String color) {
        String colorBuscado = color.toLowerCase();
        for (ColoresDisponibles colorSelected : ColoresDisponibles.values()) {
            if (colorSelected.name().equals(colorBuscado)) {
                return colorSelected;
            }
        }

        return COLOR_DEFAULT;

    }

    protected double precioFinal(ConsumoEnergetico letraConsumo, int pesoElectrodomestico) {
        //Letra precio

        double precioFinal = this.precioBase;

        switch (letraConsumo) {
            case ConsumoEnergetico.A:
                precioFinal += 100;
                break;
            case ConsumoEnergetico.B:
                precioFinal += 80;
                break;
            case ConsumoEnergetico.C:
                precioFinal += 60;
                break;
            case ConsumoEnergetico.D:
                precioFinal += 50;
                break;
            case ConsumoEnergetico.E:
                precioFinal += 30;
                break;
            case ConsumoEnergetico.F:
                precioFinal += 10;
                break;
        }

        //Tamaño precio

        if (pesoElectrodomestico > 0 && pesoElectrodomestico <= 19) {
            precioFinal += 10;
        } else if (pesoElectrodomestico >= 20 && pesoElectrodomestico <= 49) {
            precioFinal += 50;
        } else if (pesoElectrodomestico >= 50 && pesoElectrodomestico <= 79) {
            precioFinal += 80;
        } else {
            precioFinal += 100;
        }


        return precioFinal;
    }

    //Validacion color electrodomestico

    protected static ColoresDisponibles validarColorElectrodomestico() {
        ColoresDisponibles color = null;
        // Mostrar opciones disponibles
        System.out.println("Seleccione un color:");
        for (ColoresDisponibles c : ColoresDisponibles.values()) {
            System.out.println("- " + c);
        }

        do {

            /*
            BLANCO, NEGRO, ROJO, AZUL, GRIS
             */

            String opcionIntroducida = es.leerTexto("Introduce la color del electrodomestico:").toUpperCase();

            switch (opcionIntroducida) {
                case "BLANCO":
                    color = ColoresDisponibles.BLANCO;
                    break;
                case "NEGRO":
                    color = ColoresDisponibles.NEGRO;
                    break;
                case "ROJO":
                    color = ColoresDisponibles.ROJO;
                    break;
                case "AZUL":
                    color = ColoresDisponibles.AZUL;
                    break;
                case "GRIS":
                    color = ColoresDisponibles.GRIS;
                    break;
                default:
                    System.out.println("El color no existe, prueba de nuevo");
            }

        } while (color == null);

        return color;
    }

    //Validacion consumos energeticos
    protected static ConsumoEnergetico validarLetraElectrodomestico() {
        ConsumoEnergetico consumo = null;
        // Mostrar opciones disponibles
        System.out.println("Seleccione un consumo:");
        for (ConsumoEnergetico c : ConsumoEnergetico.values()) {
            System.out.println("- " + c);
        }

        do {

            /*
            A, B, C, D, E, F
             */

            String opcionIntroducida = es.leerTexto("Introduce la letra del consumo:").toUpperCase();

            switch (opcionIntroducida) {
                case "A":
                    consumo = ConsumoEnergetico.A;
                    break;
                case "B":
                    consumo = ConsumoEnergetico.B;
                    break;
                case "C":
                    consumo = ConsumoEnergetico.C;
                    break;
                case "D":
                    consumo = ConsumoEnergetico.D;
                    break;
                case "E":
                    consumo = ConsumoEnergetico.E;
                    break;
                case "F":
                    consumo = ConsumoEnergetico.F;
                    break;
                default:
                    System.out.println("La letra no existe, prueba de nuevo");
            }

        } while (consumo == null);

        return consumo;
    }

}
