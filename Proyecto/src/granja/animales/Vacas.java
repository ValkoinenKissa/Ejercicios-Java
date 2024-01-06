package granja.animales;

import java.util.Random;

public class Vacas extends Animal {
	Random random = new Random();
	private boolean preñada;

	public Vacas(String etiqueta) {
		super(150, etiqueta, Animal.VACA, 15);
		preñada = false;
	}

	public void hacerSonido() {
		System.out.println(this.getEtiqueta() + "MUU");
	}

	private void preñadaAleatoria() {
		Random generador = new Random();
		preñada = generador.nextBoolean();

	}
	
	public void producir() {
		preñadaAleatoria();
		String resultado;
		int litrosLeche;
		if(preñada) {
			if(this.isMarcadorSalud())
			litrosLeche = 10;
			
			else
			litrosLeche = 2;
		resultado = litrosLeche + " litros de leche";

		}
		
		else {
			resultado = "La vaca no ha producido nada";

		}
		
		producir(resultado);

	}

}
