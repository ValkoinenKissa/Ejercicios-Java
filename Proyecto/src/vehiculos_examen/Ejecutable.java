package vehiculos_examen;

import vehiculos_examen.interfaces.Manejables;
import vehiculos_examen.interfaces.Sumergible;
import vehiculos_examen.interfaces.Volables;
import vehiculos_examen.vehiculos.Avion;
import vehiculos_examen.vehiculos.Barco;
import vehiculos_examen.vehiculos.Coche;
import vehiculos_examen.vehiculos.Submarino;

public class Ejecutable {

	public static void main(String[] args) {

		Vehiculo[] arrayVehiculos = { new Avion(), new Barco(), new Coche(), new Submarino() };

		for (int i = 0; i < arrayVehiculos.length; i++) {
			Vehiculo vehiculoElegido = arrayVehiculos[i];

			if (vehiculoElegido instanceof Manejables) {
				Manejables vehiculo = (Manejables) vehiculoElegido;
				vehiculo.manejarVehiculo();

			} else {
				System.out.println("El vehiculo no se ha podido manejar...");
				System.out.println();
			}

			if (vehiculoElegido instanceof Sumergible) {
				Sumergible vehiculo = (Sumergible) vehiculoElegido;
				vehiculo.sumergir();
			} else {
				System.out.println("El vehiculo no se ha podido sumergir...");
				System.out.println();
			}

			if (vehiculoElegido instanceof Volables) {
				Volables vehiculo = (Volables) vehiculoElegido;
				vehiculo.volar();
			} else {
				System.out.println("El vehiculo no ha podido volar...");
				System.out.println();

			}

		}

	}

}
