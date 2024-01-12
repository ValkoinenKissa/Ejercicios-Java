package bicicleta.bicicletas;

public abstract class Vehiculo {
	protected int velocidadActual;
	protected int numPasajeros;
	protected int numRuedas;
	
	public Vehiculo(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	
	
	

	public int getVelocidadActual() {
		return velocidadActual;
	}




	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}


	public int getNumPasajeros() {
		return numPasajeros;
	}




	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}




	public int getNumRuedas() {
		return numRuedas;
	}




	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}




	public abstract int acelerar();
	
	public void frenar() {
		velocidadActual=velocidadActual/2;
	}
	
	public abstract void numeroPasajeros(int numPasajeros);
		
	public abstract int establecerRuedas();

}
