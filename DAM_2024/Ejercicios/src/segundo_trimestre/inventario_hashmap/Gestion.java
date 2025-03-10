package segundo_trimestre.inventario_hashmap;

import java.util.Map;

/*
Metodos:

Agregar un producto al inventario.
Buscar un producto por su código y mostrar sus detalles.
Actualizar el stock de un producto.
Eliminar un producto del inventario.
Mostrar todos los productos almacenados
 */
public class Gestion {
    private final EntradaSalida es = new EntradaSalida();

    public Gestion() {
    }

    protected void agregarProducto(Map<String, Producto> listaProductos) {
        Producto p;
        double precio;
        String nombreProducto;
        String idProducto;
        int stock;
        idProducto = obtenerIdUnico(listaProductos);
        nombreProducto = es.leerTexto("Ingrese el nombre del producto que quieres añadir: ");
        precio = es.leerDouble("Ingrese el precio del producto: ");
        stock = validarCantidadStock();
        p = new Producto(nombreProducto, precio, stock);
        listaProductos.put(idProducto, p);
        es.mostrarMensaje("El producto ha sido agregado correctamente.");

    }

    protected void buscarProducto(Map<String, Producto> listaProductos) {
        String idProductoBuscado = es.leerTexto("Ingrese el id del producto que quiere buscar: ");
        if (comprobarExixtenciaID(listaProductos, idProductoBuscado)) {
            es.mostrarMensaje("Mostrando los detalles del producto...");
            //Rediriginedo objeto guardado con la clave a variable p del objeto producto
            Producto p = listaProductos.get(idProductoBuscado);
            System.out.println(p);

        }

    }

    protected void eliminarProducto(Map<String, Producto> listaProductos) {
        String idProductoBuscado = es.leerTexto("Ingrese el id del producto que quiere eliminar: ");
        if (comprobarExixtenciaID(listaProductos, idProductoBuscado)) {
            listaProductos.remove(idProductoBuscado);
            es.mostrarMensaje("El producto ha sido eliminado.");
            //Llamada manual al recolector de basura para eliminar cualquier referencia al objeto Producto,
            // el cual pertenece el id
            System.gc();
        }
    }

    protected void mostrarProductosAlmacenados(Map<String, Producto> listaProductos) {
        for (String p : listaProductos.keySet()) {
            System.out.println(p + " -> " + listaProductos.get(p));
        }

    }

    protected void actualizarStock(Map<String, Producto> listaProductos) {

    }

    private String obtenerIdUnico(Map<String, Producto> listaProductos) {
        String idProducto;
        while (true) {
            idProducto = es.leerTexto("Ingrese el ID del producto: ");
            if (!listaProductos.containsKey(idProducto)) {
                break; // Salir del bucle si el ID no existe
            }
            es.mostrarMensaje("El ID ya existe. Ingrese uno nuevo.");
        }
        return idProducto;
    }

    private boolean comprobarExixtenciaID(Map<String, Producto> listaProductos, String idProducto) {
        return listaProductos.containsKey(idProducto);
    }

    private int validarCantidadStock() {
        int stock;
        do {
            stock = es.leerEntero("Ingrese el stock del producto: ");
            if (stock <= 0) {
                stock = es.leerEntero("Error: El stock del producto debe ser mayor que 0");
            }


        } while (stock >= 0);

        return stock;
    }


}
