package segundo_trimestre.inventario_hashmap;
/*
Desarrolla un sistema de gestión de inventario para una tienda.
Debes implementar un programa en Java que utilice un HashMap para almacenar productos, donde:

Clave: El código único del producto (String).
Valor: Un objeto de la clase Producto, que contiene:
nombre (String)
precio (double)
stock (int) (cantidad disponible)
 */
public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
