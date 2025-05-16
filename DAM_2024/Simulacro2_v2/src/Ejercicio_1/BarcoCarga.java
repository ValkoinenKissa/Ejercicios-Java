package Ejercicio_1;
/*
c) BarcoCarga:
i) Atributos: capacidadPorBodega, numBodegas
ii) Metodo: calcularCapacidad() devuelve la carga total.
 */

//Extendemos de barco, esto convierte a barcocarga en una clase hija de barco y nos obliga a sobreecribir todos sus metodos
public class BarcoCarga extends Barco {
    //Atributos establecidos como final, ya que no son modificados con setters y no van a cambiar durante la vida del objeto
    private final int capacidadPorBodega;
    private final int numBodegas;

    //El constructor tambien le da valor a los atributos de la clase padre gracias a que los llama con el super

    public BarcoCarga(String nombre, String id, int velocidadMaxima, int capacidadPorBodega, int numBodegas) throws BarcoInvalidoException {
        super(nombre, id, velocidadMaxima);
        this.capacidadPorBodega = capacidadPorBodega;
        this.numBodegas = numBodegas;
        //Verificamos que todos los valores que le pasamos al constructor sean validos, sino lanzamos la excepcion
        if (nombre == null || nombre.isEmpty() || id == null || id.isEmpty() || velocidadMaxima < 1 ||
                capacidadPorBodega < 1 || numBodegas < 1) {
            throw new BarcoInvalidoException("No se permite crear un barco con valores negativos o inválidos");
        }
    }

    //No se van a utilizar setters, ya que solo vamos a pasar los datos a traves del constructor

    public int getCapacidadPorBodega() {
        return capacidadPorBodega;
    }

    public int getNumBodegas() {
        return numBodegas;
    }

    @Override
    protected void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Id: " + getId());
        System.out.println("Velocidad: " + getVelocidadMaxima());
        System.out.println("Capacidad por bodega: " + getCapacidadPorBodega());
        System.out.println("Num de bodegas: " + getNumBodegas());
        double capacidadTotal = calcularCapacidad();
        System.out.println("Capacidad total de carga: " + capacidadTotal);
        System.out.println("--------------------------------------------------------");

    }

    @Override
    public double calcularCapacidad() {
        return capacidadPorBodega * numBodegas;
    }
}
