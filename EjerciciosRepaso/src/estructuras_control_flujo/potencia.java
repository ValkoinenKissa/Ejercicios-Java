package estructuras_control_flujo;
/*
 * que visualice en pantalla la
 * potencia de un una base elevada al un exponente
 */
import java.util.*;
public class potencia {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int base = introBase();
		int exponente = introExponente();
		int calculo = calculoPotencia(base, exponente);
		imprimeResult(calculo);

	}
	
	public static int introBase() {
		System.out.println("Introduce una base: ");
		int base = entrada.nextInt();
		return base;
	}
	
	
	/////////////////////////////////////////////
	
	public static int introExponente() {
		System.out.println("Introduce el exponente: ");
		int exponente = entrada.nextInt();
		return exponente;
	}
	
	public static int calculoPotencia(int base, int exponente) {
		int result=1;
		for(int i = 0; i < exponente; i++) {
			result *= base;
		}
		return result;
		
	}
	
	
	public static void imprimeResult(int result) {
		System.out.println("El resultado de la potencia es: " + result);
	}

}
