package concesionario.clientes;

import concesionario.funcionalidades.CreadorDeAleatorios;

public class Cliente {

	private String nombreCliente;

	public Cliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public boolean decisionCliente() {
		boolean decision = CreadorDeAleatorios.booleanoAleatorio();
		if (decision) {

			return true;

		}

		else {
			return false;
		}
	}

}
