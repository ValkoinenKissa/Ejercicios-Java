package granja.animales;

public class Gallina extends Animal {
	private int puestasDeHuevos = 0;
	
	public Gallina(String etiqueta) {
		super(1, etiqueta, "Gallinas", 1);
	}

	public String getPuestasDeHuevos() {
		return "El historico de huevos que ha puesto la gallina es de: " + puestasDeHuevos;
	}

	public void setPuestasDeHuevos(int puestasDeHuevos) {
		this.puestasDeHuevos = puestasDeHuevos;
	}
	
	
	public static void hacerSonido() {
		System.out.println("PIO");
	}
	
	public  String produccionHuevos(Animal animal) {
		boolean marcadorSalud = this.isMarcadorSalud();
		String produccionGallina;
		if (marcadorSalud) {
			
			produccionGallina = "La gallina ha producido 3 huevos";
			puestasDeHuevos += 3;
			
		}
		
		else {
			
			produccionGallina = "La gallina ha producido 1 huevos";
			puestasDeHuevos += 1;
		}
		
		return produccionGallina;
		
	}
	
	public void producir() {
		String produccion = "La gallina ha producido un huevo";
		hacerSonido();
		System.out.println("El animal " + getEtiqueta() + " tiene un peso de " +  getPeso() + " kg " + " y su salud es " + isMarcadorSalud() + 
				", el nombre de la especie es: " + getNombreEspecie() + " la cantidad de comida que come es de: " + getDosis_comida() + " kg " +
				 produccion);
		
	}

}
