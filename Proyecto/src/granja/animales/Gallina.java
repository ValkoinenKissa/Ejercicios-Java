package granja.animales;

public class Gallina extends Animal {
	private int puestasDeHuevos;
	
	public Gallina(String etiqueta) {
		super(1, etiqueta, Animal.GALLINA, 1);
		puestasDeHuevos = 0;
	}
	
	
	public  void hacerSonido() {
		System.out.println(this.getEtiqueta() + "PIO");
	}
	
	
	public void producir() {
		int numHuevos;
		if(this.isMarcadorSalud())
			numHuevos = 3;
		else {
			numHuevos = 1;
		}
		puestasDeHuevos = numHuevos;
		producir(numHuevos + "huevos");
		
	}
	
	public int setNumDePuestas() {
		return puestasDeHuevos;
	}

}
