package array;

import java.util.Scanner;

public class Mover_peones {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		char[][] arrayAjedrez = new char[8][8];

		arrayAjedrez = crearAjedrez();
		moverPeon(arrayAjedrez);
		
		System.out.println("El juego ha terminado!!");
	}

	public static char[][] crearAjedrez() {
		char[][] ajedrez = new char[8][8];
		for (int i = 0; i < 2; i++) {
			i *= 7;
			ajedrez[i][0] = 'T';
			ajedrez[i][1] = 'C';
			ajedrez[i][2] = 'A';
			ajedrez[i][3] = 'D';
			ajedrez[i][4] = 'R';
			ajedrez[i][5] = 'A';
			ajedrez[i][6] = 'C';
			ajedrez[i][7] = 'T';
		}
		for (int i = 0; i < 8; i++) {
			ajedrez[1][i] = 'P';
			ajedrez[6][i] = 'P';
		}
		for (int i = 2; i < 6; i++) {
			for (int j = 0; j < 8; j++) {
				ajedrez[i][j] = '*';
			}
		}
		return ajedrez;
	}

	public static void CrearTablero(char[][] arrayAjedrez, int posicionX, int posicionY) {
		char[] letras = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
		System.out.print("\033[1m  ");
		for (char letra : letras) {
			System.out.print(letra + " ");
		}
		System.out.print("\033[0m");
		System.out.println();
		for (int i = 0; i < 8; i++) {
			System.out.print("\033[1m" + (i + 1) + " ");
			for (int j = 0; j < 8; j++) {
				if (i == posicionX && j == posicionY) {
					System.out.print("\033[35m" + arrayAjedrez[i][j] + " "); // Peón seleccionado
				} else {
					System.out.print("\033[0m" + arrayAjedrez[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void moverPeon(char[][] arrayAjedrez) {
		int posicionX = 0;
		int posicionY = 0;
		int contadorTurno = 0;

		CrearTablero(arrayAjedrez, -1, -1);
		System.out.println();

		while (contadorTurno < 5) {

			System.out.println("Introduce la fila del peon que quieres mover");
			posicionX = entrada.nextInt() - 1;
			System.out.println("Introduce el peon que quieres mover (0-7)");
			posicionY = entrada.nextInt();
			System.out.println("Esta es la posción que has seleccionado:");
			CrearTablero(arrayAjedrez, posicionX, posicionY);
			if (posicionX >= 0 && posicionX < 8 && posicionY >= 0 && posicionY < 8) {
				if (arrayAjedrez[posicionX][posicionY] == 'P') {
					System.out.println("Introduce a que fila quieres mover el peon (max 2 filas por movimiento...)");
					int x = entrada.nextInt() - 1;
					int y = posicionY;
					if (posicionX <= 8) {
						if (arrayAjedrez[x][y] == 'P') {
							System.out.println("En la posicion introducida hay ya un peon...");

						} else {
							arrayAjedrez[x][y] = 'P';
							arrayAjedrez[posicionX][posicionY] = '*';
						}

					} else {
						System.err.println("El número de movimientos que has introducido para el peón son incorrectos");
					}
				} else {
					System.err.println("En las posiciones introducidas no hay peones...");
				}
			} else {
				System.err.println("Posiciones fuera del rango del tablero.");
			}
			CrearTablero(arrayAjedrez, -1, -1);
			contadorTurno++;
			System.out.println();

		}

	}
}
