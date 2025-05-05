package ejercicio1;
/*
 Atributos: numCamarotes, pasajerosPorCamarote
ii) Metodo: calcularCapacidad() devuelve el número total de pasajeros.
 */
public class BarcoPasajeros extends Barco{
    //Atributos marcados como final, ya que no necesitan getters o setters para ser modificados
    private final String numCamarotes;
    private final String pasajerosPorCamarote;

    public BarcoPasajeros(String id, String nombre, String velocidadMaxima, String numCamarotes, String pasajerosPorCamarote) {
        super(id, nombre, velocidadMaxima);
        this.numCamarotes = numCamarotes;
        this.pasajerosPorCamarote = pasajerosPorCamarote;
    }

    @Override
    public String mostrarInformacion() {
        return  "BarcoPasajeros{" + "id='" + super.getId() + '\'' +
                ", nombre='" + super.getNombre() + '\'' +
                ", velocidadMaxima='" + super.getVelocidadMaxima() + '\'' +
                " ,numCamarotes='" + numCamarotes + '\'' +
                ", pasajerosPorCamarote='" + pasajerosPorCamarote + '\'' +
                '}';
    }

    @Override
    public double calcularCapacidad() {
        //Convertimos de String a double para hacer la operación
        return Double.parseDouble(pasajerosPorCamarote) * Double.parseDouble(numCamarotes);
    }
}
