package bicicleta.bicicletas;

public class Bicicleta {
	private int velocidadActual;
	private int platoActual;
	private int pinonActual;
	
	public Bicicleta(int velocidadActual, int platoActual, int pinonActual) {
		this.velocidadActual = velocidadActual;
		this.platoActual = platoActual;
		this.pinonActual = pinonActual;
		
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public int getPlatoActual() {
		return platoActual;
	}

	public void setPlatoActual(int platoActual) {
		this.platoActual = platoActual;
	}

	public int getPinonActual() {
		return pinonActual;
	}

	public void setPinonActual(int pinonActual) {
		this.pinonActual = pinonActual;
	}
	
	
	public int acelerar() {
		return this.velocidadActual = velocidadActual * 2;
	}
	
	public int frenar(int velocidadActual) {
		return this.velocidadActual = velocidadActual /2;
	}
	
	
	public int cambiarPlato(int platoActual) {
		boolean stop = true;
		
		do {
			if (platoActual < 0 && platoActual >= 3) {
				System.out.println("El numero de plato introducido no es valido");
			}
			
			else {
				System.out.println("Cambiando plato...");
				stop = false;
			}
			
		}while(stop);
		
		return this.platoActual = platoActual;
	}
	
	public void cambiarPlato() {
		platoActual = 1;
	}
	
	public int cambiarPinon(int pinonActual) {
		boolean stop = true;
		
		do {
			if (platoActual < 0 && platoActual >= 8) {
				System.out.println("El numero de piñon introducido no es valido");
			}
			
			else {
				System.out.println("Cambiando piñon...");
				stop = false;

			}
			
		}while(stop);
		
		return this.pinonActual = pinonActual;
	}
	
	public void cambiarPinon() {
		pinonActual = 1;
	}

}
