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
    private String nombre;
    private String id;
    private int velocidadMaxima;

    //Constructor de barco, se sobreescribira el constructor en clases que hereden, ya que de esta clase al ser abstracta no podemos obtener una instancia

    public Barco(String nombre, String id, int velocidadMaxima) {
        this.nombre = nombre;
        this.id = id;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    //Metodo abstracto obtener informacion

    protected abstract void mostrarInformacion();
}
