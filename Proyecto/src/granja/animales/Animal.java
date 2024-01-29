package granja.animales;

public class Animal {
	private double peso;
	private String etiqueta;
	private boolean marcadorSalud;
	private final String nombreEspecie;
	private final int dosisComida;
	
	public static final String CERDO = "Cerdo";

	
	public Animal(double peso, String etiqueta, String nombreEspecie, int dosisComida) {
		this.peso = peso;
		this.etiqueta = etiqueta;
		this.nombreEspecie = nombreEspecie;
		this.dosisComida = dosisComida;
		
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getEtiqueta() {
		return etiqueta;
	}


	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}


	public boolean isMarcadorSalud() {
		return marcadorSalud;
	}


	public void setMarcadorSalud(boolean marcadorSalud) {
		this.marcadorSalud = marcadorSalud;
	}


	public final String getNombreEspecie() {
		return nombreEspecie;
	}

	public int getDosis_comida() {
		return dosisComida;
	}
	
	
	public static void hacerSonido() {
		System.out.println("MMM");
	}
	
	// Trabajar en este metodo mas tarde
	public double comer(boolean eficiencia) {
		double nuevoPeso = peso;
		if (eficiencia && marcadorSalud) {
			nuevoPeso = peso;
			nuevoPeso += dosisComida / 100;
			setPeso(nuevoPeso);
			
		}
		
		else {
			nuevoPeso = peso;
			nuevoPeso += dosisComida / 100;
			setPeso(nuevoPeso);
		}
		
		
		return peso;
		
	}
	
	public boolean recibirCuidados(boolean experiencia) {
		if (marcadorSalud) {
			marcadorSalud = true;
			hacerSonido();
			
		}
		
		return marcadorSalud;
		
	}
	
	
	public void producir() {
		String produccion = "nada";
		hacerSonido();
		System.out.println("El animal" + etiqueta + " tiene un peso de " +  peso + " y su salud es " + marcadorSalud + 
				" el nombre de la especie es " + nombreEspecie + " la cantidad de comida que come es de: " +  dosisComida + " kg " 
				+ " y produce " + produccion);
		
	}
	

}
