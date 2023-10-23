package programacion_modular;
import java.util.Scanner;

public class Potencia {
	
	public static void main(String[] args) {
		//Introducir base y exponente
		System.out.println("Introduce la base: ");
		int base = introEntero();
		System.out.println("Introduce el exponente: ");
		int exponente = introEntero();
		//Calculamos la potencia
		long resultado = potencia(base, exponente); 
		//Imprimimos el resultado por pantalla
		System.out.println("El resultado de " + base + " Elevado a " + exponente + " es " + resultado);
		
	}
	
	///////////////////////////////////////////////////
	
	public static int introEntero() {
		//Declaramos objeto scanner
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt();
		
	}
	
	///////////////////////////////////////////////////
	
	public static long potencia(int base, int exponente) {
		
		long acum = 1;
		
		for(int i = 1; i<= exponente; i++) {
			acum = acum * base;
		}
		return acum;
	}

}
