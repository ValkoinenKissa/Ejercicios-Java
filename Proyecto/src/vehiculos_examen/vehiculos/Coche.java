package vehiculos_examen.vehiculos;

import vehiculos_examen.Vehiculo;
import vehiculos_examen.interfaces.Manejables;

public class Coche extends Vehiculo implements Manejables{

	@Override
	public void manejarVehiculo() {
		System.out.println("Manejando...");
		System.out.println(getTipoVehiculo());
	}

	@Override
	public String getTipoVehiculo() {
		// TODO Auto-generated method stub
		return "Este vehiculo es un coche";
	}

}
