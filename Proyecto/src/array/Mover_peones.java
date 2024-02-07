package array;

public class Mover_peones {
	public static void main(String[] args) {

		char[][] arrayAjedrez = new char[8][8];

		arrayAjedrez = crearAjedrez();

		CrearTablero(arrayAjedrez);

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
	      char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
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
	}
