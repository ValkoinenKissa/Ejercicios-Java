package array;

public class Tablero_Ajedrez {

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
		
		
		for(int i = 2; i< 6; i++) {
			for(int j = 0; j< 8; j++) {
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
		


		
		imprimeArray(arrayAjedrez);


	}
	
	
	
	public static void imprimeArray(char[][]arrayAjedrez) {
		for(char[] fila : arrayAjedrez) {
			System.out.println();
			for (char elemento : fila) {
				System.out.print(elemento + " ");

			}
		}
	}

}
