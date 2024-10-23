package ejercicios_prog_modular_recursivos;
import java.util.*;
public class Factorial {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[]args) {
		int num = introNum();
		int factorial = calcFactorial(num);
		printResults(factorial, num);
	}
	
	/////////////////////////////////////////////////////
	
	public static int introNum() {
		System.out.println("Introduce un numero entero para calcular su factorial: ");
		int num = entrada.nextInt();
		
		return num;
	}
	
	
	////////////////////////////////////////////////////////////////
	
	public static int calcFactorial(int num) {
		int acum =1;
		
		for(int i =1; i <= num; i++) {
			acum *= i;
		}
		
		return acum;
	}
	
	
	////////////////////////////////////////////////////////////////////
	
	public static void printResults(int acum, int num) {
		System.out.println("El factorial de " + num + " es " + acum);
	}

}
