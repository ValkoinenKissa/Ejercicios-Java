package primer_trimestre;
import java.util.*;
public class Factorial_recursivo {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int numFactorial = pedirNumero();
		int calcFactorial = calcularFactorial(numFactorial);
		printResults(numFactorial, calcFactorial);

	}
	
	
	public static int pedirNumero() {
		System.out.println("Introduce un numero para calcular el factorial: ");
		int numero = entrada.nextInt();
		return numero;
		
	}
	
	
	public static int calcularFactorial(int numero) {
		if(numero == 0) {
			return 1;
		}
		
		return numero * calcularFactorial(numero -1);
		
	}
	
	
	public static void printResults(int numero, int acum) {
		System.out.println("El factorial de " + numero + " es " + acum);
	}

}
