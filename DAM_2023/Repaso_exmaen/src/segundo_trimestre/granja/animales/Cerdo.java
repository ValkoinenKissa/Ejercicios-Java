package segundo_trimestre.granja.animales;

public class Cerdo extends Animal {
	public Cerdo(String etiqueta) {
		super(50, etiqueta, Animal.CERDO, 10);
	}

	public void hacerSonido() {
		System.out.println(this.getEtiqueta() + " OINK");
	}

	public void producir() {
		super.producir("El cerdo solo engorda, no produce");
	}

}

