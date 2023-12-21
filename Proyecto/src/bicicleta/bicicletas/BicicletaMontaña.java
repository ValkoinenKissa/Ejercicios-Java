package bicicleta.bicicletas;

public class BicicletaMontaña extends Bicicleta {
	
	private int suspension;

	public BicicletaMontaña(int velocidadActual, int platoActual, int pinonActual) {
		super(velocidadActual, platoActual, pinonActual);
		// TODO Auto-generated constructor stub
	}

	public int getSuspension() {
		return suspension;
	}

	public void setSuspension(int suspension) {
		this.suspension = suspension;
	}
	
	
	public int cambiarSuspension(int suspension) {
		boolean stop = true;
		
		do {
			if (suspension < 0 && suspension >= 1) {
				System.out.println("El ajuste de la suspension no es valido");
			}
			
			else {
				System.out.println("Cambiando suspension al modo: " + suspension);
				stop = false;

			}
			
		}while(stop);
		
		return this.suspension = suspension;
		
	}
	@Override
	public int acelerar() {
		int nuevaVelocidad = getVelocidadActual() *3;
		setVelocidadActual(nuevaVelocidad);
		return nuevaVelocidad;

	}

}