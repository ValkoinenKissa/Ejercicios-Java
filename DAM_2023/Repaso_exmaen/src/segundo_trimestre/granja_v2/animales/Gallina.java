package segundo_trimestre.granja_v2.animales;

public class Gallina extends Animal {

	private int totalPuestas = 0;

	public Gallina(String etiqueta) {
		super(1, etiqueta, Animal.CERDO, 1);
	}

	public int getTotalPuestas() {
		return totalPuestas;
	}

	public void setTotalPuestas(int totalPuestas) {
		this.totalPuestas = totalPuestas;
	}

	@Override
	public void hacerSonido() {
		System.out.println(this.getEtiqueta() + " PIO");
	}

	@Override
	public void producir() {
		int numHuevos;
		if (this.buenaSalud()) {
			numHuevos = 3;
		} else {
			numHuevos = 1;
		}
		totalPuestas += numHuevos;
		producir("La gallina ha producido " + numHuevos + " huevos");
	}

}
