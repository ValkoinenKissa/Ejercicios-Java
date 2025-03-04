package segundo_trimestre.ejercicio_electrodomesticos;

/*
Crearemos una subclase llamada Television con las siguientes características:

Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), ademas de los atributos heredados.
Por defecto, la resolución sera de 20 pulgadas y el sintonizador sera false.

Los constructores que se implementaran serán:
Un constructor por defecto.


Un constructor con el precio y peso. El resto por defecto.


Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados.
Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
funcion get de resolución y sintonizador TDT.


precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30%
y si tiene un sintonizador TDT incorporado, aumentara 50 €.
Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.

 */
public class Television extends Electrodomestico {
    //Atributos estaticos por defecto
    protected static final int RESOLUCION_DEFAULT = 20;
    protected static final boolean SINTONIZADOR_DEFAULT = false;

    //Atributos
    //Atributos declarados como final para reforzar su inmutabilidad.
    private final int resolucionEnPulgadas;
    private final boolean incluyeSintonizador;

    //Contructores


    protected Television() {
        super();
        this.resolucionEnPulgadas = RESOLUCION_DEFAULT;
        this.incluyeSintonizador = SINTONIZADOR_DEFAULT;
    }

    protected Television(double precioBase, int peso) {
        super(precioBase, peso);
        this.resolucionEnPulgadas = RESOLUCION_DEFAULT;
        this.incluyeSintonizador = SINTONIZADOR_DEFAULT;
    }

    protected Television(int peso, ConsumoEnergetico consumoEnergetico, ColoresDisponibles coloresDisponibles, double precioBase, int resolucionEnPulgadas
            , boolean incluyeSintonizador) {
        super(peso, consumoEnergetico, coloresDisponibles, precioBase);
        this.resolucionEnPulgadas = resolucionEnPulgadas;
        this.incluyeSintonizador = incluyeSintonizador;

    }

    public int getResolucionEnPulgadas() {
        return resolucionEnPulgadas;
    }

    public boolean isIncluyeSintonizador() {
        return incluyeSintonizador;
    }

    @Override
    protected double precioFinal(ConsumoEnergetico letraConsumo, int pesoElectrodomestico) {
        super.precioFinal(letraConsumo, pesoElectrodomestico);
        double precioFinal = this.precioBase;
        if (this.resolucionEnPulgadas > 40) {
            precioFinal += precioFinal * 0.30;

        }

        if (this.incluyeSintonizador) {
            precioFinal += 50;
        }
        return precioFinal;
    }
}
