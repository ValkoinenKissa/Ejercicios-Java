package concesionario.clientes;

import concesionario.Vehiculo;
import concesionario.funcionalidades.CreadorDeAleatorios;
import concesionario.interfaces.Alquilable;
import concesionario.interfaces.Comprable;

public class Cliente {

	private String nombreCliente;
	private boolean intencionCompra;

	public Cliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
		this.intencionCompra = CreadorDeAleatorios.booleanoAleatorio();
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public boolean isIntencionCompra() {
		return intencionCompra;
	}

	public void setIntencionCompra(boolean intencionCompra) {
		this.intencionCompra = intencionCompra;
	}
	
	
	public void actuarSobreCatalogo(Vehiculo[] catalogo) {
		int indiceDeVehiculo = CreadorDeAleatorios.aleatorio(catalogo.length);
		Vehiculo vehiculoElegido = catalogo[indiceDeVehiculo];
		if (intencionCompra && vehiculoElegido instanceof Comprable) {
			Comprable comprable = (Comprable) vehiculoElegido;
			System.out.println(getNombreCliente() + " quiere comprar el vehiculo: " + vehiculoElegido.getDetalles());
			System.out.println("El precio de compra del vehiculo es: " + comprable.calcularPrecioCompra());
		}
		
		else if(intencionCompra && vehiculoElegido instanceof Alquilable) {
			Alquilable alquilable = (Alquilable) vehiculoElegido;
			System.out.println(getNombreCliente() + " quiere alquilar el vehiculo: " + vehiculoElegido.getDetalles());
			System.out.println("El precio de alquiler del vehiculo es: " + alquilable.calcularAlquiler());
			
		}
		
		else {
			System.err.println("El " + getNombreCliente() +" no ha realizado ninguna acción sobre el vehiculo seleccionado");
		}
	}

}
