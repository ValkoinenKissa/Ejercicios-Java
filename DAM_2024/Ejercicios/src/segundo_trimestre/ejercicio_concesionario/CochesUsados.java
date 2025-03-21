package segundo_trimestre.ejercicio_concesionario;
/*
Los coches que el concesionario vende pueden ser nuevos o usados (de segunda mano).
De los coches nuevos interesa saber el número de unidades que hay en el concesionario.

De los coches viejos interesa el número de kilómetros que lleva recorridos.
 */
public class CochesUsados extends Vehiculos {
    private int numKilometros;

    public CochesUsados() {
    }

    public CochesUsados(String matricula, String color, String marca, String modelo, int numKilometros) {
        super(matricula, color, marca, modelo);
        this.numKilometros = numKilometros;
    }

    public int getNumKilometros() {
        return numKilometros;
    }

    public void setNumKilometros(int numKilometros) {
        this.numKilometros = numKilometros;
    }

    @Override
    public String toString() {
        return super.toString() + "CochesUsados{" +
                "numKilometros=" + numKilometros +
                '}';
    }
}
