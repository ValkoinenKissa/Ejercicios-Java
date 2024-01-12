package bicicleta.otros_vehiculos;

import bicicleta.bicicletas.Vehiculo;

public class Coche extends Vehiculo{
	int numPuertas;

	public Coche(int velocidadActual, int numPasajeros, int numPuertas) {
		super(velocidadActual);
		this.numPuertas = numPuertas;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int acelerar() {
		// TODO Auto-generated method stub
		return this.velocidadActual = velocidadActual * 2;

	}

	@Override
	public void numeroPasajeros(int numPasajeros) {
		// TODO Auto-generated method stub
		System.out.println("Este coche puede llevar hasta: " + numPasajeros);
		
	}

	@Override
	public int establecerRuedas() {
		int ruedasCoche = 4;
		return ruedasCoche;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

}
