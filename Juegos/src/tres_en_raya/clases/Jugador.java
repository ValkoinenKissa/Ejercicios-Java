package tres_en_raya.clases;

public class Jugador {
	
	private String nombre;
	private Simbolo simbolo;
	
	public Jugador(String nombre, Simbolo simbolo) {
		this.nombre = nombre;
		this.simbolo = simbolo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Simbolo getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(Simbolo simbolo) {
		this.simbolo = simbolo;
	}
	
	
}
