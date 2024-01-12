package bicicleta.bicicletas;

public class Bicicleta extends Vehiculo implements Imprimible {

	private int platoActual;
	private int pinonActual;

	public Bicicleta(int valocidadActual, int platoActual, int pinonActual) {
		super(valocidadActual);
		this.platoActual = platoActual;
		this.pinonActual = pinonActual;
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



	@Override
	public void imprime() {
		String datos = "Velocidad actual: " + this.velocidadActual + " Piñon actual: " + this.pinonActual + " Plato actual: " + this.platoActual;
		System.out.println(datos);
	}



	@Override
	public void numeroPasajeros(int numPasajeros) {
		System.out.println("Por defecto la bicicleta normal solo puede llevar un pasajero");
	}



	@Override
	public int establecerRuedas() {
		int ruedas = 2;
		return ruedas;
	}



	@Override
	public void getAtributos() {
		
		int[] atributos = {this.pinonActual, this.platoActual, super.velocidadActual};
		
		for(int i=0; i < atributos.length; i++) {
			System.out.println(atributos[i]);
		
		}

}
	
}
