package segundo_trimestre.ejercicio_electrodomesticos;

/*
Crearemos una clase llamada Electrodomestico con las siguientes características:

Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso.
Por defecto, el color sera blanco, el consumo energético sera F, el precioBase es de 100 € y
el peso de 5 kg. Usa constantes para ello.
Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre esta en mayúsculas o en minúsculas.


Los constructores que se implementaran serán
Un constructor por defecto.
Un constructor con el precio y peso. El resto por defecto.
Un constructor con todos los atributos.

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
public class Electrodomestico {
    //Constantes para valores por defecto
    protected static final ColoresDisponibles COLOR_DEFAULT = ColoresDisponibles.blanco;
    protected static final ConsumoEnergetico CONSUMO_ENERGETICO_DEFAULT = ConsumoEnergetico.F;
    protected static final double PRECIO_BASE_DEFAULT = 100.0f;
    protected static final int PESO_DEFAULT = 5;

    //Atributos
    protected ColoresDisponibles coloresDisponibles;
    protected ConsumoEnergetico consumoEnergetico;
    protected double precioBase;
    protected int peso;

    //Declaracion constructores
    public Electrodomestico() {
        this(PESO_DEFAULT, CONSUMO_ENERGETICO_DEFAULT, COLOR_DEFAULT, PRECIO_BASE_DEFAULT);


    }

    public Electrodomestico(double precioBase, int peso) {
        this(peso, CONSUMO_ENERGETICO_DEFAULT, COLOR_DEFAULT, precioBase);
    }

    public Electrodomestico(int peso, ConsumoEnergetico consumoEnergetico, ColoresDisponibles coloresDisponibles, double precioBase) {
        this.peso = peso;
        this.consumoEnergetico = consumoEnergetico;
        this.coloresDisponibles = coloresDisponibles;
        this.precioBase = precioBase;
        //Metodo para comprobar letra
        char letraEficiencia = Herramientas.introducirDatoTecladoChar();
        comprobarLetraConsumo(letraEficiencia);
        String colorIntroducido = Herramientas.introducirDatoTecladoStr();
        comprobarColor(colorIntroducido);
    }

    //Getters & setters


    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public ColoresDisponibles getColoresDisponibles() {
        return coloresDisponibles;
    }

    public void setColoresDisponibles(ColoresDisponibles coloresDisponibles) {
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
    private void comprobarLetraConsumo(char letraConsumo) {
        boolean encontrado = false;
        char letraBuscada = Character.toUpperCase(letraConsumo);
        for (ConsumoEnergetico letrasConsumo : ConsumoEnergetico.values()) {
            if (letrasConsumo.name().charAt(0) == letraBuscada) {
                this.consumoEnergetico = letrasConsumo;
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontro la letra introducida o no es correcta, se ha aplicado el valor por" +
                    " defecto");
            this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
        }
    }

    //Metodo comprobar color, funciona de forma similar al metodo comprobar letra consumo
    private void comprobarColor(String color) {
        boolean encontrado = false;
        String colorBuscado = color.toLowerCase();
        for (ColoresDisponibles colorSelected : ColoresDisponibles.values()) {
            if (colorSelected.name().equals(colorBuscado)) {
                this.coloresDisponibles = colorSelected;
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontro el color introducido o no es correcto, se ha aplicado el valor por" +
                    " defecto");
            this.coloresDisponibles = COLOR_DEFAULT;
        }

    }
}
