package ejercicios_prog_modular_recursivos;
import java.util.*;

public class Factorial_recursivo {
	
	
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num = introNum();
		int factorial = calclFactorial(num);
		printResults(factorial, num);
		
		
		
	}
	
	////////////////////////////////////////////////////
	
	public static int introNum() {
		System.out.println("Introduce un numero entero para calcular su factorial: ");
		int num = entrada.nextInt();
		
		return num;
	}
	
	
	//////////////////////////////////////////////////////////////////////
	
	public static int calclFactorial(int num) {
		if(num == 0)
			return 1;
		
		int factorial = num * calclFactorial(num -1);
		
		return factorial;
		
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public static void printResults(int factorial, int num) {
		System.out.println("El factorial de " + num + " es " + factorial);
	}
	
}
