package concesionario;

import concesionario.clientes.Cliente;
import concesionario.vehiculos.Camiones;
import concesionario.vehiculos.Coches;
import concesionario.vehiculos.Motos;

public class Ejecutable {

	public static void main(String[] args) {
		
		Vehiculo [] catalogo = {

		new Coches("Fiat", "500e", 29000, 3, true),
		new Coches("Toyota", "Corolla GR", 30500, 5, false),
		new Motos("Ducati", "Diavel", 27300, false, ("Transmision por cadena")),
		new Motos("Kawasaki", "Ninja", 9000, false, ("Transmision por correa")),
		new Camiones("Volvo", "FH", 120000, 12),
		new Camiones("MACK", "Anthem", 140000, 16),
		};
		
		Cliente[] clientes = new Cliente[7000];
		
		for(int i=0; i < clientes.length; i++) {
			clientes[i] = new Cliente("Cliente "+ (i+1));
			clientes[i].actuarSobreCatalogo(catalogo);
			System.out.println("****************************");
		}
	}

}


