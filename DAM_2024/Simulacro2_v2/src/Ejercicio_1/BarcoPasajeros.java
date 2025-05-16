package Ejercicio_1;
/*
b) BarcoPasajeros:
i) Atributos: numCamarotes, pasajerosPorCamarote
ii) Metodo: calcularCapacidad() devuelve el número total de pasajeros.
 */
//Extendemos de barco, esto convierte a barcoPasajeros en una clase hija de barco y nos obliga a sobreecribir todos sus metodos
public class BarcoPasajeros extends Barco{
    //Atributos establecidos como final, ya que no son modificados con setters y no van a cambiar durante la vida del objeto
    private final int numCamarotes;
    private final int pasajerosPorCamarote;

    //El constructor tambien le da valor a los atributos de la clase padre gracias a que los llama con el super
    public BarcoPasajeros(String nombre, String id, int velocidadMaxima, int numCamarotes, int pasajerosPorCamarote) {
        super(nombre, id, velocidadMaxima);
        this.numCamarotes = numCamarotes;
        this.pasajerosPorCamarote = pasajerosPorCamarote;
        //Verificamos que todos los valores que le pasamos al constructor sean validos, sino lanzamos la excepcion
        if (nombre == null || nombre.isEmpty() || id == null || id.isEmpty() || velocidadMaxima < 1 ||
                numCamarotes < 1 || pasajerosPorCamarote < 1) {
            throw new BarcoInvalidoException("No se permite crear un barco con valores negativos o inválidos");
        }
    }

    //No se van a utilizar setters, ya que solo vamos a pasar los datos a traves del constructor

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public int getPasajerosPorCamarote() {
        return pasajerosPorCamarote;
    }

    //Sobreescribimos los metodos mostrar informacion & calcularCapacidad

    @Override
    protected void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Id: " + getId());
        System.out.println("Velocidad: " + getVelocidadMaxima());
        System.out.println("Pasajeros: " + getPasajerosPorCamarote());
        System.out.println("Nuero de camarotes: " + getNumCamarotes());
        double pasajerosFinales = calcularCapacidad();
        System.out.println("Capacidad de pasajeros del barco: " + pasajerosFinales);
        System.out.println("--------------------------------------------------------");
    }

    @Override
    public double calcularCapacidad() {
        return numCamarotes * pasajerosPorCamarote;
    }
}
