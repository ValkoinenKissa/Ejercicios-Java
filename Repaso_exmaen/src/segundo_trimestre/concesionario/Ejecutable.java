package segundo_trimestre.concesionario;

import segundo_trimestre.concesionario.cliente.Cliente;
import segundo_trimestre.concesionario.vehiculos.Camion;
import segundo_trimestre.concesionario.vehiculos.Coche;
import segundo_trimestre.concesionario.vehiculos.Moto;
import segundo_trimestre.concesionario.vehiculos.Vehiculo;

public class Ejecutable {

	public static void main(String[] args) {
		
		Vehiculo [] catalogo = {

		new Coche("Fiat", "500e", 29000, 3, true),
		new Coche("Toyota", "Corolla GR", 30500, 5, false),
		new Moto("Ducati", "Diavel", 27300, false, ("Transmision por cadena")),
		new Moto("Kawasaki", "Ninja", 9000, false, ("Transmision por correa")),
		new Camion("Volvo", "FH", 120000, 12),
		new Camion("MACK", "Anthem", 140000, 16),
		};
		
		
		for(int i =0; i<7000; i++) {
			new Cliente("Cliente Nº" + i).clienteActua(catalogo);
		}
		
	}

}
