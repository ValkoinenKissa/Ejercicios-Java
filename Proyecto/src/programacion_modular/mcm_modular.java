package programacion_modular;
import java.util.*;
public class mcm_modular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = introNum1();
		int num2 = introNum2();
		int resultado =mcd(num1, num2);
		imprimeResult(num1, num2, resultado);

	}
	
	////////////////////////////////////////////////////
	public static int introNum1() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero entero: ");
		return entrada.nextInt();
	}
	
	///////////////////////////////////////////////////
	
	public static int introNum2() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero entero: ");
		return entrada.nextInt();
	}
	
	///////////////////////////////////////////////////
	public static int mcd(int num1, int num2) {
		if(num1 == num2)
			return num1;
		else if(num1>num2)
			return mcd(num1 - num2, num2);
		else
			return mcd(num1, num2 - num1);
	}
	
	
	//////////////////////////////////////////////////
	
	public static void imprimeResult(int num1, int num2, int resultado) {
		System.out.println("El mcm de " + num1 +  " y " + num2 + " es " + resultado);
	}
}
