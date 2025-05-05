package ejercicio1;
/*
BarcoCarga:
i) Atributos: capacidadPorBodega, numBodegas
ii) Metodo: calcularCapacidad() devuelve la carga total.
 */
public class BarcoCarga extends Barco {
    //Atributos marcados como final, ya que no necesitan getters o setters para ser modificados
    private final String capacidadPorBodega;
   private final String numBodegas;

    public BarcoCarga(String id, String nombre, String velocidadMaxima, String capacidadPorBodega, String numBodegas) {
        super(id, nombre, velocidadMaxima);
        this.capacidadPorBodega = capacidadPorBodega;
        this.numBodegas = numBodegas;
    }

    @Override
    public String mostrarInformacion() {
        return "BarcoCarga{" +
                "id='" + super.getId() + '\'' +
                ", nombre='" + super.getNombre() + '\'' +
                ", velocidadMaxima='" + super.getVelocidadMaxima() + '\'' +
                " ,capacidadPorBodega='" + capacidadPorBodega + '\'' +
                ", numBodegas='" + numBodegas + '\'' +
                '}';
    }

    @Override
    public double calcularCapacidad() {
        return Double.parseDouble(capacidadPorBodega) * Double.parseDouble(numBodegas);
    }
}
