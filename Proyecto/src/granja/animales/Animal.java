package granja.animales;

public class Animal {
	private double peso;
	private String etiqueta;
	private boolean marcadorSalud;
	private String nombreEspecie;
	private int dosis_comida;
	
	public Animal() {}

	
	public Animal(double peso, String etiqueta, String nombreEspecie, int dosis_comida) {
		this.peso = peso;
		this.etiqueta = etiqueta;
		this.nombreEspecie = nombreEspecie;
		this.dosis_comida = dosis_comida;
		
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


	public final void setNombreEspecie(String nombreEspecie) {
		this.nombreEspecie = nombreEspecie;
	}


	public final int getDosis_comida() {
		return dosis_comida;
	}


	public final void setDosis_comida(int dosis_comida) {
		this.dosis_comida = dosis_comida;
	}
	
	
	public static void hacerSonido() {
		System.out.println("MMM");
	}
	
	// Trabajar en este metodo mas tarde
	public double comer(boolean eficiencia) {
		if (eficiencia && marcadorSalud) {
			peso += dosis_comida * 0.1;
			
		}
		
		else {
			peso += dosis_comida * 0.01;
		}
		
		
		return peso;
		
	}
	
	public boolean recibirCuidados(boolean experiencia) {
		if (experiencia = true) {
			marcadorSalud = true;
			hacerSonido();
			
		}
		
		else {
			marcadorSalud = false;
		}
		
		return marcadorSalud;
		
	}
	
	
	public void producir() {
		String produccion = "nada";
		hacerSonido();
		System.out.println("El animal" + etiqueta + " tiene un peso de " +  peso + " y su salud es " + marcadorSalud + 
				" el nombre de la especie es " + nombreEspecie + " la cantidad de comida que come es de: " +  dosis_comida + " kg " 
				+ " y produce " + produccion);
		
	}
	

}
