package array;

import java.util.Scanner;

public class Introducir_datos {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] matriz = {{0,0,0}, {0, 0, 0}, {0,0,0}};
		boolean stop = false;
		
		while (!stop) {
			
			System.out.println("Selecciona S si quieres seguir sumando posiciones, lo contrario pulsa N ");
			String valor = entrada.nextLine().toUpperCase();			
			if (valor.equals("N")) {
				
				stop = true;
				
			}
			
			else if(valor.equals("S")) {
				sumarPosiciones(matriz);

			}
			
			else {
				System.err.println("Por favor introduce una S o una N.");
			}
		
		}
		
		System.out.println("Has abandonado el programa correctamente..");

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
		
		
	    entrada.nextLine();
		
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
