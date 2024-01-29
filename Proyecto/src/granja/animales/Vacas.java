package granja.animales;
import java.util.Random;
public class Vacas extends Animal{
    Random random = new Random();
	private boolean preñada = false;
	public Vacas(String etiqueta) {
		super(150, etiqueta, "Vacas", 15);
		
	}
	public boolean isPreñada() {
		return preñada;
	}
	public void setPreñada(boolean preñada) {
		this.preñada = preñada;
	}
	
	
	public static void hacerSonido() {
		System.out.println("MUU");
	}
	
	private void preñadaAleatoria() {
	    Random random = new Random();
	    preñada = random.nextBoolean();
	}
	
	public String producirLeche() {
		String produccionVaca;
		preñadaAleatoria();
		if (preñada) {
			if(this.isMarcadorSalud() == true) {
				produccionVaca = "La vaca ha producido 10 litros de leche";
			}
			
			else {
				produccionVaca = "La vaca ha producido 2 litros de leche";
			}
		}
		
		produccionVaca = "La vaca no ha producido nada";
		
		return produccionVaca;

			
		}
		
	
	
	public void producir() {
		String produccion = producirLeche();
		hacerSonido();
		System.out.println("El animal " + getEtiqueta() + " tiene un peso de " +  getPeso() + " kg " + " y su salud es " + isMarcadorSalud() + 
				", el nombre de la especie es: " + getNombreEspecie() + " la cantidad de comida que come es de: " + getDosis_comida() + " kg " +
				 produccion);
	}

}
