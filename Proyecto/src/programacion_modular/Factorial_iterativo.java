package programacion_modular;
import java.util.Scanner;

public class Factorial_iterativo {
	
	public static void main(String[] args) {
		
		// Introducimos un numero
		int numero = introNumero();
		long fact = factorial(numero);
		//Enviamos a pantalla el resultado
		verResultado(numero, fact);
	}
	
	///////////////////////////////////////////////////////
	public static int introNumero() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		return entrada.nextInt();
	}
	
	//////////////////////////////////////////////////////
	
	public static long factorial(int numero) {
		long fact = 1;
		for (int i = numero; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
		
	}
	
	/////////////////////////////////////////////////////
	public static void verResultado(int numero, long fact) {
		System.out.println("Factorial de " + numero + " es " + fact);
	}
	

}
