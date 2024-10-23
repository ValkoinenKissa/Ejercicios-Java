package estructuras_control_flujo;
import java.util.*;
/*
 * que visualice en pantalla el
 * factorial de un número.
 */

public class Factorial {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		double numero = introNumero();
		double calc = calcFactorial(numero);
		imprimeResultados(numero, calc);
		
	}
	
	public static double introNumero() {
		System.out.println("Introduce un numero para poder calcular su factorial: ");
		double num = entrada.nextDouble();
		
		return num;
	}
	
	
	public static double calcFactorial(double num) {
		double acum=1;
		for(double i=1; i <= num; i++) {
			
			acum*= i;
			
		}
		
		return acum;
	}
	
	
	public static void imprimeResultados(double num, double acum) {
		
		System.out.println("El resultado del factorial de " + num + " es " + acum);
		
	}

}
