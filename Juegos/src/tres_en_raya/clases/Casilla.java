package tres_en_raya.clases;

public class Casilla {
	private int fila;
	private int columna;
	private Simbolo simbolo;
	
	public Casilla(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
		this.simbolo = Simbolo.V;
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

	public Simbolo getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(Simbolo simbolo) {
		this.simbolo = simbolo;
	}
	
	

}
