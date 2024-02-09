package vehiculos_examen.vehiculos;

import vehiculos_examen.Vehiculo;
import vehiculos_examen.interfaces.Manejables;
import vehiculos_examen.interfaces.Volables;

public class Avion extends Vehiculo implements Volables, Manejables{

	@Override
	public String getTipoVehiculo() {
		return "Este vehiculo es un Avion";
	}

	@Override
	public void volar() {
		System.out.println("Volando...");
		
	}

	@Override
	public void manejarVehiculo() {
		System.out.println("Manejando...");
		System.out.println(getTipoVehiculo());
		
	}

}
