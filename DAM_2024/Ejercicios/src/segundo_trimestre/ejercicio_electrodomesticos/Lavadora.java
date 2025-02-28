package segundo_trimestre.ejercicio_electrodomesticos;
/*
Crearemos una subclase llamada Lavadora con las siguientes características:



Su atributo es carga, ademas de los atributos heredados.


Por defecto, la carga es de 5 kg. Usa una constante para ello.


Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el precio y peso. El resto por defecto.

Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:

funcion get de carga.

precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio.
Llama al funcion padre y añade el código necesario.
Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.

 */
public class Lavadora extends Electrodomestico {
    private static final int CARGA_DEFAULT = 5;
    //Atributo declarado como final para reforzar su inmutabilidad.
    private final int carga;

    protected Lavadora() {
        super();
        this.carga = CARGA_DEFAULT;
    }

    protected Lavadora(double precioBase, int peso) {
        super(precioBase, peso);
        this.carga = CARGA_DEFAULT;

    }

    protected Lavadora(int peso, ConsumoEnergetico consumoEnergetico, ColoresDisponibles coloresDisponibles, double precioBase, int carga) {
        super(peso, consumoEnergetico, coloresDisponibles, precioBase);
        //Al ser un enum y el metodo al requerir un char se realiza un cambio de enum a char
        this.carga = carga;
    }

    protected int getCarga() {
        return carga;
    }

    @Override
    protected void precioFinal(char letraConsumo, int pesoElectrodomestico) {
        super.precioFinal(letraConsumo, pesoElectrodomestico);
        if (this.carga > 30){
            this.precioBase += 50;
        }
    }
}
