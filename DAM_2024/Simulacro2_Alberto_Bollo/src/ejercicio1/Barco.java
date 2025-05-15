package ejercicio1;
/*
1.- Crea un sistema que permita gestionar diferentes tipos de vehículos
marítimos.
El sistema debe permitir registrar barcos, mostrar su información y
calcular su capacidad total de carga o pasajeros según el tipo de barco.
Debe haber una clase principal que permita realizar dichas operaciones.

a.- Clase abstracta Barco:
a) Atributos: id, nombre, velocidadMaxima
b) Metodo abstracto: mostrarInformacion()
b.- Interfaz Capacidad:
a) Metodo calcularCapacidad()
c.- Clases Hijas:
b) BarcoPasajeros:
i) Atributos: numCamarotes, pasajerosPorCamarote
ii) Metodo: calcularCapacidad() devuelve el número total de pasajeros.
c) BarcoCarga:
i) Atributos: capacidadPorBodega, numBodegas
ii) Metodo: calcularCapacidad() devuelve la carga total.
d.- Polimorfismo:
d) Usar un ArrayList de Barco para guardar los barcos y recorrerlo para
mostrarlos.
e.- Control de excepciones:
e) Crear una excepción personalizada llamada BarcoInvalidoException que se
lance si se intenta crear un barco con valores negativos o inválidos
 */
public abstract class Barco implements Capacidad{
    //Atributos marcados como final, ya que no necesitan getters o setters para ser modificados
    private final String id;
    private final String nombre;
    private final String velocidadMaxima;

    public Barco(String id, String nombre, String velocidadMaxima) {
        this.id = id;
        this.nombre = nombre;
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract String mostrarInformacion();

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

}
