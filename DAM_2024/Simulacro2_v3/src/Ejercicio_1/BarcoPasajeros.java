package Ejercicio_1;

public class BarcoPasajeros extends Barco {
    private final int numCamarotes;
    private final int pasajerosPorCamarote;

    //Se hace que el constructor lanze una excepcion si tiene valores invalidos
    public BarcoPasajeros(int id, String nombre, double veloidadMaxima, int numCamarotes, int pasajerosPorCamarote)
            throws BarcoInvalidoException {
        super(id, nombre, veloidadMaxima);
        this.numCamarotes = numCamarotes;
        this.pasajerosPorCamarote = pasajerosPorCamarote;

        //Validacion de atributos de clase
        if (id < 1 || nombre == null || veloidadMaxima < 1 || numCamarotes < 1 || pasajerosPorCamarote < 1 ){
            throw new BarcoInvalidoException("El barco de pasajeros no puede contener valores negativos, menores de 1 " +
                    " o nulos");
        }
    }


    @Override
    public int calcularCapacidad() {
        return numCamarotes * pasajerosPorCamarote;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("El nombre del barco es: " + super.getNombre());
        System.out.println("La velocidad maxima es: " + super.getVeloidadMaxima());
        System.out.println("El numero de camarotes es de: " + numCamarotes);
        System.out.println("La cantidad de pasajeros por camarote es de: " + pasajerosPorCamarote);
        System.out.println("La capacidad total de pasajeros es de: " + calcularCapacidad());
        System.out.println("--------------------------------------------------------");


    }
}