package poo;

public class Coche {
	
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	
	public Coche() {
		
		ruedas =4;
		
		largo=2000;
		
		ancho=300;
		
		motor=2200;
		
		peso_plataforma=600;
		
	}
	
	
	public String dime_datos_generales() { //Metodo GETTER
		
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas " +
		" Mide " + largo/1000 + " metros con un ancho de " + ancho + " cm " +
		" y un peso de plataforma de: " + peso_plataforma + " kg ";
		
	}
	
	public void establece_color(String color_coche) { //Metodo SETTER
		
		color=color_coche;
	}
	
	
	public String ver_color() { //Metodo getter
		
		return "El color de tu coche es " + color;
		
	}
	
	public void configura_asientos(String asientos_cuero) {
		
		if(asientos_cuero == "si") {
			this.asientos_cuero = true;
		}
			else{
				this.asientos_cuero = false;
			}
		}
	
	
	public String dime_asientos() {
		if(asientos_cuero ==true) {
			return "El coche tiene asientos de cuero";
			
		}
			
			else {
				return "El coche no dispone de asientos de cuero";
			}
					
		
	}

}
