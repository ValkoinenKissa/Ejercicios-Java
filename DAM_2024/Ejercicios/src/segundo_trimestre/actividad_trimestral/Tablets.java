package segundo_trimestre.actividad_trimestral;

import java.util.ArrayList;

/*
Desarrollar una aplicación que me permita gestionar la compra y venta de tablets en la tienda.
Debes de guardar diferentes tipos de tablets y clientes.
TÚ decides qué propiedades tienen las tablets y cuáles los clientes.
Debes de tener una o varias arrays para guardar las tablets que están disponibles para vender y realizar las
ventas a los clientes. Haz un menú para que el usuario vea las diferentes opciones que puede realizar:

1.- Dar de alta una tablet. Comprobar que esa tablet no exista.
2.- Dar de alta un cliente. Comprobar que ese cliente no existe.
3.- Vender una tablet a un cliente.
4.- Mostrar tablets disponibles para la venta.
5.- Mostrar tablets compradas por un cliente en concreto.
6.- Salir.
 */
public class Tablets {
    private String marca;
    private String modelo;
    private ColorTablet color;
    private int idTablet;
    private double precio;
    private boolean stock;
    private final EntradaSalida es;

    //Constructor vacio
    Tablets() {
        this.es = new EntradaSalida();
        this.stock = true;
    }

    //Constructor con todos los atributos

    private Tablets(int idTablet, String marca, double precio, ColorTablet color, String modelo) {
        this.marca = marca;
        this.stock = true;
        this.precio = precio;
        this.color = color;
        this.modelo = modelo;
        this.es = new EntradaSalida();
        this.idTablet = idTablet;
    }

    protected String getMarca() {
        return marca;
    }

    protected boolean isStock() {
        return stock;
    }

    protected void setStock() {
        this.stock = false;
    }

    protected String getModelo() {
        return modelo;
    }

    protected int getIdTablet() {
        return idTablet;
    }

    @Override
    public String toString() {
        return "Tablets{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color +
                ", idTablet=" + idTablet +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

    //Metodo para dar de alta una tablet

    protected void tramitarAltaTablet(ArrayList<Tablets> listaTablets) {
        Tablets tablet;
        String marca, modelo;
        double precio;
        int idTablet;
        ColorTablet color;
        boolean productoExixte;
        idTablet = es.leerEntero("Introduce el id de la tablet: ");
        productoExixte = validarRegistroTablets(listaTablets, idTablet);
        if (productoExixte) {
            es.mostrarMensaje("El ID de la tablet se encuentra registrado, intentalo de nuevo con otro ID.");

        } else {
            marca = es.leerTexto("Introduce la marca de la tablet:");
            modelo = es.leerTexto("Introduce la modelo de tablet:");
            precio = comprobarPrecioTablet();
            color = validarColorTablet();
            tablet = new Tablets(idTablet, marca, precio, color, modelo);
            listaTablets.add(tablet);
            es.mostrarMensaje("Alta de la tablet tramitada correctamente");

            System.out.println(tablet);
        }

    }

    /// /////////////////////////////////////////////////////////////////////////////

    private double comprobarPrecioTablet() {
        double precio;
        do {
            precio = es.leerDouble("Introduce la precio de tablet:");
            if (precio < 0) {
                precio = es.leerDouble("Precio no valido, introducelo de nuevo");
            }
        } while (precio < 0);

        return precio;
    }

    /// /////////////////////////////////////////////////////////////////////////////

    private ColorTablet validarColorTablet() {
        ColorTablet color = null;
        // Mostrar opciones disponibles
        System.out.println("Seleccione un color:");
        for (ColorTablet c : ColorTablet.values()) {
            System.out.println("- " + c);
        }

        do {

            String opcionIntroducida = es.leerTexto("Introduce la color de la tablet:").toUpperCase();

            switch (opcionIntroducida) {
                case "PLATA":
                    color = ColorTablet.PLATA;
                    break;
                case "ORO":
                    color = ColorTablet.ORO;
                    break;
                case "GRIS_ESPACIAL":
                    color = ColorTablet.GRIS_ESPACIAL;
                    break;
                default:
                    System.out.println("El color no existe, prueba de nuevo");
            }

        } while (color == null);

        return color;
    }

    /// /////////////////////////////////////////////////////////////////////////////

    protected boolean validarRegistroTablets(ArrayList<Tablets> listaTablets, int idTablet) {
        for (Tablets t : listaTablets) {
            if (t.getIdTablet() == idTablet) {
                return true;
            }
        }
        return false;
    }

}
