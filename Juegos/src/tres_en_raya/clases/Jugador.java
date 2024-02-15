package tres_en_raya.clases;

public class Jugador {
	
	private String nombre;
	private String simbolo;
	
	public Jugador(String nombre, String simbolo) {
		this.nombre = nombre;
		this.simbolo = simbolo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	
	
	public void mostarInfo() {
		System.out.println("El nombe del jugador es: " + nombre + " La ficha seleccionada para eljugador es: " + simbolo);;
		System.out.println();
	}
	
	
}
