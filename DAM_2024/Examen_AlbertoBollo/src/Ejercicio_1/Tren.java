package Ejercicio_1;
//clase definida como abstracta
public abstract class Tren implements Capacidad{
   /*
    Se implementa la interfaz en la clase abstracta para obligar a todas
    las clases hijas de la superclase Capacidad a implementarla
    de forma olbigatoria
    */

    //Atributos marcados como final, ya que no necesitamos setters para volver a modificarlos despues de su instanciacion
    private final String id;
    private final String nombre;
    private final double velocidadMaxima;

    public Tren(String id, String nombre, double velocidadMaxima) {
        this.id = id;
        this.nombre = nombre;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    //Metodos abstractos

    public abstract void mostrarInformacion();

    //Implementamos aqui el metodo de la interfaz Capacidad

    @Override
    public abstract double calcularCapacidad();
}
