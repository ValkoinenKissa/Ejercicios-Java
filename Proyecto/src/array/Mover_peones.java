package array;

import java.util.Scanner;

public class Mover_peones {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		char[][] arrayAjedrez = new char[8][8];

		arrayAjedrez = crearAjedrez();
		
		moverPeon(arrayAjedrez);

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

	public static void CrearTablero(char[][] arrayAjedrez) {
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
				System.out.print("\033[0m" + arrayAjedrez[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void moverPeon(char[][] arrayAjedrez) {
		boolean stop = false;
		CrearTablero(arrayAjedrez);
		System.out.println();

		while (!stop) {

			System.out.println("Introduce la fila del peon que quieres mover");
			int posicionX = entrada.nextInt();
			System.out.println("Introduce el peon que quieres mover (0-7)");
			int posicionY = entrada.nextInt();
			if (posicionX >= 0 && posicionX < 8 && posicionY >= 0 && posicionY < 8) {

				if (arrayAjedrez[posicionX][posicionY] == 'P') {
					System.out.println("Introduce a que fila quieres mover el peon (max 2 filas por movimiento...)");
					int x = entrada.nextInt();
					int y = posicionY;
					if (posicionX <= 8) {
						if (arrayAjedrez[x][y] == 'P') {
							System.out.println("En la posicion introducida hay ya un peon...");

						} else {
							arrayAjedrez[x][y] = 'P';
							arrayAjedrez[posicionX][posicionY] = '*';
						}

					} else {
						System.out.println("El número de movimientos que has introducido para el peón son incorrectos");
					}
				} else {
					System.out.println("En las posiciones introducidas no hay peones...");
				}
			} else {
				System.out.println("Posiciones fuera del rango del tablero.");
			}
			CrearTablero(arrayAjedrez);
			System.out.println();

		}

	}
}
