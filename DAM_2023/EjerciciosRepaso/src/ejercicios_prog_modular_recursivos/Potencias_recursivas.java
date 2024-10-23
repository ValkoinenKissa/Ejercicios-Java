package ejercicios_prog_modular_recursivos;

import java.util.Scanner;
public class Potencias_recursivas {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce una base y un exponente para calcular su potencia: ");
		System.out.println();
		int numBase = introBase();
		int numExponente = introExponente();
		int potencia = calculoPotencia(numBase, numExponente);
		printResults(numBase, numExponente, potencia);

		
		

	}
	
	////////////////////////////////////////////////////////////
	
	public static int introBase() {
		System.out.println("Introduce la base: ");
		int base = entrada.nextInt();
		
		return base;
	}
	
	///////////////////////////////////////////////////////////////
	
	public static int introExponente() {
		System.out.println("Introduce el exponente: ");
		int exponente = entrada.nextInt();
		
		return exponente;
		
		
	}
	
	////////////////////////////////////////////////////////////////
	
	public static int calculoPotencia(int base, int exponente) {
		if (exponente == 0) {
			return 1;
		}
		return base * calculoPotencia(base, exponente -1);
		
	}
	
	
	//////////////////////////////////////////////////////////////////////
	
	public static void printResults(int base, int exponente, int result) {
		System.out.println("La potencia  de " + base + " elevado a " + exponente + " es " + result);
		
	}
	
}