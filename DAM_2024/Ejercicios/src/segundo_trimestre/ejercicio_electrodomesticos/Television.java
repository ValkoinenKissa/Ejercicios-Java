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


Ahora crea una clase ejecutable que realice lo siguiente:

Crea un array de Electrodomesticos de 10 posiciones.
Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
Ahora, recorre este array y ejecuta el funcion precioFinal().
Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras
por otro y la suma de los Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda que Television y
Lavadora también son electrodomésticos). Recuerda el uso operador instanceof.
Por ejemplo, si tenemos un Electrodomestico con un precio final de 300, una lavadora de 200 y una televisión de 500,
el resultado final sera de 1000 (300+200+500) para electrodomésticos, 200 para lavadora y 500 para televisión.

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
    protected void precioFinal(char letraConsumo, int pesoElectrodomestico) {
        super.precioFinal(letraConsumo, pesoElectrodomestico);
        if (this.resolucionEnPulgadas > 40) {
            this.precioBase += this.precioBase * 0.30;

        }

        if (this.incluyeSintonizador) {
            this.precioBase += 50;
        }
    }

//Heredar metodo precioFinal
}
