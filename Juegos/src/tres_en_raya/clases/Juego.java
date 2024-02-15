package tres_en_raya.clases;

public class Juego {
	
	private Tablero tablero;
	
	public Juego() {
		tablero = new Tablero();
	}
	
	
	public void realizarMovimiento(Jugador jugador, int fila, int columna) {
		tablero.colocarFicha(fila, columna);
		tablero.mostrarTablero();
	}

}
