package tres_en_raya.clases;

public class Casilla {
	private int fila;
	private int columna;
	private String simbolo;
	
	public Casilla(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
		this.simbolo = Simbolo.VACIO;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	
	

}
