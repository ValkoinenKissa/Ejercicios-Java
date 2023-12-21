package granja.animales;

public class Cerdos extends Animal{
	
	public Cerdos(String etiqueta) {
		super(50, etiqueta, "Cerdos", 10 );
		
	}
	
	public static void hacerSonido() {
		System.out.println("OINK");
	}
	
	
	public void producir() {
		hacerSonido();
		String produccion = "El cerdo no produce nada";
		System.out.println("El animal" + getEtiqueta() + " tiene un peso de " +  getPeso() + " kg " + " y su salud es " + isMarcadorSalud() + 
				", el nombre de la especie es: " + getNombreEspecie() + " la cantidad de comida que come es de: " + getDosis_comida() + " kg " +
				 produccion);
		
	}


}
