package bicicleta.bicicletas;

public class BicicletaTandem extends Bicicleta {
	
	private int numAsientos;

	
	public BicicletaTandem(int velocidadActual, int platoActual, int pinonActual) {
		super(velocidadActual, platoActual, pinonActual);
	}


	public int getNumAsientos() {
		return numAsientos;
	}


	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
		
	}
	
	
	
	public int acelerar() {
		int nuevaVelocidad = this.velocidadActual *4;
		setVelocidadActual(nuevaVelocidad);
		return nuevaVelocidad;
	}
	
	

}
