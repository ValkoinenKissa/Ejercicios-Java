package vehiculos_examen.vehiculos;

import vehiculos_examen.Vehiculo;
import vehiculos_examen.interfaces.Manejables;

public class Barco extends Vehiculo implements Manejables{

	@Override
	public String getTipoVehiculo() {
		return "Este vehiculo es un barco";
	}

	@Override
	public void manejarVehiculo() {
		System.out.println("Manejando...");
		System.out.println(getTipoVehiculo());
	}

}
