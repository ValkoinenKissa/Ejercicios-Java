package Ejercicio_1;
//Se implementa la interfaz en la superclase para obligar a las clases que hereden a implementarla obligatoriamente
public abstract class Barco implements Capacidad {
    private final int id;
    private final String nombre;
    private final double veloidadMaxima;
    //Atributos establecidos como final ya que no es necesario establecer setters en esta implementacion

    public Barco(int id, String nombre, double veloidadMaxima) {
        this.id = id;
        this.nombre = nombre;
        this.veloidadMaxima = veloidadMaxima;
    }
    public String getNombre() {
        return nombre;
    }

    public double getVeloidadMaxima() {
        return veloidadMaxima;
    }
    //Se sigue manteniendo el metodo de la interfaz como abstracto

    @Override
    public abstract int calcularCapacidad();

    public abstract void mostrarInformacion();
}
