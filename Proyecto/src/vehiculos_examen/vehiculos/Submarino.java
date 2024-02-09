package vehiculos_examen.vehiculos;

import vehiculos_examen.Vehiculo;
import vehiculos_examen.interfaces.Manejables;
import vehiculos_examen.interfaces.Sumergible;

public class Submarino extends Vehiculo implements Sumergible, Manejables{

	@Override
	public void sumergir() {
		System.out.println("Sumergiendo el submarino...");
		
	}

	@Override
	public String getTipoVehiculo() {
		// TODO Auto-generated method stub
		return "Este vehiculo es un Submarino";
	}

	@Override
	public void manejarVehiculo() {
		System.out.println("Manejando...");
		System.out.println(getTipoVehiculo());
		
	}

}
