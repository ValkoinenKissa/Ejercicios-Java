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
    protected static final ColoresDisponibles COLOR_DEFAULT = ColoresDisponibles.blanco;
    protected static final double PRECIO_BASE_DEFAULT = 100.0;

    //Atributos
    protected int peso;
    protected ConsumoEnergetico consumoEnergetico;
    protected ColoresDisponibles coloresDisponibles;
    protected double precioBase;

    //Declaracion constructores
    protected Electrodomestico() {
        this(PESO_DEFAULT, CONSUMO_ENERGETICO_DEFAULT, COLOR_DEFAULT, PRECIO_BASE_DEFAULT);


    }

    protected Electrodomestico(double precioBase, int peso) {
        this(peso, CONSUMO_ENERGETICO_DEFAULT, COLOR_DEFAULT, precioBase);
    }

    protected Electrodomestico(int peso, ConsumoEnergetico consumoEnergetico, ColoresDisponibles coloresDisponibles, double precioBase) {
        this.peso = peso;
        //Metodo para comprobar letra se convierte de enum a char para interactuar con el metodo comprobar letra consumo
        char letraEficiencia = consumoEnergetico.name().charAt(0);
        this.consumoEnergetico = comprobarLetraConsumo(letraEficiencia);
        //Metodo para comprobar color se convierte de enum a String para interactuar con el metodo comprobar color
        String colorIntroducido = coloresDisponibles.toString();
        this.coloresDisponibles = comprobarColor(colorIntroducido);
        this.precioBase = precioBase;

        precioFinal(this.consumoEnergetico.name().charAt(0), peso);

    }

    //Getters & setters


    protected double getPrecioBase() {
        return precioBase;
    }

    protected void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    protected int getPeso() {
        return peso;
    }

    protected void setPeso(int peso) {
        this.peso = peso;
    }

    protected ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    protected void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    protected ColoresDisponibles getColoresDisponibles() {
        return coloresDisponibles;
    }

    protected void setColoresDisponibles(ColoresDisponibles coloresDisponibles) {
        this.coloresDisponibles = coloresDisponibles;
    }

    //Metodo toString

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", coloresDisponibles=" + coloresDisponibles +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }

    //Metodos propios de la clase:


    //Metodo comprobar consumo, recibe char de usuario y comprueba que ese char este listado en el enum
    private ConsumoEnergetico comprobarLetraConsumo(char letraConsumo) {
        char letraBuscada = Character.toUpperCase(letraConsumo);
        for (ConsumoEnergetico letrasConsumo : ConsumoEnergetico.values()) {
            if (letrasConsumo.name().charAt(0) == letraBuscada) {
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

    protected void precioFinal(char letraConsumo, int pesoElectrodomestico) {
        //Letra precio

        switch (letraConsumo) {
            case 'A':
                this.precioBase += 100;
                break;
            case 'B':
                this.precioBase += 80;
                break;
            case 'C':
                this.precioBase += 60;
                break;
            case 'D':
                this.precioBase += 50;
                break;
            case 'E':
                this.precioBase += 30;
                break;
            case 'F':
                this.precioBase += 10;
                break;
        }

        //Tamaño precio

        if (pesoElectrodomestico > 0 && pesoElectrodomestico <= 19) {
            this.precioBase += 10;
        } else if (pesoElectrodomestico >= 20 && pesoElectrodomestico <= 49) {
            this.precioBase += 50;
        } else if (pesoElectrodomestico >= 50 && pesoElectrodomestico <= 79) {
            this.precioBase += 80;
        } else {
            this.precioBase += 100;
        }


    }
}
