package array;

import java.util.Random;

public class PoblarMatriz {
	
	public static void main(String [] args) {
		Random generador = new Random();
		int numAleatorio;
		numAleatorio = generador.nextInt(1, 9 +1) + 1;
		
		int [][] matriz = new int [3][3];
		
		
		for(int i =0; i <matriz.length; i++) {
			for(int j=0; j < i; j++) {
				matriz[i][j] = numAleatorio;
			}
		}
		
		int sumMatriz = sumarMatriz(matriz);
		
		imprimir(matriz);
		
		System.out.println("La suma de la matriz es: " + sumMatriz);
		
		
	}
	
	public static int sumarMatriz(int [][] matriz) {
		int acum =0;
		
		for(int i =0; i<matriz.length; i++) {
			for(int j =0; j < matriz[i].length; j++) {
				acum += matriz[i][j];
			}
		}
		return acum;
		
	}
	
	public static void imprimir(int [][] matriz) {
		
		for(int i =0; i<matriz.length; i++) {
			for(int j =0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j] + " ");
			}
		}
		System.out.println();
				
	}
	

}
