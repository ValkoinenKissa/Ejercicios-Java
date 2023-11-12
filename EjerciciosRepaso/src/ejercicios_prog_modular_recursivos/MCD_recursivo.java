package ejercicios_prog_modular_recursivos;
import java.util.*;
public class MCD_recursivo {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[]args) {
		System.out.println("Introduce el primer numero: ");
		int num1 = introEntero();
		System.out.println("Introduce el segundo numero: ");
		int num2 = introEntero();
		int resultado = calcMCD(num1, num2);
		printResults(num1, num2, resultado);
	}
	
	/////////////////////////////////////////////////////
	
	public static int introNum1() {
		int num1 = entrada.nextInt();
		
		return num1;
	}
	
	
	///////////////////////////////////////////////////////////////
	
	public static int introEntero() {
		
		return entrada.nextInt();
	}
	
	
	
	////////////////////////////////////////////////////////////////
	
	public static int calcMCD(int num1, int num2) {
		
		if(num1 == num2) {
			
			return num1;
		}
		
		else if(num1 > num2) {
			return calcMCD(num2, num1 - num2);
		}
		
		else {
			return calcMCD(num1, num2 - num1);
		}
		
		
		

		
		

	}
	
	
	////////////////////////////////////////////////////////////////////
	
	public static void printResults(int num1, int num2, int resultado) {
		System.out.println("El MCD de " + num1 + " y " + num2 + " es " + resultado);
	}

}