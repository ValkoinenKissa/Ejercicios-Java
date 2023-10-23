package programacion_modular;

import java.util.Scanner;

public class MCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce el primer numero para calcular el mcd: ");
		int num1 = introEntero();
		System.out.println("Introduce el segundo numero para calcular el mcd ");

	}
	
	///////////////////////////////////////////////////////////////////////////
	
	public static int introEntero() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	

}
