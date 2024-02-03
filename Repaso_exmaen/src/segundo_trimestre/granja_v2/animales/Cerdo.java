package segundo_trimestre.granja_v2.animales;

public class Cerdo extends Animal {

	public Cerdo(String etiqueta) {
		super(50, etiqueta, Animal.CERDO, 10);
	}

	@Override
	public void hacerSonido() {
		System.out.println(this.getEtiqueta() + " OINK");
	}

	@Override
	public void producir() {
		super.producir();
		System.out.println("El cerdo no produce nada, solo engorda...");
	}

}
