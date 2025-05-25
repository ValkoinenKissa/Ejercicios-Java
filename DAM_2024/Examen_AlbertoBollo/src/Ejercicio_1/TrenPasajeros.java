package Ejercicio_1;

//Se especifica que la clase hereda de tren mediante extends
public class TrenPasajeros extends Tren {
    //Atributos marcados como final, ya que no necesitamos setters para volver a modificarlos despues de su instanciacion
    private final int numVagones;
    private final int pasajerosPorVagon;

    /*
    Se indica que el constructor del TrenPasajeros puede lanzar una excepcion de TrenInvalido, ya que realizare la
    comprobacion de que todos los atrbutos sean validos dentro del constructor y si los atributos son invalidos
    se acabara lanzando dicha excepcion
     */
    public TrenPasajeros(String id, String nombre, double velocidadMaxima, int numVagones, int pasajerosPorVagon)
            throws TrenInvalidoException {
        //Se llama al constructor de la superclase mediante .super para inicializar sus atributos
        super(id, nombre, velocidadMaxima);
        this.numVagones = numVagones;
        this.pasajerosPorVagon = pasajerosPorVagon;

        if (id == null || nombre == null || velocidadMaxima < 1 || numVagones < 1 || pasajerosPorVagon < 1) {
            //Se lanza la excepcion con su correspondiente mensaje personalizado para informar mejor al usuario
            throw new TrenInvalidoException("Los atributos del Tren de pasajeros no pueden contener datos invalidos" +
                    " o nulos, como por ejemplo un nombre o id vacio o valores inferiores a 1.");
        }
    }

    //Sobreecribimos los metodos abstractos de la superclase

    @Override
    public void mostrarInformacion() {
        System.out.println("El id del Tren es: " + super.getId());
        System.out.println("El nombre del Tren es: " + super.getNombre());
        System.out.println("La velocidad maxima del Tren es: " + super.getVelocidadMaxima() + "KM/H");
        System.out.println("Numero de vagones que forman el tren: " + numVagones);
        System.out.println("Numero de pasajeros por vagon: " + pasajerosPorVagon);
        System.out.println("La capacidad total de pasajeros del tren es de: " + calcularCapacidad() + " personas");
        System.out.println("---------------------------------------------------------------------------------------");

    }

    @Override
    public double calcularCapacidad() {
        return pasajerosPorVagon * numVagones;
    }
}
