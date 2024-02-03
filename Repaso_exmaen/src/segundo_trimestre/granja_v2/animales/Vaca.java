package segundo_trimestre.granja_v2.animales;

import java.util.Random;

public class Vaca extends Animal {
	private boolean prenada = false;

	public Vaca(String etiqueta) {
		super(150, etiqueta, Animal.VACA, 15);
	}

	public boolean isPrenada() {
		return prenada;
	}

	public void setPrenada(boolean prenada) {
		this.prenada = prenada;
	}

	@Override
	public void hacerSonido() {
		System.out.println(this.getEtiqueta() + " MUU");
	}

	public void estaPreñada() {
		Random generador = new Random();
		prenada = generador.nextBoolean();
	}

	@Override
	public void producir() {
		estaPreñada();
		String producir;
		if (prenada) {
			int litrosLeche;
			if (this.buenaSalud()) {
				litrosLeche = 10;
			} else {
				litrosLeche = 2;
			}

			producir = "La vaca ha producido " + litrosLeche + " L de leche";

		} else {
			producir = "Esta vaca no produce nada";
		}
		producir(producir);
	}

}
