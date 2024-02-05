package array;

import java.util.*;

public class Tablero_Ajedrez {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		char[][] arrayAjedrez = new char[8][8];

		arrayAjedrez[0][0] = 'T';
		arrayAjedrez[0][1] = 'C';
		arrayAjedrez[0][2] = 'A';
		arrayAjedrez[0][3] = 'R';
		arrayAjedrez[0][4] = 'R';
		arrayAjedrez[0][5] = 'A';
		arrayAjedrez[0][6] = 'C';
		arrayAjedrez[0][7] = 'T';

		arrayAjedrez[1][0] = 'P';
		arrayAjedrez[1][1] = 'P';
		arrayAjedrez[1][2] = 'P';
		arrayAjedrez[1][3] = 'P';
		arrayAjedrez[1][4] = 'P';
		arrayAjedrez[1][5] = 'P';
		arrayAjedrez[1][6] = 'P';
		arrayAjedrez[1][7] = 'P';

		for (int i = 2; i < 6; i++) {
			for (int j = 0; j < 8; j++) {
				arrayAjedrez[i][j] = '*';
			}
		}

		arrayAjedrez[6][0] = 'P';
		arrayAjedrez[6][1] = 'P';
		arrayAjedrez[6][2] = 'P';
		arrayAjedrez[6][3] = 'P';
		arrayAjedrez[6][4] = 'P';
		arrayAjedrez[6][5] = 'P';
		arrayAjedrez[6][6] = 'P';
		arrayAjedrez[6][7] = 'P';

		arrayAjedrez[7][0] = 'T';
		arrayAjedrez[7][1] = 'C';
		arrayAjedrez[7][2] = 'A';
		arrayAjedrez[7][3] = 'R';
		arrayAjedrez[7][4] = 'R';
		arrayAjedrez[7][5] = 'A';
		arrayAjedrez[7][6] = 'C';
		arrayAjedrez[7][7] = 'T';

		moverPeon(arrayAjedrez);

	}

	public static void imprimeArray(char[][] arrayAjedrez) {
		for (char[] fila : arrayAjedrez) {
			System.out.println();
			for (char elemento : fila) {
				System.out.print(elemento + " ");

			}
		}
	}

	public static void moverPeon(char[][] arrayAjedrez) {
		boolean stop = false;
		imprimeArray(arrayAjedrez);
		System.out.println();

		while (!stop) {

			System.out.println("Introduce la fila del peon que quieres mover");
			int posicionX = entrada.nextInt();
			System.out.println("Introduce el peon que quieres mover (0-7)");
			int posicionY = entrada.nextInt();

			if (posicionX >= 0 && posicionY >= 0) {

				if (arrayAjedrez[posicionX][posicionY] == 'P') {
					System.out.println("Introduce a que fila quieres mover el peon (max 2 filas)");
					int x = entrada.nextInt();
					int y = posicionY;
					if (posicionX < 2 && posicionY < 2) {
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
			imprimeArray(arrayAjedrez);
			System.out.println();

		}

	}

}
