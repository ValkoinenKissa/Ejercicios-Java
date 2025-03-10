package segundo_trimestre.inventario_hashmap;

import java.util.HashMap;
import java.util.Map;

/*
Desarrolla un sistema de gestión de inventario para una tienda.
Debes implementar un programa en Java que utilice un HashMap para almacenar productos, donde:

Clave: El código único del producto (String).
Valor: Un objeto de la clase Producto, que contiene:
nombre (String)
precio (double)
stock (int) (cantidad disponible)
El programa debe permitir las siguientes operaciones:

Agregar un producto al inventario.
Buscar un producto por su código y mostrar sus detalles.
Actualizar el stock de un producto.
Eliminar un producto del inventario.
Mostrar todos los productos almacenados

 */
public class Ejecutable {
    public static void main(String[] args) {
        Map<String, Producto> listaProductos = new HashMap<>();
        Gestion g = new Gestion();
        Menu menu = new Menu();

        int opcion;

        do {

            opcion = menu.mostrarMenu();

            switch (opcion) {
                case 1:
                    g.agregarProducto(listaProductos);
                    break;
                case 2:
                    g.buscarProducto(listaProductos);
                    break;
                case 3:
                    g.actualizarStock(listaProductos);
                    break;
                case 4:
                    g.eliminarProducto(listaProductos);
                    break;
                case 5:
                    g.mostrarProductosAlmacenados(listaProductos);
                    break;
                case 6:
                    System.out.println("Saliendo del programa... ¡Hasta pronto!");
                    break;
            }
        } while (opcion != 6);

    }
}
