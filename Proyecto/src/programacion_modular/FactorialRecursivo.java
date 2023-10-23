package programacion_modular;
import java.util.Scanner;

public class FactorialRecursivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = pedirNum();
		int resultado =factorial(num);
		imprimir(num, resultado);

	}
	
	//////////////////////////////////////////////////////////
	
	public static int pedirNum() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		return entrada.nextInt();
	}
	
	//////////////////////////////////////////////////////////
	
	public static int factorial(int num) {
		
		if (num == 0)
			return 1;
		return num * factorial(num -1);
		
	}
	
	/////////////////////////////////////////////////////////
	
	public static void imprimir(int num, int resultado) {
		System.out.println("El factorial de " + num + "es " + resultado);
	}

}
