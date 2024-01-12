package bicicleta.otros_vehiculos;

import bicicleta.bicicletas.Vehiculo;

public class Camion extends Vehiculo{

	public Camion(int velocidadActual, int numPasjaeros, int numRuedas) {
		super(velocidadActual);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int acelerar() {
		// TODO Auto-generated method stub
		return this.velocidadActual = velocidadActual * 1;
	}

	@Override
	public void numeroPasajeros(int numPasajeros) {
		System.out.println("Este camion puede llevar hasta: " + numPasajeros);
		
	}

	@Override
	public int establecerRuedas() {
		int ruedasCamion = 6;
		return ruedasCamion;
	}

}
