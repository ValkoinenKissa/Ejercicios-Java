package segundo_trimestre.concesionario.cliente;

import segundo_trimestre.concesionario.funcionalidades.CreadorDeAleatorios;
import segundo_trimestre.concesionario.interfaces.Alquilable;
import segundo_trimestre.concesionario.interfaces.Comprable;
import segundo_trimestre.concesionario.vehiculos.Vehiculo;

public class Cliente {

	private String nombre;
	private boolean intencionCompra;

	public Cliente(String nombre) {
		this.nombre = nombre;
		this.intencionCompra = CreadorDeAleatorios.booleanoAleatorio();

	}

	public boolean isIntencionCompra() {
		return intencionCompra;
	}

	public void setIntencionCompra(boolean intencionCompra) {
		this.intencionCompra = intencionCompra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void clienteActua(Vehiculo[] catalogo) {
		int indiceCatalogo = CreadorDeAleatorios.aleatorio(catalogo.length);
		Vehiculo vehiculoElegido = catalogo[indiceCatalogo];

		if (intencionCompra && vehiculoElegido instanceof Comprable) {
			Comprable comprable = (Comprable) vehiculoElegido;

			System.out.println("El cliente " + getNombre() + " quiere comprar el vehiculo: ");
			comprable.comprarVehiculo();
			comprable.calcularPrecioCompra();
		}

		else if (intencionCompra && vehiculoElegido instanceof Alquilable) {
			Alquilable alquilable = (Alquilable) vehiculoElegido;
			System.out.println("El cliente " + getNombre() + " quiere alquilar el vehiculo: ");
			alquilable.alquilarVehiculo();
			alquilable.calcularAlquiler();
		}

		else {
			System.err.println("El cliente " + getNombre() + " no ha realizado ninguna operación: ");
		}

	}

}
