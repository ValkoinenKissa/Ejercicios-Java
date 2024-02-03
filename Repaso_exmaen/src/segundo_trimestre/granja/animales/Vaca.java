package segundo_trimestre.granja.animales;


import java.util.Random;

public class Vaca extends Animal {
	public boolean preñada;

	public Vaca(String etiqueta) {
		super(100, etiqueta, Animal.VACA, 15);
		preñada = false;
	}

	public void hacerSonido() {
		System.out.println(this.getEtiqueta() + " MUU");
	}
	private void preñadaAleatoria() {
		Random generador = new Random();
		preñada = generador.nextBoolean();
		
	}

	public void producir() {
		preñadaAleatoria();
		String resultado;
		if (preñada) {
			int litrosLeche;
			if (this.buenaSalud())
				litrosLeche = 10;
			else
				litrosLeche = 2;
			resultado = litrosLeche + " litros de leche";

		} else {
			resultado = "esta vaca no da leche";
		}		
		producir(resultado);

	}

}
