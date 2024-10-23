package ejercicios_prog_modular_recursivos;

import java.util.Scanner;

public class Combinaciones 
	{
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int m = pedirM();
		int n = pedirN(m);
		int combinacion = calcularCombinacion(m, n);
		verResultado(m, n, combinacion);
	}
	////////////////////////////////////////////////////
	/*otra solucion de pedir m
	 * public static int pedirM() {
		int m;
		do {
			System.out.println("Introduce un número m mayor o igual que 0");
			m = entrada.nextInt();
		}while(m < 0);
		return m;
	}
	 */
	////////////////////////////////////////
	
	public static int pedirM() {
		boolean mValida;
		int m;
		System.out.println("Introduce un número m mayor o igual que 0");
		do {
			m = entrada.nextInt();
			//comprobamos si es valida
			mValida = (m>=0);
			if(!mValida) {
				System.out.println("ERROR");
			}
		}while(!mValida);
		return m;
	}
	////////////////////////////////////////
	
	/*Otra solucion de pedir n
	 * 
	 * public static int pedirN(int m) {
		int n;
		do {
			System.out.println("Introduce un número n mayor o igual que 0 y menor o igual que m");
			n = entrada.nextInt();
			if(n < 0 || m<n) {
				System.out.print("ERROR.");
			}
		}while(n < 0 || m<n);
		return n;
	}*/
	////////////////////////////////////////
	public static int pedirN(int m) {
		boolean nValida;
		int n;
		System.out.println("Introduce un número n mayor o igual que 0 y menor o igual que m");
		do {
			n = entrada.nextInt();
			//comprobamos cuando es valida
			nValida = (n>=0 && n<=m);
			if(!nValida) {
				System.out.print("ERROR. Introduce un número n mayor o igual que 0 y menor o igual que m");
			}
		}while(!nValida);
		return n;
	}
	///////////////////////////////////////////////
	public static int calcularFactorial(int numero){
		if(numero == 0) {
			return 1;
		}else {
			return numero * calcularFactorial(numero-1);
		}
	}
	////////////////////////////////////////

	public static int calcularCombinacion(int m, int n) {
		return calcularFactorial(m)/(calcularFactorial(n)*calcularFactorial(m-n));
	}
	////////////////////////////////////////

	public static void verResultado(int m, int n, int combinacion) {
		System.out.println("La combinaciones de " + m + " sobre " + n +
				" es " + combinacion);

	}
	

}