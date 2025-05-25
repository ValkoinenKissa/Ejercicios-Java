package Ejercicio_1;

public class BarcoCarga extends Barco{
    private final int numBodegas;
    private final int capacidadPorBodega;

    //Se hace que el constructor lanze una excepcion si tiene valores invalidos
    public BarcoCarga(int id, String nombre, double veloidadMaxima, int numBodegas, int capacidadPorBodega) {
        super(id, nombre, veloidadMaxima);
        this.numBodegas = numBodegas;
        this.capacidadPorBodega = capacidadPorBodega;

        //Validacion de atributos de clase
        if (id < 1 || nombre == null || veloidadMaxima < 1 || numBodegas < 1 || capacidadPorBodega < 1 ){
            throw new BarcoInvalidoException("El barco de carga no puede contener valores negativos, menores de 1 " +
                    " o nulos");
        }
    }

    @Override
    public int calcularCapacidad() {
        return numBodegas * capacidadPorBodega;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("El nombre del barco es: " + super.getNombre());
        System.out.println("La velocidad maxima es: " + super.getVeloidadMaxima());
        System.out.println("El numero de bodegas es de: " + numBodegas);
        System.out.println("La capacidad por bodega es; " + capacidadPorBodega);
        System.out.println("La capacidad total de carga es de: " + calcularCapacidad());
        System.out.println("--------------------------------------------------------");



    }
}
