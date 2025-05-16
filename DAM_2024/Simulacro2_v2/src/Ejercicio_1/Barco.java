package Ejercicio_1;
/*
a.- Clase abstracta Barco:
a) Atributos: id, nombre, velocidadMaxima
b) Metodo abstracto: mostrarInformacion()
b.- Interfaz Capacidad:
a) Metodo calcularCapacidad()
 */
//Implementamos la interfaz capacidad en la clase abstracta para obligar a todas las clases que hereden de barco a implementarla
public abstract class Barco implements Capacidad{
    //Atributos establecidos como final, ya que no son modificados con setters y no van a cambiar durante la vida del objeto
    private final String nombre;
    private final String id;
    private final int velocidadMaxima;

    //Constructor de barco, se sobreescribira el constructor en clases que hereden, ya que de esta clase al ser abstracta no podemos obtener una instancia

    public Barco(String nombre, String id, int velocidadMaxima) {
        this.nombre = nombre;
        this.id = id;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    //Metodo abstracto obtener informacion

    protected abstract void mostrarInformacion();
}
