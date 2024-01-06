package granja.animales;

public class Cerdos extends Animal{
	
	public Cerdos(String etiqueta) {
		super(50, etiqueta, Animal.CERDO, 10 );
		
	}
	
	public void hacerSonido() {
		System.out.println(this.getEtiqueta() + "OINK");
	}
	
	
	public void producir() {
		super.producir("El cerdo no produce nada, solo engorda");
		
	}


}
