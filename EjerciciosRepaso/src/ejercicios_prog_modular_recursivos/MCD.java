package ejercicios_prog_modular_recursivos;
import java.util.*;
public class MCD {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[]args) {
		int num1 = introNum1();
		int num2 = introNum2();
		int mcd = calcMCD(num1, num2);
		printResults(num1, num2, mcd);
	}
	
	/////////////////////////////////////////////////////
	
	public static int introNum1() {
		System.out.println("Introduce el primer numero: ");
		int num1 = entrada.nextInt();
		
		return num1;
	}
	
	
	///////////////////////////////////////////////////////////////
	
	public static int introNum2() {
		System.out.println("Introduce el segundo numero: ");
		int num2 = entrada.nextInt();
		
		return num2;
	}
	
	
	
	////////////////////////////////////////////////////////////////
	
	public static int calcMCD(int num1, int num2) {
		
		while(num1 != num2) {
			if(num1 > num2) {
			num1 = num1 - num2;
			}
			
			else {
				num2 = num2 - num1;
			}
			
		}
		int resultado = num1;
		return resultado;

	}
	
	
	////////////////////////////////////////////////////////////////////
	
	public static void printResults(int num1, int num2, int resultado) {
		System.out.println("El MCD de " + num1 + " y " + num2 + " es " + resultado);
	}

}
