package array;

import java.util.Scanner;

public class Introducir_datos {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] matriz = {{1,2,3}, {4, 5, 6}, {7,8,9}};
		
		sumarPosiciones(matriz);

	}
	
	public static void sumarPosiciones(int [][] matriz) {
		
		System.out.println("Estos son los valores actuales de la matriz: ");
		
		for(int i =0; i<matriz.length; i++) {
			for(int j =0; j < matriz[i].length; j++) {
				System.out.print("[" + matriz[i][j] + "]");
			}
			System.out.println();
		}
		
		System.out.println("Selecciona las posicion de la fila y columna que quieres editar, los valores se sumarán: ");
		System.out.println("Introduce la fila: ");
		int selectFila = entrada.nextInt();
		System.out.println("Introduce la columna: ");
		int selectColumn = entrada.nextInt();
		
		System.out.println("Introduce el valor que quieres introducir: ");
		int newValue = entrada.nextInt();
		
		matriz[selectFila][selectColumn] = newValue + matriz[selectFila][selectColumn];
		
		
		System.out.println("Esta es la nueva matriz: ");
		
		
		for(int i =0; i<matriz.length; i++) {
			for(int j =0; j < matriz[i].length; j++) {
				System.out.print("[" + matriz[i][j] + "]");
			}
			System.out.println();
		}
		
}
	
}
