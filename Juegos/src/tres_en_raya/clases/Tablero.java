package tres_en_raya.clases;

public class Tablero {
	private Casilla[][] casillas;
	private String turno;

	public Tablero() {
		casillas = new Casilla[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				casillas[i][j] = new Casilla(i, j);
			}
		}

		turno = Simbolo.X;
	}

	public void colocarFicha(int fila, int columna) {
		casillas[fila][columna].setSimbolo(turno);
		turno = turno == Simbolo.X ? Simbolo.O : Simbolo.X;
	}
	
	
	public void mostrarTablero() {
	    System.out.print("   ");
	    for (int i = 0; i < 3; i++) {
	        System.out.print(i + 1 + " ");
	    }
	    System.out.println();
	    for (int i = 0; i < 3; i++) {
	        System.out.print(i + 1 + " ");
	        for (int j = 0; j < 3; j++) {
	            System.out.print("[" + casillas[i][j].getSimbolo() + "]" + " ");
	        }
	        System.out.println();
	    }
	}
}
