package segundo_trimestre.ejercicio_concesionario;
/*
Los coches que el concesionario vende pueden ser nuevos o usados (de segunda mano).
De los coches nuevos interesa saber el número de unidades que hay en el concesionario.

De los coches viejos interesa el número de kilómetros que lleva recorridos.
 */
public class CochesNuevos extends Vehiculos {
    private final int numCochesEnConcesionario;

    public CochesNuevos(String matricula, String color, String marca, String modelo, int numCochesEnConcesionario) {
        super(matricula, color, marca, modelo);
        this.numCochesEnConcesionario = numCochesEnConcesionario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numCochesEnConcesionario=" + numCochesEnConcesionario +
                '}';
    }
}
