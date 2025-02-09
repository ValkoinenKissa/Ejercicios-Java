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
 */
public class Electrodomestico {
    //Constantes para valores por defecto
    protected static final ColoresDisponibles COLOR_DEFAULT = ColoresDisponibles.blanco;
    protected static final ConsumoEnergetico CONSUMO_ENERGETICO_DEFAULT = ConsumoEnergetico.F;
    protected static final double PRECIO_BASE_DEFAULT = 100.0f;
    protected static final int PESO_DEFAULT  = 5;

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
}
