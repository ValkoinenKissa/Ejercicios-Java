package segundo_trimestre.granja.animales;

public class Gallina extends Animal { 
	private int numPuestas;

	public Gallina(String etiqueta) {
		super(1, etiqueta, Animal.GALLINA, 1);
		numPuestas = 0;
	}

	public void hacerSonido() {
		System.out.println(this.getEtiqueta() + " PIO");
	}

	public void producir() {
		int numHuevos;
		if (this.buenaSalud())
			numHuevos = 3;
		else
			numHuevos = 1;
		numPuestas += numHuevos;
		producir(numHuevos + " huevos");
	}

	public int getNumPuestas() {
		return numPuestas;
	}

}